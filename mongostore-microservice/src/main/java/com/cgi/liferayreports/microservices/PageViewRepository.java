package com.cgi.liferayreports.microservices;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface PageViewRepository extends MongoRepository<PageView, Long> {

}
