package io.vishal.springboot.reactive.mongoDbCrud.util;

import org.springframework.beans.BeanUtils;

import io.vishal.springboot.reactive.mongoDbCrud.dto.ProductDto;
import io.vishal.springboot.reactive.mongoDbCrud.entity.Product;

public class AppUtils {

	public static ProductDto entityToDto(Product product) {
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(product, productDto);
		return productDto;
	}
	
	
	public static Product dtoToEntity(ProductDto productDto) {
		Product product = new Product();
		BeanUtils.copyProperties(productDto, product);
		return product;
	}
}
