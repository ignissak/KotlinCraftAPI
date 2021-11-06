package sk.ignissak.kotlincraftapi.entity.embeddable

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class VotesEmbeddable(
    @Column(name = "total_votes")
    val totalVotes: Int = 0,

    @Column(name = "month_votes")
    val monthVotes: Int = 0,

    @Column(name = "week_votes")
    val weekVotes: Int = 0,

    @Column(name = "last_vote")
    val lastVote: Long = 0
) : Serializable