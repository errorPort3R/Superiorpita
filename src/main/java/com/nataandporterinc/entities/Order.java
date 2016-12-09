package com.nataandporterinc.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by jeffryporter on 12/7/16.
 */

@Entity
@Table(name = "orders")
public class Order
{
    public enum Status
    {
        ACTIVE,
        BACKORDER,
        SHIPPED,
        HOLD,
        COMPLETE,
        RETURN,
        DELETE
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    @ManyToOne
    private ArrayList<Product> products;

    @Column(nullable = false)
    private ArrayList<Integer> quantities;

    @Column(nullable = false)
    private LocalDateTime shipDate;

    @Column(nullable = false)
    private LocalDateTime initiatedDate;

    @Column(nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private Enum Status;

    @Column(nullable = false)
    private ArrayList<String> trackingNumbers;

    public Order()
    {
    }

    public Order(ArrayList<Product> products, ArrayList<Integer> quantities, LocalDateTime shipDate, LocalDateTime initiatedDate, Customer customer, Enum status, ArrayList<String> trackingNumbers)
    {
        this.products = products;
        this.quantities = quantities;
        this.shipDate = shipDate;
        this.initiatedDate = initiatedDate;
        this.customer = customer;
        Status = status;
        this.trackingNumbers = trackingNumbers;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public ArrayList<Product> getProducts()
    {
        return products;
    }

    public void setProducts(ArrayList<Product> products)
    {
        this.products = products;
    }

    public ArrayList<Integer> getQuantities()
    {
        return quantities;
    }

    public void setQuantities(ArrayList<Integer> quantities)
    {
        this.quantities = quantities;
    }

    public LocalDateTime getShipDate()
    {
        return shipDate;
    }

    public void setShipDate(LocalDateTime shipDate)
    {
        this.shipDate = shipDate;
    }

    public LocalDateTime getInitiatedDate()
    {
        return initiatedDate;
    }

    public void setInitiatedDate(LocalDateTime initiatedDate)
    {
        this.initiatedDate = initiatedDate;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public Enum getStatus()
    {
        return Status;
    }

    public void setStatus(Enum status)
    {
        Status = status;
    }

    public ArrayList<String> getTrackingNumbers()
    {
        return trackingNumbers;
    }

    public void setTrackingNumbers(ArrayList<String> trackingNumbers)
    {
        this.trackingNumbers = trackingNumbers;
    }
}
