package org.eop.spring.boot.servlet.scan;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//该类通过@Configuration类中的@ServletComponentScan扫描进行注册
@WebServlet
public class MyServlet2 implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {

	}

}
