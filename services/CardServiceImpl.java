package app.services;

import app.dto.add.AddCardDto;
import app.models.Card;
import app.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void save(AddCardDto card) {
    }

    @Override
    public void save(Iterable<AddCardDto> cards) {
    }

}
