package com.service;

import com.entity.Page;

public interface ItemService {
	Page findByPage(int pageNum, int numPerPage);
}
