package com.mapstruct.mapper;

import com.mapstruct.dto.ProductDto;
import com.mapstruct.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {


    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "product.desc", target = "description")
    ProductDto modelToDto(Product product);

    @Mapping (source ="productDto.description" ,target = "desc")
    Product dtoToModel(ProductDto productDto);


}
