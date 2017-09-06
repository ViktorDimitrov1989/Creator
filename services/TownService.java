package app.services;
import app.dto.add.AddTownDto;

public interface TownService {

    void save(AddTownDto town);

   void save(Iterable<AddTownDto> towns);

}
