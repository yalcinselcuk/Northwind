package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResullt;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service//bu class service katmanini ustlenecek
public class ProductManager implements ProductService{

	private ProductDao productDao;//erismemiz gerekiyor
	
	@Autowired//spring gidip arka planda buna karsilik gelebilecek bir sinif uretiyor
	public ProductManager(ProductDao productDao) {//constructor'ini olusturduk yoksa hata verir
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult< List <Product> > getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
				
	}

	@Override
	public Result add(Product product) {
	this.productDao.save(product);
	return new SuccessResullt("ürün eklendi");
	}

}