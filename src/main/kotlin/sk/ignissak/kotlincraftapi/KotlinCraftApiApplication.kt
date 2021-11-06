package sk.ignissak.kotlincraftapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class KotlinCraftApiApplication

fun main(args: Array<String>) {
    runApplication<KotlinCraftApiApplication>(*args)
}