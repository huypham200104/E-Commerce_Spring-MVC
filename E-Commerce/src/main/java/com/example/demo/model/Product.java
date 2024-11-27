package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String brand;
    private String category;
    private Double price;
	@Column(columnDefinition = "TEXT")
    private String decription;
    private Date createAt;
    private String imageFileName;

    public void setDescription(String description) {
        this.decription = description;
    }

    public String getDescription() {
        return decription;
    }

    public void setImageUrl(String imageUrl) {
        this.imageFileName = imageUrl;
    }

    public String getImageUrl() {
        return this.imageFileName;
    }

    public void setCreatedAt(Date createdAt) {
        this.createAt = createdAt;
    }

    public Date getCreatedAt() {
        return this.createAt;
    }
}
