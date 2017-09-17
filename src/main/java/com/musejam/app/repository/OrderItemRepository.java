package com.musejam.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.musejam.app.model.OrderItem;

@Repository
public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long> {

	public List<OrderItem> findAllByOrderByIdDesc();

	public OrderItem findOrderItemById(@Param("order_item_id") long id);

	public OrderItem findOrderItemByName(@Param("name") String name);

}
