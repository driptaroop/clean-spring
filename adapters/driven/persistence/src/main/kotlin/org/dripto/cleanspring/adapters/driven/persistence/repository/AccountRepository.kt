package org.dripto.cleanspring.adapters.driven.persistence.repository
import org.dripto.cleanspring.adapters.driven.persistence.entity.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AccountRepository : JpaRepository<AccountEntity, UUID>
