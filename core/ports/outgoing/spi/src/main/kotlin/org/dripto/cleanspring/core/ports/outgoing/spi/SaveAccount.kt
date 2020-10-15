package org.dripto.cleanspring.core.ports.outgoing.spi

import org.dripto.cleanspring.core.ports.outgoing.data.model.Account

interface SaveAccount {
    fun save(account: Account)
}
