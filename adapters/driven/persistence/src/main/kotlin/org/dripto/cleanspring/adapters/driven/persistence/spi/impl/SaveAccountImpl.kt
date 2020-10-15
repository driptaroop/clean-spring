package org.dripto.cleanspring.adapters.driven.persistence.spi.impl

import org.dripto.cleanspring.adapters.driven.persistence.entity.AccountEntity
import org.dripto.cleanspring.adapters.driven.persistence.repository.AccountRepository
import org.dripto.cleanspring.core.ports.outgoing.data.model.Account
import org.dripto.cleanspring.core.ports.outgoing.spi.SaveAccount
import org.springframework.stereotype.Component

@Component
class SaveAccountImpl(
    private val repository: AccountRepository
) : SaveAccount {
    override fun save(account: Account) {
        repository.save(account.entity)
        println(repository.findAll())
    }

    private val Account.entity get() = AccountEntity(id, balance, type.name)
}
