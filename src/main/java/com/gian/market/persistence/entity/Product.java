package com.gian.market.persistence.entity;

import jakarta.persistence.*;

@Entity //Le da a entender a java, que esta clase mapea una tabla de la db
@Table(name = "productos") //nombre de la tabla a la que mapea esta clase
public class Product {

    @Id  //clave primaria sencilla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para generar un id cuando se cree un nuevo producto
    @Column(name = "id_producto") //nombre de la columna en la db
    private Integer idProduct;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_categoria")
    private Integer idCategory;

    @Column(name = "codigo_barras")
    private String barCode;

    @Column(name = "precio_venta")
    private Double salePrice;

    @Column(name = "cantidad_stock")
    private Integer stockQuantity;

    @Column(name = "estado")
    private boolean state;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
