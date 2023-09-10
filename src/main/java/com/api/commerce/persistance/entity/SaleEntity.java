package com.api.commerce.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * Entity for sales in the Commerce API
 * **/
@Getter
@Setter
@Entity
@Table(name = "sales")
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number")
    private Integer number;

    @Column(name = "client_id")
    private Integer clientId;

    private double igv;

    private double subtotal;

    private double total;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;

    private String document;

    @Column(name = "payment_type")
    private String paymentType;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private ClientEntity clientEntity;

    @OneToMany(mappedBy = "saleEntity")
    private Collection<ProductSaleEntity> productSaleEntity;
}
