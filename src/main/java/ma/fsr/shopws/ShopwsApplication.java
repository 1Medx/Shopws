package ma.fsr.shopws;

import ma.fsr.shopws.dao.ProductRepository;
import ma.fsr.shopws.entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShopwsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ShopwsApplication.class, args);
		ProductRepository productRepository = ctx.getBean(ProductRepository.class);

	  	//productRepository.save(new Product("Test 1", 12.5, 5, 0));
		//productRepository.save(new Product("Test 2", 17.99, 50, 6));
		//productRepository.save(new Product("Test 3", 9.5, 3, 12));
		//productRepository.save(new Product("Test 4", 123.0, 15, 81));

		//productRepository.findAll().forEach(p->System.out.println(p.getName()));
	}

}
