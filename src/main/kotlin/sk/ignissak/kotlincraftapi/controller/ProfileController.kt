package sk.ignissak.kotlincraftapi.controller

import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.ignissak.kotlincraftapi.repository.ProfileRepository
import sk.ignissak.kotlincraftapi.util.ResponseCreator
import java.util.*

@RestController
@RequestMapping("/profile")
class ProfileController(private val profileRepository: ProfileRepository) {

    @GetMapping("/{nick}")
    fun getPlayerByNick(@PathVariable("nick") nick: String): Map<String, Any?> {
        return try {
            val profile = profileRepository.getByNick(nick)
            ResponseCreator(HttpStatus.OK, profile).toMap()
        } catch (e: EmptyResultDataAccessException) {
            ResponseCreator(HttpStatus.NOT_FOUND, null).toMap()
        }
    }

    @GetMapping("/uuid/{uuid}")
    fun getPlayerByUuid(@PathVariable("uuid") uuid: UUID): Map<String, Any?> {
        return try {
            val profile = profileRepository.getByUuid(uuid)
            ResponseCreator(HttpStatus.OK, profile).toMap()
        } catch (e: EmptyResultDataAccessException) {
            ResponseCreator(HttpStatus.NOT_FOUND, null).toMap()
        }
    }
}