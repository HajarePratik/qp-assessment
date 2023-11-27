package com.qp.grocery.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_details")
public class Product {

    @Id
    @GeneratedValue
    int product_Id;
    String product_Name;
    int product_Price;
    int product_Quantity;

}
