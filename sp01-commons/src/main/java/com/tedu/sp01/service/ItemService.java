package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//ͨ������id����ȡ��Ʒ��Ϣ
	List<Item> getItems(String orderId);
	//�ڱ��涨��ʱ���ٿ��
	void decreaseNumbers(List<Item> list);

}
