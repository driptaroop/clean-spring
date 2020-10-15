package org.dripto.cleanspring.core.domain.service

import org.dripto.cleanspring.core.domain.entity.Money
import org.dripto.cleanspring.core.domain.entity.SavingsAccount
import org.dripto.cleanspring.core.ports.incoming.api.AccountGenerationUseCase
import org.dripto.cleanspring.core.ports.incoming.model.command.SavingsAccountCreationCommand
import org.dripto.cleanspring.core.ports.outgoing.data.model.Account
import org.dripto.cleanspring.core.ports.outgoing.spi.SaveAccount
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal
import java.util.Currency
import java.util.UUID

@Component
class DefaultAccountGenerationUseCase(
    private val saveAccount: SaveAccount,
    private val mapper: (SavingsAccount) -> Account
) : AccountGenerationUseCase {

    @Transactional
    override fun createAccount(command: SavingsAccountCreationCommand): UUID {
        val account = SavingsAccount(balance = command.balance.money)
        saveAccount.save(mapper(account))
        return account.id
    }

    private val BigDecimal.money get() = Money(this, Currency.getInstance("EUR"))
}
