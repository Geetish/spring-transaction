package com.roytuts.spring.programmatic.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.programmatic.transaction.dao.ItemDaoPfTx;
import com.roytuts.spring.programmatic.transaction.dao.ItemDaoTxTemp;
import com.roytuts.spring.programmatic.transaction.model.Item;

@Service
public class ItemService {

    @Autowired
    //private ItemDaoPfTx itemDao;
    private ItemDaoTxTemp itemDao;

    public List<Item> getItems() {
        return itemDao.getItems();
    }

    public void addItem(Item item) {
        itemDao.addItem(item);
    }

    public void updateItem(Item item) {
        itemDao.updateItem(item);
    }

    public void deleteItem(Item item) throws Exception {
        itemDao.deleteItem(item);
    }

}
