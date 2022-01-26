package com.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Livro getLivro(){
		return new Livro();
	}
	//Versão em XML poderia ser implemetada dessa forma
	//<bean id = "livro" class="com.springbeans.Livro/>
	@Bean
	public Autor getAutorLivro() {
		return new Autor();
	}
}
