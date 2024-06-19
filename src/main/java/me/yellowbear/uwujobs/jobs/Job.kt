package me.yellowbear.uwujobs.jobs

import kotlinx.serialization.Serializable

@Serializable
data class Reward(
    val brokenBlocks: List<String>? = null,
    val placedBlocks: List<String>? = null,
    val killedEntities: List<String>? = null,
    val fertilizedBlocks: List<String>? = null,
    val amount: Int
)

@Serializable
data class Job(
    val name: String,
    val rewards: List<Reward>
)
