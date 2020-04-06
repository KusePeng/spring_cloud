package com.test.cloud.controller;

import com.test.cloud.entities.Dept;
import com.test.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableEurekaClient
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return this.service.add(dept);
    }

}
