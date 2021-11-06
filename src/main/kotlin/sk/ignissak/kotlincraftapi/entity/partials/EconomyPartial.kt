package sk.ignissak.kotlincraftapi.entity.partials

import java.io.Serializable
import java.util.*

data class EconomyPartial (
    val index: Int = -1,
    val nick: String = "",
    val uuid: UUID = UUID.fromString("00000000-0000-0000-0000-000000000000"),
    val value: Long = 0
        ) : Serializable