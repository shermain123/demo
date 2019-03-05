package com.cn.bo.mapper.customer;

import com.cn.bo.domain.customer.Customer;
import java.util.List;
import java.util.Map;

/**
 * Created by sher on 2019/3/1.
 */
public interface CustomerMapper {

    List<Customer> getList(Map<String,Object> map);
}
