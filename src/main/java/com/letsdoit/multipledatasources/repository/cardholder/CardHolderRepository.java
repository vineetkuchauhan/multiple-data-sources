package com.letsdoit.multipledatasources.repository.cardholder;

import com.letsdoit.multipledatasources.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}
