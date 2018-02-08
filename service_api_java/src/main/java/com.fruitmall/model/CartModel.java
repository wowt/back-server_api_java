package com.fruitmall.model;

import com.fruitmall.model.fruitmall.mapper.CartEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartModel {

    @Autowired
    private CartEntityMapper mapper;

}
