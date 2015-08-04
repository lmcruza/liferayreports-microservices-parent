package com.cgi.liferayreports.microservices.controller;

import com.cgi.liferayreports.microservices.domain.PageView;
import com.cgi.liferayreports.microservices.feign.MongostoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    @Qualifier("hystrixMongostoreClient")
    private MongostoreClient mongostoreClient;

    @RequestMapping("/report")
    public PageView create(@RequestBody PageView pageView) {
        return this.mongostoreClient.create(pageView);
    }
}
