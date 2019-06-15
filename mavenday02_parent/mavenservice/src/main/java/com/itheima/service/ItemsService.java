package com.itheima.service;

import itheima.domain.Items;

import java.util.List;

public interface ItemsService {
    public List<Items> findAll();
    public Items findById();
}
