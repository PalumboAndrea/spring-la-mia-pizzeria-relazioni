package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.pojo.OffertaSpeciale;
import com.example.demo.pojo.Pizza;
import com.example.demo.serv.OffertaSpecialeServ;
import com.example.demo.serv.PizzaService;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	
	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private OffertaSpecialeServ offertaSpecialeServ;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Pizza pizza1 = new Pizza("Margherita", "Pomodoro, mozzarella", "https://cdn.shopify.com/s/files/1/0586/6795/8427/articles/Margherita-9920.jpg?crop=center&height=915&v=1644590028&width=1200", 6);
		Pizza pizza2 = new Pizza("Napoli", "Pomodoro, mozzarella, acciughe", "https://cdn.shopify.com/s/files/1/0586/6795/8427/articles/Margherita-9920.jpg?crop=center&height=915&v=1644590028&width=1200", 8);
		Pizza pizza3 = new Pizza("Marinara", "Pomodoro, origano", "https://cdn.shopify.com/s/files/1/0586/6795/8427/articles/Margherita-9920.jpg?crop=center&height=915&v=1644590028&width=1200", 5);
		
		pizzaService.save(pizza1);
		pizzaService.save(pizza2);
		pizzaService.save(pizza3);
		
		OffertaSpeciale offertaSpeciale1 = new OffertaSpeciale(LocalDate.of(2023, 6, 6), LocalDate.of(2024, 6, 6), "Offerta 1", 20, pizza1);
		OffertaSpeciale offertaSpeciale2 = new OffertaSpeciale(LocalDate.of(2023, 6, 6), LocalDate.of(2024, 6, 6), "Offerta 2", 40, pizza1);
		OffertaSpeciale offertaSpeciale3 = new OffertaSpeciale(LocalDate.of(2023, 6, 6), LocalDate.of(2024, 6, 6), "Offerta 3", 60, pizza2);
		OffertaSpeciale offertaSpeciale4 = new OffertaSpeciale(LocalDate.of(2023, 6, 6), LocalDate.of(2024, 6, 6), "Offerta 4", 50, pizza2);
		OffertaSpeciale offertaSpeciale5 = new OffertaSpeciale(LocalDate.of(2023, 6, 6), LocalDate.of(2024, 6, 6), "Offerta 5", 80, pizza3);
		
		offertaSpecialeServ.save(offertaSpeciale1);
		offertaSpecialeServ.save(offertaSpeciale2);
		offertaSpecialeServ.save(offertaSpeciale3);
		offertaSpecialeServ.save(offertaSpeciale4);
		offertaSpecialeServ.save(offertaSpeciale5);
	}

}
