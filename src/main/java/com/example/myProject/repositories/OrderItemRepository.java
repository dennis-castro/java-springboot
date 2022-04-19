package com.example.myProject.repositories;

import com.example.myProject.entities.Category;
import com.example.myProject.entities.Order;
import com.example.myProject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
