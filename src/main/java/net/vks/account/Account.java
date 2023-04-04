package net.vks.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
@Entity
@Table(name = "accounts")
public class Account extends RepresentationModel<Account> {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, unique = true, length = 20)
	private String accountNumber;
	private float balance;
	public Account() { }
	public Account(String accountNumber, float balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
