package com.alilbaba.domain.customer.gateway;

import com.alilbaba.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
