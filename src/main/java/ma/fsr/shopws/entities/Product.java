package ma.fsr.shopws.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    @Column(length = 2000000)
    private String picture;
    private double price;
    private int quantity;
    private int sellCount;
    public Product() {
    }
    public Product(String name, double price, int quantity, int sellCount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.sellCount = sellCount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getSellCount() {
        return sellCount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price)  {this.price = price;}
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setSellCount(int sellCount) {
        this.sellCount = sellCount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
}
