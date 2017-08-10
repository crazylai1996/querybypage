package com.mapper;

import java.util.List;

import com.entity.Item;

public interface ItemMapper {
	int getItemsCount();
	List<Item> findByPage(int start,int count);
}
