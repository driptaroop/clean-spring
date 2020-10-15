package org.dripto.cleanspring.adapters.driven.persistence.entity

import java.math.BigDecimal
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "account")
data class AccountEntity(
    @Id
    val id: UUID,
    val balance: BigDecimal,
    val type: String
)
