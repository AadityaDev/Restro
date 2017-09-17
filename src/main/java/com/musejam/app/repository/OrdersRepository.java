package com.musejam.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.musejam.app.model.AddOnItem;
import com.musejam.app.model.Orders;

@Repository
public interface OrdersRepository extends PagingAndSortingRepository<Orders, Long>{

	public List<Orders> findAllByOrderByIdDesc();
	
	public Orders findOrdersById(@Param("order_item_id") long id);
	
}
