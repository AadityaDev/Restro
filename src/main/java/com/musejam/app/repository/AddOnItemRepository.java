package com.musejam.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.musejam.app.model.AddOnItem;

@Repository
public interface AddOnItemRepository extends PagingAndSortingRepository<AddOnItem, Long>{
	
	public List<AddOnItem> findAllByOrderByIdDesc();
	
	public AddOnItem findAddOnItemById(@Param("add_on_item_id") long id);

	public AddOnItem findAddOnItemByName(@Param("name") String name);
	
}
