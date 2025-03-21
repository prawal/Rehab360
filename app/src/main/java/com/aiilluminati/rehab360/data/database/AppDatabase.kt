package com.aiilluminati.rehab360.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.aiilluminati.rehab360.data.plan.Plan
import com.aiilluminati.rehab360.data.plan.PlanDataDao
import com.aiilluminati.rehab360.data.results.DateConverters
import com.aiilluminati.rehab360.data.results.WorkoutResult
import com.aiilluminati.rehab360.data.results.WorkoutResultDao

@Database(
    entities = [Plan::class, WorkoutResult::class],
    version = 7,
    exportSchema = false
)
@TypeConverters(DateConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun planDao(): PlanDataDao
    abstract fun resultDao(): WorkoutResultDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "myapp_database.db"
                )
                    .fallbackToDestructiveMigration()
                    .build()

                INSTANCE = instance
                return instance
            }
        }
    }
}