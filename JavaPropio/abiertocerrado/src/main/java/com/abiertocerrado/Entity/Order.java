package com.abiertocerrado.Entity;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // La lista es de tipo product para recibir los productos de la clase producto
    private List<Product> products;

    public Order() {
    products = new ArrayList<>();
    }

    // Este metodo agrega los productos a la lista
    public void addProduct(Product product) {
    products.add(product);
    }

    public List<Product> getProducts() {
    return products;
    }

}
