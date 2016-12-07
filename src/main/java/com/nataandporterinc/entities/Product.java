package com.nataandporterinc.entities;



import javax.persistence.*;

/**
 * Created by jeffryporter on 12/7/16.
 */

@Entity
@Table(name = "products")
public class Product
{
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String partNumber;

    @Column(nullable = false)
    private String manufacturer;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer listPrice;

    @Column(nullable = true)
    private Integer retailPrice;

    public Product()
    {
    }

    public Product(String partNumber, String manufacturer, String description, Integer listPrice, Integer retailPrice)
    {
        this.partNumber = partNumber;
        this.manufacturer = manufacturer;
        this.description = description;
        this.listPrice = listPrice;
        this.retailPrice = retailPrice;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getPartNumber()
    {
        return partNumber;
    }

    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getListPrice()
    {
        return listPrice;
    }

    public void setListPrice(Integer listPrice)
    {
        this.listPrice = listPrice;
    }

    public Integer getRetailPrice()
    {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice)
    {
        this.retailPrice = retailPrice;
    }
}
