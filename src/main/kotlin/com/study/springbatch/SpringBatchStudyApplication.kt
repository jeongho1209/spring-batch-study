package com.study.springbatch

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

internal const val BASE_PACKAGE = "com.study.springbatch"

@EnableScheduling
@EnableBatchProcessing
@SpringBootApplication
class SpringBatchStudyApplication

fun main(args: Array<String>) {
    runApplication<SpringBatchStudyApplication>(*args)
}
