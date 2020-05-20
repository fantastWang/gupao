package top.wangcj.chapter01架构师内功心法.chapter05委派模式.mvcDelegate;

import top.wangcj.chapter01架构师内功心法.chapter05委派模式.mvcDelegate.controller.InfoController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 简易版DispatchServlet，主要讲述了spring中的一些调度思想
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/26 11:48
 */
public class SimpleDispatchServlet extends HttpServlet {

    /**
     * 初始化容器：用于将请求url和对应controller绑定
     */
    private static List<Hander> list = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.service(req, resp);
    }

    @Override
    public void init() {
        try {
            //反射得到对象，将类中的方法，参数应用初始化时绑定
            Class<InfoController> infoControllerClass = InfoController.class;
            list.add(new Hander().setController(infoControllerClass)
                    .setMethod(infoControllerClass.getMethod("getInfo", new Class[]{String.class}))
                    .setUrl("/userId"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        doDispatchServlet(req, resp);
    }

    private void doDispatchServlet(HttpServletRequest req, HttpServletResponse resp) {
        //获取请求的url
        String uri = req.getRequestURI();
        Hander h = null;
        //将容器中的请求和客户请求地址比对，寻找具体方法，有就直接返回，没有就返回404
        for (Hander hander : list) {
            if (uri.equals(hander.getUrl())) {
                h = hander;
                break;
            }
        }
        try {
            if (h != null) {
                //通过反射调用方法
                Object invoke = h.getMethod().invoke(h.getController(), req.getParameter("mid"));
                resp.getWriter().write(invoke.toString());
            } else {
                resp.getWriter().write("404 Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }

    /**
     * 可以使用内部类，也可以新建一个类
     */
    class Hander {
        private Object Controller;
        private Method method;
        private String url;

        public Object getController() {
            return Controller;
        }
        public Hander setController(Object controller) {
            Controller = controller;
            return this;
        }
        public Method getMethod() {
            return method;
        }
        public Hander setMethod(Method method) {
            this.method = method;
            return this;
        }
        public String getUrl() {
            return url;
        }
        public Hander setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
