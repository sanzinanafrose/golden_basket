package com.sanzinan.Golden.Busket.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanzinan.Golden.Busket.models.Product;

public interface ProductsRepository extends JpaRepository <Product, Integer> {

}
