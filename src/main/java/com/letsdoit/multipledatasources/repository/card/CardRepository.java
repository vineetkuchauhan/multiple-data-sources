package com.letsdoit.multipledatasources.repository.card;

import com.letsdoit.multipledatasources.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
