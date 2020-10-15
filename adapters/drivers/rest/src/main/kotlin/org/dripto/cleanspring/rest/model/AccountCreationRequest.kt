package org.dripto.cleanspring.rest.model

import java.math.BigDecimal

data class AccountCreationRequest(
    val balance: BigDecimal
)
