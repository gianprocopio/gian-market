package com.gian.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable //esta anotación nos dice que esta clase la vamos a embeber en otra clase luego
public class BuysProductPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idBuy;

    @Column(name = "id_producto")
    private Integer idProduct;

    public Integer getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(Integer idBuy) {
        this.idBuy = idBuy;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
}
