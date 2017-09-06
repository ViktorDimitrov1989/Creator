package app.services;
import app.dto.add.AddCardDto;

public interface CardService {

    void save(AddCardDto card);

   void save(Iterable<AddCardDto> cards);

}
