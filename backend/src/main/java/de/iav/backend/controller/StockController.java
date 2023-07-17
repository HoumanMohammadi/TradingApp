package de.iav.backend.controller;

import de.iav.backend.model.Stock;
import de.iav.backend.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stock> getStockById(@PathVariable String id) {
        Optional<Stock> stockOptional = stockService.getStockById(id);
        return stockOptional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock) {
        Stock createdStock = stockService.saveStock(stock);
        return ResponseEntity.created(URI.create("/stocks/" + createdStock.getId())).body(createdStock);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStockById(@PathVariable String id) {
        stockService.deleteStockById(id);
        return ResponseEntity.noContent().build();
    }
}
