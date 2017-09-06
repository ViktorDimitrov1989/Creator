package app.services;
import app.dto.add.AddProductDto;

public interface ProductService {

    void save(AddProductDto product);

   void save(Iterable<AddProductDto> products);

}
