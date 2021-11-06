package sk.ignissak.kotlincraftapi.entity.partials

import java.io.Serializable
import java.util.*

data class EconomyPartial (
    val index: Int = -1,
    val nick: String = "",
    val uuid: UUID = UUID.randomUUID(),
    val value: Long = 0
        ) : Serializable