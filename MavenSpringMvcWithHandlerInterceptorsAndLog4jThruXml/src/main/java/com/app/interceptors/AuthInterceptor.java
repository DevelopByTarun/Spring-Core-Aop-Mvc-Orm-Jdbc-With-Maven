package com.app.interceptors;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

public class AuthInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = Logger.getLogger("AuthInterceptor");

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info(" Pre handle ");
        if(httpServletRequest.getMethod().equals("GET"))
            return true;
        else
            return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info(" Post handle ");
        if(modelAndView.getModelMap().containsKey("status")){
            String status = (String) modelAndView.getModelMap().get("status");
            if(status.equals("SUCCESS!")){
                status = "Authentication " + status;
                modelAndView.getModelMap().put("status",status);
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info(" After Completion ");
    }
}
