package com.springbatch.processadorvalidacao.processor;

import java.util.HashSet;
import java.util.Set;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.CompositeItemProcessorBuilder;
import org.springframework.batch.item.validator.BeanValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbatch.processadorvalidacao.dominio.Cliente;

@Configuration
public class ProcessadorValidacaoProcessorConfig {
	
	private Set<String> emails = new HashSet<>();
	
	@Bean
	public ItemProcessor<Cliente, Cliente> procesadorValidacaoProcessor() throws Exception {
//		BeanValidatingItemProcessor<Cliente> processor = new BeanValidatingItemProcessor<>();
//		processor.setFilter(true);
		
//		ValidatingItemProcessor<Cliente> processor = new ValidatingItemProcessor<>();
//		processor.setValidator(emailValidator());
//		processor.setFilter(true);
//		return processor;
		
		return new CompositeItemProcessorBuilder<Cliente, Cliente>()
				.delegates(beanValidatingItemProcessor(), emailValidatingItemProcessor())
				.build();
	}
	
	private BeanValidatingItemProcessor<Cliente> beanValidatingItemProcessor() throws Exception {
		BeanValidatingItemProcessor<Cliente> processor = new BeanValidatingItemProcessor<>();
		processor.setFilter(true);
		processor.afterPropertiesSet();
		return processor;
	}
	
	private ValidatingItemProcessor<Cliente> emailValidatingItemProcessor() {
		ValidatingItemProcessor<Cliente> processor = new ValidatingItemProcessor<>();
		processor.setValidator(emailValidator());
		processor.setFilter(true);
		return processor;
	}


	private Validator<Cliente> emailValidator() {
		return new Validator<Cliente>() {
			
			@Override
			public void validate(Cliente cliente) throws ValidationException {
				if (emails.contains(cliente.getEmail()))
					throw new ValidationException("O cliente [" + cliente.getEmail() + "]");
				else emails.add(cliente.getEmail());
			}
		};
	}
}
