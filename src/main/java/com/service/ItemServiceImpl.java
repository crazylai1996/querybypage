package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Page;
import com.mapper.ItemMapper;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemMapper itemMapper;
	
	/* 
	 * pageNum：当前页码
	 * numPerPage：每页记录数目
	 */
	@Override
	public Page findByPage(int pageNum, int numPerPage) {
		Page page = new Page();
		page.setNumPerPage(numPerPage);
		page.setCurrent(pageNum);
		
		int totalCount = itemMapper.getItemsCount();
		page.setTotalCount(totalCount);//设置总记录数
				
		int start = (pageNum - 1)*numPerPage;
		List list = itemMapper.findByPage(start, numPerPage);
		page.setItems(list);//设置当前页面数据 
		
		return page;
	}

}
