package sk.ignissak.kotlincraftapi.controller

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.ignissak.kotlincraftapi.entity.ProfileEntity
import sk.ignissak.kotlincraftapi.util.ResponseCreator

@RestController
@RequestMapping("/")
class DefaultController {

    @GetMapping(path = ["/"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getHelp(): Map<String, Any?> {
        return ResponseCreator(HttpStatus.OK, ProfileEntity()).toMap()
    }
}