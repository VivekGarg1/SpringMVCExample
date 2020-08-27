package com.home.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*public class ServletInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		
		AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
		applicationContext.register(WebConfig.class);
		applicationContext.setServletContext(context);
		Dynamic dynamic = context.addServlet("dispatcher", new DispatcherServlet(applicationContext));
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/");

	}

}*/

//Secon way
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}

