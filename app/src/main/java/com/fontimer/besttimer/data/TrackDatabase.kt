package com.fontimer.besttimer.data


import androidx.room.Database
import androidx.room.RoomDatabase
import com.fontimer.besttimer.data.LocalTrack
import com.fontimer.besttimer.data.TrackDao

@Database(entities = [LocalTrack::class], version = 1)
abstract class TrackDatabase: RoomDatabase() {
    abstract val dao: TrackDao
}