package top.wangcj.chapter01架构师内功心法.chapter05委派模式.mvcDelegate;

import top.wangcj.chapter01架构师内功心法.chapter05委派模式.mvcDelegate.controller.InfoController;
import top.wangcj.chapter01架构师内功心法.chapter05委派模式.mvcDelegate.controller.OrderController;
import top.wangcj.chapter01架构师内功心法.chapter05委派模式.mvcDelegate.controller.CourseController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 模拟实现SpringMVC中的DispatchServlet
 */
public class DispatchServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成调度任务
        doDispatch(req, resp);
    }

    /**
     * 根据用户不同的请求地址，调用不同的Controller处理
     * http://www.gupao.com/getInfo.do?userId=10
     * http://www.gupao.com/getOrderInfo.do?userId=10
     * http://www.gupao.com/getCourse.do?userId=10
     *
     * @param req
     * @param resp
     */
    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        String userId = req.getParameter("userId");
        if ("getInfo".equals(uri)) {
            new InfoController().getInfo(userId);
        } else if ("getOrderInfo".equals(uri)) {
            new OrderController().getOrder(userId);
        } else if ("getCourse".equals(uri)) {
            new CourseController().getCourse(userId);
        }
    }
}
