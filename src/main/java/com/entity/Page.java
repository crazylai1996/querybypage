package com.entity;

import java.util.List;

public class Page {
	private int current;//��ǰҳ
	private int end;//βҳ
	private int numPerPage;//ÿҳ��¼��
	private int totalCount;//�ܼ�¼��
	private List<Item> items;//��ǰҳ���� 
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
		this.end = (int)Math.ceil(totalCount/numPerPage);//����βҳ
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
