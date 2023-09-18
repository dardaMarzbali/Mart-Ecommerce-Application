package com.samfrosh.service;

import com.samfrosh.dto.CartDto;
import com.samfrosh.dto.DtoCart;
import com.samfrosh.exception.CartError;

import java.util.List;

public interface CartService {

    String addItemsToCart(CartDto cartDto) throws CartError;

    List<DtoCart> getCartItems(String userId) throws CartError;

    void deleteProduct(String productId, Long userId);
}
