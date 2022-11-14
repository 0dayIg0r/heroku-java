package org.senai.prjjava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private String price;
    
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(String price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


  
  
    
}
