package com.samfrosh.cart;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartItemsRepository extends JpaRepository<CartItems, Long> {

    Optional<CartItems> findByCartAndProductId(Cart cart, String productId);

    Optional<List<CartItems>> findByCart(Cart cart);

    void deleteByIdAndProductId(Long id, String productId);
}