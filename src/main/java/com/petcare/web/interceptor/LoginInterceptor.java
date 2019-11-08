package com.petcare.web.interceptor;

import com.petcare.web.domain.Member;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Member member = (Member) modelAndView.getModel().get("member");

        if(member != null) {
            HttpSession session = request.getSession();
            session.setAttribute("username", member.getUsername());
        }

    }
}
