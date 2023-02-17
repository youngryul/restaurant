package com.example.restaurant.wishlist.service;

import com.example.restaurant.wishlist.entity.WishListEntity;
import com.example.restaurant.wishlist.repository.WishListRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WishListServiceTest {

    @Autowired
    private WishListService wishListService;

    @Autowired
    private WishListRepository wishListRepository;

    @Test
    public void searchTest(){
        var result = wishListService.search("갈비집");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }


}