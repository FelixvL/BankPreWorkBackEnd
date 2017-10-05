package com.itph.BankApplicatie.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itph.BankApplicatie.model.Bank;

@RestController
public class BanksController {
	@GetMapping("/banks")
	public List<Bank> getAllBanks(){
		return Arrays.asList(
				new Bank(11, "ABN-AMRO", "Vlakbij 3")
				);
	}
}
