package org.dripto.cleanspring.core.domain.entity

import java.math.BigDecimal
import java.util.Currency
import java.util.UUID

data class Money(
    val amount: BigDecimal,
    val currency: Currency
)

interface GenericAccount {
    val id: UUID
    val balance: Money
}

class SavingsAccount(
    override val id: UUID = UUID.randomUUID(),
    override val balance: Money
) : GenericAccount
