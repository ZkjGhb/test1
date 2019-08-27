package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//通过定单id来获取商品信息
	List<Item> getItems(String orderId);
	//在保存定单时减少库存
	void decreaseNumbers(List<Item> list);

}
