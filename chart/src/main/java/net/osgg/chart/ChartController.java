package net.osgg.chart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.osgg.chart.Product;
import net.osgg.chart.ProductService;

@Controller
public class ChartController {

    @Autowired
    private ProductService service;
	
	@RequestMapping({ "/", "/chart" })
	public String index() {
		return "index";
	}
	
	@RequestMapping("/chart2")
	public String index2() {
		return "index2";
	}
	
	@RequestMapping("/data")
	@ResponseBody
	public List<Product> data() {
		return service.getProducts();
	}

}
