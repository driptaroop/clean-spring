package org.dripto.cleanspring.core.ports.outgoing.data.model

import java.math.BigDecimal
import java.util.UUID

data class Account(
    val id: UUID,
    val balance: BigDecimal,
    val type: AccountType
) {
    enum class AccountType {
        SAVINGS
    }
}
