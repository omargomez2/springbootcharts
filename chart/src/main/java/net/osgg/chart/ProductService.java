package net.osgg.chart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.osgg.chart.Product;


@Service
@Transactional
public class ProductService {

	@Autowired
    private ProductRepository repo;
	
    public List<Product> getProducts() {
        return repo.findAll();
    }

}
