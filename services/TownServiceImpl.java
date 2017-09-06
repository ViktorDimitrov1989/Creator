package app.services;

import app.dto.add.AddTownDto;
import app.models.Town;
import app.repositories.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TownServiceImpl implements TownService {

    private final TownRepository townRepository;

    @Autowired
    public TownServiceImpl(TownRepository townRepository) {
        this.townRepository = townRepository;
    }

    @Override
    public void save(AddTownDto town) {
    }

    @Override
    public void save(Iterable<AddTownDto> towns) {
    }

}
