package org.dripto.cleanspring.core.ports.incoming.api

import org.dripto.cleanspring.core.ports.incoming.model.command.SavingsAccountCreationCommand
import java.util.UUID

interface AccountGenerationUseCase {
    fun createAccount(command: SavingsAccountCreationCommand): UUID
}
