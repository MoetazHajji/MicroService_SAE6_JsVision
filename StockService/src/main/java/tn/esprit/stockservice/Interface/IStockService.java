package tn.esprit.stockservice.Interface;

import tn.esprit.stockservice.Entity.Stock;

import java.util.Set;

public interface IStockService {
    Stock addStock(Stock stock);
    Stock modifyStock(Stock stock);
    void deleteStock(Long id);
    Stock getStockById(Long id);
    Set<Stock> getAllStock();
}