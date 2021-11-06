package sk.ignissak.kotlincraftapi.entity.embeddable

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class EconomyEmbeddable (

    @Column(name = "craftcoins")
    val craftCoins: Long = 0,

    @Column(name = "crafttokens")
    val craftTokens: Long = 0,

    @Column(name = "votetokens")
    val voteTokens: Long = 0,

    @Column(name = "bug_points")
    val bugPoints: Long = 0,

    @Column(name = "karma")
    val karma: Long = 0

) : Serializable
