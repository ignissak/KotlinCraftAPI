package sk.ignissak.kotlincraftapi.entity.embeddable

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class RankedEmbeddable(
    @Column(name = "global_level")
    val globalLevel: Long = 0,

    @Column(name = "global_experience")
    val globalExperience: Long = 0,

    @Column(name = "survival_level")
    val survivalLevel: Long = 0,

    @Column(name = "survival_experience")
    val survivalExperience: Long = 0,

    @Column(name = "skyblock_level")
    val skyblockLevel: Long = 0,

    @Column(name = "skyblock_experience")
    val skyblockExperience: Long = 0,

    @Column(name = "creative_level")
    val creativeLevel: Long = 0,

    @Column(name = "creative_experience")
    val creativeExperience: Long = 0,

    @Column(name = "prison_level")
    val prisonLevel: Long = 0,

    @Column(name = "prison_experience")
    val prisonExperience: Long = 0,

    @Column(name = "vanilla_level")
    val vanillaLevel: Long = 0,

    @Column(name = "vanilla_experience")
    val vanillaExperience: Long = 0,

    @Column(name = "skycloud_level")
    val skycloudLevel: Long = 0,

    @Column(name = "skycloud_experience")
    val skycloudExperience: Long = 0,

    @Column(name = "hardcore_vanilla_level")
    val hardcoreVanillaLevel: Long = 0,

    @Column(name = "hardcore_vanilla_experience")
    val hardcoreVanillaExperience: Long = 0,

    ) : Serializable