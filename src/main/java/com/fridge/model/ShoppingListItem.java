package com.fridge.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class ShoppingListItem {

    private Long id;
    private Product product;
    private Integer quantity;
    private Boolean isAcquired;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Column
    @NotNull
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column
    @NotNull
    public Boolean getIsAcquired() {
        return isAcquired;
    }

    public void setIsAcquired(Boolean acquired) {
        isAcquired = acquired;
    }


}
