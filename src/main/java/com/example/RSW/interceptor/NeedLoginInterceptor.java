package com.example.RSW.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.RSW.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class NeedLoginInterceptor implements HandlerInterceptor {

	@Autowired
	private Rq rq;

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {

//		Rq rq = (Rq) req.getAttribute("rq");

		if (!rq.isLogined()) {

			rq.printHistoryBack("로그인이 필요합니다.(NeedLoginInterceptor)");

			return false;
		}

		return HandlerInterceptor.super.preHandle(req, resp, handler);
	}
}