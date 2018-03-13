package com.godfkc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；
 * 并且向程序的ioc注入一个bean: restTemplate;
 * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
 */

/**
 * 在程序的启动类ServiceRibbonApplication 加@EnableHystrix注解开启Hystrix：熔断器
 */

/**
 * Hystrix Dashboard (断路器：Hystrix 仪表盘)
 * 基于service-ribbon 改造，Feign的改造和这一样。
 * 在主程序启动类中加入@EnableHystrixDashboard注解，开启hystrixDashboard
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	/**
	 *负载均衡
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
