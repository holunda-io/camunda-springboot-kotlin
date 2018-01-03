package org.springbootcamp.camunda

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableProcessApplication
class Application

fun main(args: Array<String>) = runApplication<Application>(*args).let { Unit }
