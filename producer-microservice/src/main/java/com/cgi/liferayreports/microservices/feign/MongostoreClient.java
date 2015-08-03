package com.cgi.liferayreports.microservices.feign;

import com.cgi.liferayreports.microservices.PageView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient("mongostore")
public interface MongostoreClient {

    @RequestMapping(method = RequestMethod.POST, value = "/pageViews",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    void create(@RequestBody Message message);
}