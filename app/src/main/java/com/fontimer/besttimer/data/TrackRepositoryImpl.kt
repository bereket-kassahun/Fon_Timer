package com.fontimer.besttimer.data

import com.fontimer.besttimer.data.LocalTrack
import com.fontimer.besttimer.data.TrackDao
import com.fontimer.besttimer.domain.TrackRepository
import kotlinx.coroutines.flow.Flow

class TrackRepositoryImpl(private val dao: TrackDao): TrackRepository {
    override suspend fun insertTrack(track: LocalTrack) {
        dao.insertLog(track)
    }

    override suspend fun deleteTrack(track: LocalTrack) {
        dao.deleteLog(track)
    }

    override suspend fun getTrackById(id: Int): LocalTrack? {
        return dao.getLogById(id)
    }

    override fun getTracks(): Flow<List<LocalTrack>> {
        return dao.getLogs()
    }

    override fun getTracksDesc(): Flow<List<LocalTrack>> {
        return dao.getLogsDesc()
    }

    override suspend fun nukeTable() {
        dao.nukeTable()
    }
}