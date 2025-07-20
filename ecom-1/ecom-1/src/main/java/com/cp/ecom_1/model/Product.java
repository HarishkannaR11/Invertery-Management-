package com.cp.ecom_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
  @SequenceGenerator(
    name = "product_seq",
    sequenceName = "product_sequence",
    allocationSize = 1
  )
  private Long id;

  private String name;
  private String description; // Renamed from 'desc'
  private String brand;
  private BigDecimal price;
  private String category;

  private Date releaseDate;

  private boolean productAvailable;
  private int stockQuantity;

  private String imageName;
  private String imageType;

  @Lob
  private byte[] imageData;
}
