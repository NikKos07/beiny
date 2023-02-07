package com.project.beiny

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class BeinyApplication

fun main(args: Array<String>) {
	runApplication<BeinyApplication>(*args)

}
