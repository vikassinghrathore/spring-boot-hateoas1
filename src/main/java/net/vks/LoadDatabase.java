package net.vks;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.vks.account.Account;
import net.vks.account.AccountRepository;

@Configuration
public class LoadDatabase {
	private AccountRepository accountRepo;
	public LoadDatabase(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}
	@Bean
	public CommandLineRunner initDatabase() {
		return args -> {
			
			Account account1 = new Account("1982080185", 1021.99f);
			Account account2 = new Account("1982032177", 231.50f);
			Account account3 = new Account("1982094128", 6211.00f);
			
			accountRepo.saveAll(List.of(account1, account2, account3));
			System.out.println("Sample database initialized.");
		};
	}
}
