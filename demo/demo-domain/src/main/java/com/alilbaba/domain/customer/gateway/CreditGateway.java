package com.alilbaba.domain.customer.gateway;

import com.alilbaba.domain.customer.Customer;
import com.alilbaba.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
