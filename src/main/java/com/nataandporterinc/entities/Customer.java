package com.nataandporterinc.entities;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by jeffryporter on 12/7/16.
 */

@Entity
@Table(name = "customers")
public class Customer
{
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private User user;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String company;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    ArrayList<Address> addresses;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private Integer zip;

    @Column(nullable = false)
    private String phone;

    @ManyToOne
    private ArrayList<Order> orders;

    public Customer()
    {
    }

    public Customer(User user, String firstName, String lastName, String company, String email, Address address, String city, String state, Integer zip, String phone, ArrayList<Order> orders)
    {
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.email = email;
        this.addresses.add(address);
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.orders = orders;
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

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public ArrayList<Address> getAddresses()
    {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses)
    {
        this.addresses = addresses;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public Integer getZip()
    {
        return zip;
    }

    public void setZip(Integer zip)
    {
        this.zip = zip;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public ArrayList<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders)
    {
        this.orders = orders;
    }
}
