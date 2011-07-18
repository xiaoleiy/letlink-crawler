package com.letlink.common.service;

import javax.servlet.ServletContextEvent;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.google.inject.struts2.Struts2GuicePluginModule;

public class MyGuiceServletContextListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		GuiceDebug.enable();
		return Guice.createInjector(
				new Struts2GuicePluginModule(),
				new ServletModule() {
					@Override
					protected void configureServlets() {
						// Struts 2 setup
						bind(StrutsPrepareAndExecuteFilter.class).in(
								Singleton.class);
						filter("/*").through(
								StrutsPrepareAndExecuteFilter.class);
						//bind(DomainServlet.class).in(Singleton.class);
						//bind(Login.class).in(Singleton.class);
					}
				}, new MyGuiceModule());
	}
	
	
	public void contextInitialized(ServletContextEvent ctxEvent){
		//TODO set context attributes
		super.contextInitialized(ctxEvent);
		System.out.println("");
	}
	
	public void contextDestoryed(ServletContextEvent ctxEvent){
		//TODO remove context attributes
		super.contextDestroyed(ctxEvent);
	}

}