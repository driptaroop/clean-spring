package org.dripto.cleanspring.core.domain.service.mappers

import org.dripto.cleanspring.core.domain.entity.SavingsAccount
import org.dripto.cleanspring.core.ports.outgoing.data.model.Account
import org.dripto.cleanspring.core.ports.outgoing.data.model.Account.AccountType.SAVINGS
import org.springframework.stereotype.Component

@Component
class SavingsAccountToAccountMapper : (SavingsAccount) -> Account {
    override fun invoke(savingsAccount: SavingsAccount) = with(savingsAccount) {
        Account(id, balance.amount, SAVINGS)
    }
}
