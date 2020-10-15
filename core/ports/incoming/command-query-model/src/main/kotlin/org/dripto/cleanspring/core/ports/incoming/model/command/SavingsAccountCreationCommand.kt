package org.dripto.cleanspring.core.ports.incoming.model.command

import java.math.BigDecimal

data class SavingsAccountCreationCommand(
    val balance: BigDecimal
)
