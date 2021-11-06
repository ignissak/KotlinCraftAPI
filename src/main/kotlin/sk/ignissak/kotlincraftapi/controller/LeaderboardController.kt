package sk.ignissak.kotlincraftapi.controller

import org.springframework.cache.annotation.Cacheable
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.ignissak.kotlincraftapi.entity.partials.EconomyPartial
import sk.ignissak.kotlincraftapi.repository.ProfileRepository
import sk.ignissak.kotlincraftapi.util.ResponseCreator

@RestController
@RequestMapping("/leaderboard")
class LeaderboardController(private val profileRepository: ProfileRepository) {

    @GetMapping("/economy/craftcoins")
    fun getEconomyCraftCoinsLeaderboard(): Map<String, Any?> {
        return try {
            val list = profileRepository.findTop50ByOrderByEconomy_CraftCoinsDesc()
                .mapIndexed { index, profileEntity ->
                    EconomyPartial(index + 1, profileEntity.nick, profileEntity.uuid, profileEntity.economy.craftCoins)
                }
            ResponseCreator(HttpStatus.OK, list).toMap()
        } catch (e: EmptyResultDataAccessException) {
            ResponseCreator(HttpStatus.NOT_FOUND, null).toMap()
        }
    }

    @GetMapping("/economy/crafttokens")
    fun getEconomyCraftTokensLeaderboard(): Map<String, Any?> {
        return try {
            val list = profileRepository.findTop50ByOrderByEconomy_CraftTokensDesc()
                .mapIndexed { index, profileEntity ->
                    EconomyPartial(index + 1, profileEntity.nick, profileEntity.uuid, profileEntity.economy.craftTokens)
                }
            ResponseCreator(HttpStatus.OK, list).toMap()
        } catch (e: EmptyResultDataAccessException) {
            ResponseCreator(HttpStatus.NOT_FOUND, null).toMap()
        }
    }

    @GetMapping("/economy/votetokens")
    fun getEconomyVoteTokensLeaderboard(): Map<String, Any?> {
        return try {
            val list = profileRepository.findTop50ByOrderByEconomy_VoteTokensDesc()
                .mapIndexed { index, profileEntity ->
                    EconomyPartial(index + 1, profileEntity.nick, profileEntity.uuid, profileEntity.economy.voteTokens)
                }
            ResponseCreator(HttpStatus.OK, list).toMap()
        } catch (e: EmptyResultDataAccessException) {
            ResponseCreator(HttpStatus.NOT_FOUND, null).toMap()
        }
    }

    @GetMapping("/economy/bugpoints")
    fun getEconomyBugPointsLeaderboard(): Map<String, Any?> {
        return try {
            val list = profileRepository.findTop50ByOrderByEconomy_BugPointsDesc()
                .mapIndexed { index, profileEntity ->
                    EconomyPartial(index + 1, profileEntity.nick, profileEntity.uuid, profileEntity.economy.bugPoints)
                }
            ResponseCreator(HttpStatus.OK, list).toMap()
        } catch (e: EmptyResultDataAccessException) {
            ResponseCreator(HttpStatus.NOT_FOUND, null).toMap()
        }
    }
}