package com.nataandporterinc.Controllers;

import com.nataandporterinc.services.CustomerRepository;
import com.nataandporterinc.services.EmployeeRepository;
import com.nataandporterinc.services.OrderRepository;
import com.nataandporterinc.services.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * Created by jeffryporter on 12/7/16.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController
{
    @Autowired
    CustomerRepository customers;

    @Autowired
    EmployeeRepository employees;

    @Autowired
    OrderRepository orders;

    @Autowired
    ProductRepository products;



}
