package com.cn.bo.service.customer.impl;

import com.cn.bo.domain.customer.Customer;
import com.cn.bo.mapper.customer.CustomerMapper;
import com.cn.bo.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by sher on 2019/3/4.
 */
@Service("customerServer")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getList(Map<String, Object> map) {
        return customerMapper.getList(map);
    }
}
