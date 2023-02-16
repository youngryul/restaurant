package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

    @Override
    public Optional<WishListEntity> findById(int index) {
        return super.findById(index);
    }

    @Override
    public WishListEntity save(WishListEntity entity) {
        return super.save(entity);
    }

    @Override
    public void deleteById(int index) {
        super.deleteById(index);
    }

    @Override
    public List<WishListEntity> findAll() {
        return super.findAll();
    }
}
