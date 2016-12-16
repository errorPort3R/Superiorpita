package com.nataandporterinc.entities;

import javax.persistence.*;

/**
 * Created by jeffryporter on 12/7/16.
 */

@Entity
@Table(name = "employees")
public class Employee
{
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private User user;

    @Column(unique = true)
    private Customer customer;

    public Employee()
    {
    }

    public Employee(User user, Customer customer)
    {
        this.user = user;
        this.customer = customer;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
}
