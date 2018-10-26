package com.cts.microservices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.cts.microservices.filters.ErrorFilter;
import com.cts.microservices.filters.PostFilter;
import com.cts.microservices.filters.PreFilter;
import com.cts.microservices.filters.RouteFilter;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;

import brave.sampler.Sampler;



@Component
public class ZuulConfig {
	
	IRule rule() {
//		return new RoundRobinRule(); // Default Rule
//		return new WeightedResponseTimeRule();
		return new AvailabilityFilteringRule();
	}
	
	@Bean 
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
