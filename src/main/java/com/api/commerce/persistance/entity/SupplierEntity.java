package com.api.commerce.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "suppliers")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ruc;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_phone")
    private String contactPhone;

    private String address;

    private String email;

    private Boolean status;

    @OneToMany(mappedBy = "supplierEntity")
    private Collection<PurchaseEntity> purchaseEntity;

    @OneToMany(mappedBy = "supplierEntity")
    private Collection<ProductSupplierEntity> productSupplierEntity;
}
