package com.JspH2webMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JspH2webMVC.entity.product;

public interface productRepository extends JpaRepository<product, Integer> {

}
