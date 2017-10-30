package com.xohaa.cjx.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chenjianxiong on 2017/10/30.
 * 异常输出
 */
@ControllerAdvice
public class ExptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("e",e);
        mv.addObject("uri",req.getRequestURI());
        return mv;
    }
}
