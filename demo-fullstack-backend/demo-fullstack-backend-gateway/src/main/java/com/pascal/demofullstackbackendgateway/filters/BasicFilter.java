package com.pascal.demofullstackbackendgateway.filters;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class BasicFilter extends ZuulFilter{

	private static Logger log = LoggerFactory.getLogger(BasicFilter.class);
	
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();

	    //we log the HTTP method and URL of the request before it is sent on its way.
	    log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

	    return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		 return "pre";
	}

}
