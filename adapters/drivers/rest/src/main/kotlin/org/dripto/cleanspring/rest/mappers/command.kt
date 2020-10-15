package org.dripto.cleanspring.rest.mappers

import org.dripto.cleanspring.core.ports.incoming.model.command.SavingsAccountCreationCommand
import org.dripto.cleanspring.rest.model.AccountCreationRequest

val AccountCreationRequest.command get() = SavingsAccountCreationCommand(balance)
