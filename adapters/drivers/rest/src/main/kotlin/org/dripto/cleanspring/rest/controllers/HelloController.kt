package org.dripto.cleanspring.rest.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class HelloController {
    @GetMapping("/hello")
    fun sayHello() = "Hello World!!"
}