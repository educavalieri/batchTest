package com.br.batchTest.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StepConfiguration {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step imprimeOlaStep(Tasklet imprimeOlaTaskletImplementPrint){

        return stepBuilderFactory
                .get("imprimeOlaStep")
                .tasklet(imprimeOlaTaskletImplementPrint)
                .build();
    }

}
