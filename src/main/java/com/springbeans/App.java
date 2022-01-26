package com.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("O Homen que vendeu sua ferrari");
		livro.setCodigo("A33BD");
		livro.exibir();
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Esqueci");
		autor.exibirAutor();
		
		((AbstractApplicationContext) factory).close();
	}

}
