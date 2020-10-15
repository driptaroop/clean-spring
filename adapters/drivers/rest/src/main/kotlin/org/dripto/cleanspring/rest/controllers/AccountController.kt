package org.dripto.cleanspring.rest.controllers

import org.dripto.cleanspring.core.ports.incoming.api.AccountGenerationUseCase
import org.dripto.cleanspring.core.ports.incoming.model.command.SavingsAccountCreationCommand
import org.dripto.cleanspring.rest.mappers.command
import org.dripto.cleanspring.rest.model.AccountCreationRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@RestController
class AccountController(
        private val usecase: AccountGenerationUseCase
) {
    @GetMapping("/hello")
    fun sayHello() = "Hello World!!"

    @PostMapping("/create")
    fun createAccount(@RequestBody request: AccountCreationRequest) = usecase.createAccount(request.command)
}
