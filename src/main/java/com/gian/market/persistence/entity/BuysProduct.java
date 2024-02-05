package com.gian.market.persistence.entity;



import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_producto")
public class BuysProduct {
    @EmbeddedId
    private BuysProductPK id;

    @Column(name = "cantidad")
    private Integer quantity;

    private double total;

    @Column(name = "estado")
    private boolean state;

    public BuysProductPK getId() {
        return id;
    }

    public void setId(BuysProductPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
