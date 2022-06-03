package com.fontimer.besttimer.domain

import com.fontimer.besttimer.data.LocalTrack
import kotlinx.coroutines.flow.Flow


interface TrackRepository {
    suspend fun insertTrack(logg: LocalTrack)

    suspend fun deleteTrack(logg: LocalTrack)

    suspend fun getTrackById(id: Int): LocalTrack?

    fun getTracks(): Flow<List<LocalTrack>>

    fun getTracksDesc() : Flow<List<LocalTrack>>

    suspend fun nukeTable()
}