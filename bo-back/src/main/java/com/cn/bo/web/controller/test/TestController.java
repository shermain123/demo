package com.cn.bo.web.controller.test;

import com.cn.bo.domain.customer.Customer;
import com.cn.bo.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sher on 2019/3/4.
 */
@RestController
public class TestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/getList")
    public List<Customer> getList(){

        return customerService.getList(null);
    }
}
