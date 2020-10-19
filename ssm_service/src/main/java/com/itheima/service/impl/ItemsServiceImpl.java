package com.itheima.service.impl;

import com.itheima.service.ItemsService;
import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * 创建日期:  2020/10/18
 * 创建时间:  21:18
 */
@Controller
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	ItemsDao itemsDao;

	@Override
	public List<Items> findAll() {
		return itemsDao.findAll();
	}

	@Override
	public int save(Items items) {
		return itemsDao.save(items);
	}
}
