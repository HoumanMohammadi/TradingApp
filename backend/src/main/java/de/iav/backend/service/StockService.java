package de.iav.backend.service;

import de.iav.backend.model.Stock;
import de.iav.backend.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class StockService {
    private final StockRepository stockRepository;


    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Optional<Stock> getStockById(String id) {
        return stockRepository.findById(id);
    }

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStockById(String id) {
        stockRepository.deleteById(id);
    }
}
