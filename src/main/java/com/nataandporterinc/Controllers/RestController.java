package com.nataandporterinc.Controllers;

import com.nataandporterinc.entities.Customer;
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

    //***************************************************************************************
    //
    //               Customer Routes
    //
    //***************************************************************************************

    @RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
    public Iterable<Customer> getCustomer(@PathVariable("id") String region, @PathVariable("level") Enum level)
    {
        return customers.findPoliticianByLevelAndRegion(level, region);
    }

    @RequestMapping(path = "/politician", method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Politician politician)
    {
        politicians.save(politician);
        return politician;
    }

    @RequestMapping(path = "/politician", method = RequestMethod.PUT)
    public Customer editCustomer(@RequestBody Politician politician)
    {
        politicians.save(politician);
        return politician;
    }

    @RequestMapping(path = "/politician/{id}", method = RequestMethod.DELETE)
    public Customer deleteCustomer(@PathVariable("id") int id)
    {
        Customer customer = politicians.findOne(id);
        politicians.delete(id);
        return politician;
    }

    @RequestMapping(path = "/politician/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") int id)
    {
        return politicians.findOne(id);
    }



}
