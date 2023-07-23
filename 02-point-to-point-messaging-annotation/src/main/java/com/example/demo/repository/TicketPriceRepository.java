package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.PricingCategory;
import com.example.demo.model.TicketPrice;
import com.example.demo.model.TicketType;

public interface TicketPriceRepository extends JpaRepository<TicketPrice, Integer> {

    @Query("from TicketPrice tp left join fetch tp.ticketType left join fetch tp.pricingCategory")
    List<TicketPrice> findAll();

    Optional<TicketPrice> findByTicketTypeAndPricingCategory(TicketType ticketType, PricingCategory pricingCategory);
}
