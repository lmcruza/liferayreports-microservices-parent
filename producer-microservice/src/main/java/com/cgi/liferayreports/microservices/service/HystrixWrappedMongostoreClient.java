package com.cgi.liferayreports.microservices.service;

import com.cgi.liferayreports.microservices.domain.PageView;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.cgi.liferayreports.microservices.feign.MongostoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("hystrixMongostoreClient")
public class HystrixWrappedMongostoreClient implements MongostoreClient {

    @Autowired
    @Qualifier("mongostoreClient")
    private MongostoreClient mongostoreClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallBackCall")
    public PageView create(PageView pageView) {
        return this.mongostoreClient.create(pageView);
    }

    public PageView fallBackCall(PageView pageView) {
        PageView fallback = new PageView();
        return fallback;
    }
}
