package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 创建日期:  2020/10/18
 * 创建时间:  21:16
 */
public interface ItemsService {

	List<Items> findAll();

	int save(Items items);
}
