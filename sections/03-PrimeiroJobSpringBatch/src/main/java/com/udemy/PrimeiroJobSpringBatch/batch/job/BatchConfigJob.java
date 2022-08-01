package com.udemy.PrimeiroJobSpringBatch.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableBatchProcessing
@Configuration
public class BatchConfigJob {
	@Autowired
	private JobBuilderFactory jobs;
	
	@Bean
	public Job helloWorldJob(Step helloWorldStep) {
		return jobs
				.get("helloWorldJob")
				.start(helloWorldStep)
				.incrementer(new RunIdIncrementer())
				.build();
	}
}