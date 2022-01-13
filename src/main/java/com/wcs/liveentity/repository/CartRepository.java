package com.wcs.liveentity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcs.liveentity.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}