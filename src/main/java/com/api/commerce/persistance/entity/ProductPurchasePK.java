package com.api.commerce.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ProductPurchasePK implements Serializable {

    @Serial
    private static final long serialVersionUID = -2145479604343286721L;

    @Column(name = "purchase_number")
    private Integer purchaseNumber;


    @Column(name = "product_id")
    private Integer productId;
}
