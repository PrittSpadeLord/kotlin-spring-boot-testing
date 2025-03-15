package io.github.PrittSpadeLord.kotlin_spring_boot_testing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootTestingApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootTestingApplication>(*args)
}
