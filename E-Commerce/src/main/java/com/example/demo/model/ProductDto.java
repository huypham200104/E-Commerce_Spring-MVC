package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    @NotEmpty(message = "The name is required")
    private String name;
    @NotEmpty(message = "The description is required")
    private String brand;
    @NotEmpty(message = "The category is required")
    private String category;

    @Min(0)
    private double price;
    @Size(min = 10, message = "The decription should be at least 10 characters")
    @Size(max = 100, message = "The decription cannot exceed 100 characters")
    private String description;
    private MultipartFile imageFile;

}
