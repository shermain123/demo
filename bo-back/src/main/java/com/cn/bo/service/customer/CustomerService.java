package com.cn.bo.service.customer;

import com.cn.bo.domain.customer.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by sher on 2019/3/4.
 */
public interface CustomerService {

    List<Customer> getList(Map<String,Object> map);
}
