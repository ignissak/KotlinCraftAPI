package sk.ignissak.kotlincraftapi.repository

import org.springframework.cache.annotation.Cacheable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sk.ignissak.kotlincraftapi.entity.ProfileEntity
import java.util.*

@Repository
interface ProfileRepository : JpaRepository<ProfileEntity, Long> {

    fun getByNick(nick: String): ProfileEntity

    fun getByUuid(uuid: UUID): ProfileEntity

    @Cacheable(cacheNames = ["top50-craftcoins"])
    fun findTop50ByOrderByEconomy_CraftCoinsDesc(): List<ProfileEntity>

    @Cacheable(cacheNames = ["top50-crafttokens"])
    fun findTop50ByOrderByEconomy_CraftTokensDesc(): List<ProfileEntity>

    @Cacheable(cacheNames = ["top50-votetokens"])
    fun findTop50ByOrderByEconomy_VoteTokensDesc(): List<ProfileEntity>

    @Cacheable(cacheNames = ["top50-bugpoints"])
    fun findTop50ByOrderByEconomy_BugPointsDesc(): List<ProfileEntity>

}