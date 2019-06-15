package com.itheima.service.impl;

import com.itheima.service.ItemsService;
import itheima.dao.ItemsDao;
import itheima.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    public Items findById() {
        Items byId = itemsDao.findById(1);
        return byId;
    }
}
