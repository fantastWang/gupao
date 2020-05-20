package top.wangcj.chapter01架构师内功心法.chapter04代理模式.dynamicProxy.wcjProxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/30 17:23
 */
public class WCJClassLoader extends ClassLoader {

    private File classPathFile;

    public WCJClassLoader() {
        String classPath = WCJClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) {
        String className = WCJClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile,
                    name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in;
                ByteArrayOutputStream out;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff, 0, len);
                    }

                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
