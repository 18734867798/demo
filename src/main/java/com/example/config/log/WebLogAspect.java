//package com.example.config.log;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Enumeration;
//
///**
// * Created by git on 2017/8/18.
// */
//@Aspect
//
//@Component
//
//@Order(-5)
//public class WebLogAspect {
//    private Logger logger =  LoggerFactory.getLogger(this.getClass());
//
//    /**
//
//     * 定义一个切入点.
//
//     * 解释下：
//
//     * ~ 第一个 * 代表任意修饰符及任意返回值.
//
//     * ~ 第二个 * 任意包名
//
//     * ~ 第三个 * 代表任意方法.
//
//     * ~ 第四个 * 定义在web包或者子包
//
//     * ~ 第五个 * 任意方法
//
//     * ~ .. 匹配任意数量的参数.
//
//     */
//
//    @Pointcut("execution(public * com.example.controller..*.*(..))")
//
//    public void webLog(){}
//
//
//
//    @Before("webLog()")
//
//    public void doBefore(JoinPoint joinPoint){
//
//
//        // 接收到请求，记录请求内容
//
//        logger.info("WebLogAspect.doBefore()");
//
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//
//        HttpServletRequest request = attributes.getRequest();
//        HttpServletResponse response = attributes.getResponse();
//
//
//        // 记录下请求内容
//
////        logger.info("URL : " + request.getRequestURL().toString());
////
////        logger.info("HTTP_METHOD : " + request.getMethod());
////
////        logger.info("IP : " + request.getRemoteAddr());
////
////        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
////
////        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
////
////        logger.info("REQUEST_TIME:"+ new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()).toString());
//
//
//        logger.info("请求URL : " + request.getRequestURL().toString());
//
//        logger.info("请求方式 : " + request.getMethod());
//
//        logger.info("IP : " + request.getRemoteAddr());
//
//        logger.info("请求对应执行controller方法的全路径 : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//
//        logger.info("请求参数 : " + Arrays.toString(joinPoint.getArgs()));
//
//        logger.info("请求时间 : "+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());
//
//        logger.info("响应状态码 : "+ response.getStatus());
//
//        //logger.info("响应内容:"+joinPoint.);
//
//        //获取所有参数方法一：
//
//        Enumeration<String> enu=request.getParameterNames();
//
//        while(enu.hasMoreElements()){
//
//            String paraName=(String)enu.nextElement();
//
//            System.out.println(paraName+": "+request.getParameter(paraName));
//
//        }
//
//    }
//
//    @AfterReturning("webLog()")
//
//    public void  doAfterReturning(JoinPoint joinPoint){
//
//        // 处理完请求，返回内容
//
//        logger.info("WebLogAspect.doAfterReturning()");
//
//    }
//}
