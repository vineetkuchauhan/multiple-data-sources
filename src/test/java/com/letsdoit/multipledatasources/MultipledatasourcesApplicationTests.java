package com.letsdoit.multipledatasources;

import static org.junit.Assert.assertTrue;

import com.letsdoit.multipledatasources.model.cardholder.CardHolder;
import com.letsdoit.multipledatasources.repository.card.CardRepository;
import com.letsdoit.multipledatasources.repository.cardholder.CardHolderRepository;
import com.letsdoit.multipledatasources.model.card.Card;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultipledatasourcesApplicationTests {

    @Autowired
    private CardHolderRepository cardHolderRepository;

    @Autowired
    private CardRepository cardRepository;

    private Card card;
    private CardHolder cardHolder;

    @Before
    public void initializeDataObjects(){


        cardHolder = new CardHolder();
        cardHolder.setCardNumber("4111111111111111");

        card = new Card();
        card.setExpirationMonth(01);
        card.setExpirationYear(2020);

    }

    @Test
    public void shouldSaveCardHolderToCardHolderDB() {
        CardHolder savedCardHolder =cardHolderRepository.save(cardHolder);
        Optional<CardHolder> cardHolderFromDb= cardHolderRepository.findById(savedCardHolder.getId());
        assertTrue(cardHolderFromDb.isPresent());
    }

    @Test
    public void shouldSaveCardToCardDB() {
        Card savedCard = cardRepository.save(card);
        Optional<Card> cardFromDb= cardRepository.findById(savedCard.getId());
        assertTrue(cardFromDb.isPresent());
    }
}
