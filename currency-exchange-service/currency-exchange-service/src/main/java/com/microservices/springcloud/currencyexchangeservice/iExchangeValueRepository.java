package com.microservices.springcloud.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface iExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

    ExchangeValue findByFromAndTo(String from, String to);

}
