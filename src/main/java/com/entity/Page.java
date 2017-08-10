package com.entity;

import java.util.List;

public class Page {
	private int current;//当前页
	private int end;//尾页
	private int numPerPage;//每页记录数
	private int totalCount;//总记录数
	private List<Item> items;//当前页数据 
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getNumPerPage() {
		return numPerPage;
	}
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.end = (int)Math.ceil(totalCount/numPerPage);//计算尾页
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
