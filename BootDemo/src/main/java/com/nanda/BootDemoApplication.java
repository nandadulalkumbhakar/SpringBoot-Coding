package com.nanda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nanda.bean.Customer;

@SpringBootApplication
public class BootDemoApplication implements CommandLineRunner{
@Autowired//object creation 
private Customer cs;
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(cs.getCid());
		System.out.println(cs.getCname());
		System.out.println(cs.getCphno());
		
	}

}
