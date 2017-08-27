package com.example.config.log;

import com.alibaba.druid.support.json.JSONUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by think on 2017/8/27.
 */
@Aspect   //定义一个切面
@Configuration
public class LogRecordAspect {
    private  Logger logger = LoggerFactory.getLogger(this.getClass());

    // 定义切点Pointcut
    @Pointcut("execution(public * com.example.controller..*.*(..))")
    public void excudeService() {
    }

    @Around("excudeService()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        HttpServletResponse response = sra.getResponse();

//        String url = request.getRequestURL().toString();
//        String method = request.getMethod();
//        String uri = request.getRequestURI();
//        String queryString = request.getQueryString();

        logger.info("..............................请求开始..............................");

        logger.info("请求时间 : "+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());

        logger.info("请求URL : " + request.getRequestURL().toString());

        logger.info("请求参数 : " + Arrays.toString(pjp.getArgs()));

        //logger.info("请求URI : " + request.getRequestURI().toString());

        logger.info("请求方式 : " + request.getMethod());

        logger.info("请求IP地址 : " + request.getRemoteAddr());

        logger.info("请求对应执行controller方法的全路径 : " + pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());


        // result的值就是被拦截方法的返回值
        Object result = pjp.proceed();
        if(result instanceof String){

            logger.info("controller跳转的view是 : " + "resources/static/"+result+".html");
        }else {

            logger.info("controller的返回json值是 : " + new Gson().toJson(result));
        }
        logger.info("响应状态码 : "+ response.getStatus());
        logger.info("..............................请求结束..............................");
        return result;
    }
}