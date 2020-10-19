package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 创建日期:  2020/10/18
 * 创建时间:  20:46
 */
public interface ItemsDao {


	List<Items> findAll();

	int save(Items items);
}
