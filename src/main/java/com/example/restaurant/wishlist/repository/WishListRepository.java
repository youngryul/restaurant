package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WithListEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WithListEntity> {

    @Override
    public Optional<WithListEntity> findById(int index) {
        return super.findById(index);
    }

    @Override
    public WithListEntity save(WithListEntity entity) {
        return super.save(entity);
    }

    @Override
    public void deleteById(int index) {
        super.deleteById(index);
    }

    @Override
    public List<WithListEntity> listAll() {
        return super.listAll();
    }
}
