package com.example.Ecommerce.Repository;

import com.example.Ecommerce.Enum.ProductCategory;
import com.example.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("select p from Product p where p.price >= :price and p.category = :category")
    public List<Product> getProdByCategoryAndPriceGreaterThan(int price, ProductCategory category);
}