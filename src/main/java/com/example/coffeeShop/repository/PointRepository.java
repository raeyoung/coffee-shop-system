package com.example.coffeeShop.repository;

import com.example.coffeeShop.entity.Menu;
import com.example.coffeeShop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends JpaRepository<User, Long> {
}
