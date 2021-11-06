package sk.ignissak.kotlincraftapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean
import org.springframework.data.redis.cache.RedisCacheConfiguration
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.RedisSerializationContext
import java.time.Duration

@SpringBootApplication
@EnableCaching
class KotlinCraftApiApplication

fun main(args: Array<String>) {
    runApplication<KotlinCraftApiApplication>(*args)
}

@Bean
fun cacheConfiguration(): RedisCacheConfiguration {
    return RedisCacheConfiguration.defaultCacheConfig()
        .entryTtl(Duration.ofMinutes(60))
        .disableCachingNullValues()
        .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(
            GenericJackson2JsonRedisSerializer()
        ))
}