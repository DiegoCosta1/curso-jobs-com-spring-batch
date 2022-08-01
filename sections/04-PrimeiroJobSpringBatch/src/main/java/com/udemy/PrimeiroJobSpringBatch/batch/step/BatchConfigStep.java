package com.udemy.PrimeiroJobSpringBatch.batch.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfigStep {
	@Autowired
	private StepBuilderFactory steps;
	
	@Bean
	public Step helloWorldStep(Tasklet printTasklet) {
		return steps.get("helloWorldStep")
				.tasklet(printTasklet)
				.build();
	}
}