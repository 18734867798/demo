package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Configuration
//    static class WebMvcConfigurer extends WebMvcConfigurerAdapter {
//        //log
//        private Logger logger= LoggerFactory.getLogger(this.getClass());
//
//
//        public void addInterceptors(InterceptorRegistry registry) {
//            registry.addInterceptor(new HandlerInterceptorAdapter() {
//
//                @Override
//                public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
//                                         Object handler) throws Exception {
//                    request.getContextPath();
//                    //System.out.println("interceptor====");
//                    String requestUrl = request.getRequestURL().toString();//得到请求的URL地址
//                    String requestUri = request.getRequestURI();//得到请求的资源
//                    String queryString = request.getQueryString();//得到请求的URL地址中附带的参数
//                    String remoteAddr = request.getRemoteAddr();//得到来访者的IP地址
//                    String remoteHost = request.getRemoteHost();
//                    int remotePort = request.getRemotePort();
//                    String remoteUser = request.getRemoteUser();
//                    String method = request.getMethod();//得到请求URL地址时使用的方法
//                    String pathInfo = request.getPathInfo();
//                    String localAddr = request.getLocalAddr();//获取WEB服务器的IP地址
//                    String localName = request.getLocalName();//获取WEB服务器的主机名
//                    logger.info("请求URL："+requestUrl+" 请求方法： "+method+" 请求参数：");
 //                   response.setCharacterEncoding("UTF-8");//设置将字符以"UTF-8"编码输出到客户端浏览器
                    //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
//                    response.setHeader("content-type", "text/html;charset=UTF-8");
//                    PrintWriter out = response.getWriter();
//                    out.write("获取到的客户机信息如下：");
//                    out.write("<hr/>");
//                    out.write("请求的URL地址：" + requestUrl);
//                    out.write("<br/>");
//                    out.write("请求的资源：" + requestUri);
//                    out.write("<br/>");
//                    out.write("请求的URL地址中附带的参数：" + queryString);
//                    out.write("<br/>");
//                    out.write("来访者的IP地址：" + remoteAddr);
//                    out.write("<br/>");
//                    out.write("来访者的主机名：" + remoteHost);
//                    out.write("<br/>");
//                    out.write("使用的端口号：" + remotePort);
//                    out.write("<br/>");
//                    out.write("remoteUser：" + remoteUser);
//                    out.write("<br/>");
//                    out.write("请求使用的方法：" + method);
//                    out.write("<br/>");
//                    out.write("pathInfo：" + pathInfo);
//                    out.write("<br/>");
//                    out.write("localAddr：" + localAddr);
//                    out.write("<br/>");
//                    out.write("localName：" + localName);
//                    return true;
//                }
//            }).addPathPatterns("/*");
//        }
//    }


}
