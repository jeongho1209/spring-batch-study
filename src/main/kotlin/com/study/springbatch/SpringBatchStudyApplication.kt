package com.study.springbatch

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableBatchProcessing
@SpringBootApplication
class SpringBatchStudyApplication

fun main(args: Array<String>) {
    runApplication<SpringBatchStudyApplication>(*args)
}
