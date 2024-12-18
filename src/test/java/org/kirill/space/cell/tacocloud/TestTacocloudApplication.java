package org.kirill.space.cell.tacocloud;

import org.springframework.boot.SpringApplication;

public class TestTacocloudApplication {

	public static void main(String[] args) {
		SpringApplication.from(TacocloudApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
