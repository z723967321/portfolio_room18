package com.room18.stock.service;

import com.room18.stock.dao.StockDao;
import com.room18.common.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    private StockDao stockDao;

    public List<Stock> getAllStocks() {
        return stockDao.findAll();
    }

    public Stock getStocksById(Long stockId) {
        return stockDao.findById(stockId).orElse(null);
    }

    public Stock saveStocks(Stock stocks) {
        return stockDao.save(stocks);
    }

    public void deleteStocks(Long stockId) {
        stockDao.deleteById(stockId);
    }

    // Other service methods
}