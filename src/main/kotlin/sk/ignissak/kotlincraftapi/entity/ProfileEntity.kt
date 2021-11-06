package sk.ignissak.kotlincraftapi.entity

import org.hibernate.Hibernate
import org.hibernate.annotations.Type
import sk.ignissak.kotlincraftapi.entity.embeddable.EconomyEmbeddable
import sk.ignissak.kotlincraftapi.entity.embeddable.RankedEmbeddable
import sk.ignissak.kotlincraftapi.entity.embeddable.VotesEmbeddable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "player_profile")
data class ProfileEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    val nick: String = "",

    @Type(type="uuid-char")
    val uuid: UUID = UUID.randomUUID(),

    @Column(name = "registred")
    val registered: Long = 0,

    @Column(name = "last_online")
    val lastOnline: Long = 0,

    @Column(name = "last_server")
    val lastServer: String = "",

    @Column(name = "is_online")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    val isOnline: Boolean = false,

    @Embedded
    val economy: EconomyEmbeddable = EconomyEmbeddable(),

    @Embedded
    val ranked: RankedEmbeddable = RankedEmbeddable(),

    @Embedded
    val votes: VotesEmbeddable = VotesEmbeddable(),

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as ProfileEntity

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id )"
    }
}