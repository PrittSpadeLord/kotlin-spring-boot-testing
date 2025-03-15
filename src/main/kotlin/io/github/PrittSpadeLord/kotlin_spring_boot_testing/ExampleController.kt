package io.github.PrittSpadeLord.kotlin_spring_boot_testing

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController {

    @GetMapping(path = ["/"])
    fun test(): String {
        return "Hello World!"
    }
}