package com.example.bysell.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "images")
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String originalFilename;
    private String contentType;
    private long size;
    private boolean isPreviewImage;
    @Lob
    private byte[] bytes;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH) // Много картинок у одного продукта
    private Product product;
}
