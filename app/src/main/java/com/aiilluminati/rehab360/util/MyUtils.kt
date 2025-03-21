package com.aiilluminati.rehab360.util

import android.util.Log

class MyUtils {

    companion object {
        fun exerciseNameToDisplay(variableName: String): String {
            return when (variableName) {
                "squats" -> "Squat"
                "pushups_down" -> "Push up"
                "lunges" -> "Lunge"
                "situp_up" -> "Sit up"
                "chestpress_down" -> "Chest press"
                "deadlift_down" -> "Dead lift"
                "shoulderpress_down" -> "Shoulder press"
                "shoulderpress_down" -> "Pendulum Swings"
                "shoulderpress_down" -> "Wall Angels"
                "shoulderpress_down" -> "External Rotation"
                "shoulderpress_down" -> "Scapular Retraction"
                "shoulderpress_down" -> "Sleeper Stretch"
                "shoulderpress_down" -> "Shoulder Flexion"
                "shoulderpress_down" -> "Internal Rotation"
                "warrior" -> "Warrior Yoga"
                "tree_pose" -> "Tree Yoga"
                // Add more cases as needed
                else -> variableName // Default to the original name if not matched
            }
        }

        fun convertTimeStringToMinutes(timeString: String): Double {
            val components = timeString.split(":")
            val total: Double

            when (components.size) {
                2 -> {
                    val (minutes, seconds) = components.map { it.toDouble() }
                    total = minutes + seconds / 60
                    Log.d("total-time $minutes $seconds", total.toString())
                }

                3 -> {
                    val (hours, minutes, seconds) = components.map { it.toDouble() }
                    total = hours * 60 + minutes + seconds / 60
                    Log.d("total-time $hours $minutes $seconds", total.toString())
                }

                else -> {
                    Log.e(
                        "Invalid time format",
                        "The time string must be in 'hh:mm' or 'hh:mm:ss' format."
                    )
                    return 0.0
                }
            }
            return total
        }

        fun databaseNameToClassification(variableName: String): String {
            return when (variableName) {
                "Push up" -> "pushups_down"
                "Lunge" -> "lunges"
                "Squat" -> "squats"
                "Sit up" -> "situp_up"
                "Chest press" -> "chestpress_down"
                "Dead lift" -> "deadlift_down"
                "Shoulder press" -> "shoulderpress_down"
                "Pendulum Swings" -> "pendulum_swings"
                "Wall Angels" -> "wall_angels"
                "External Rotation" -> "external_rotation"
                "Scapular Retraction" -> "scapular_retraction"
                "Sleeper Stretch" -> "sleeper_stretch"
                "Shoulder Flexion" -> "shoulder_flexion"
                "Internal Rotation" -> "internal_rotation"
                "Warrior Yoga" -> "warrior"
                "Tree Yoga" -> "tree_pose"
                // Add more cases as needed
                else -> variableName // Default to the original name if not matched
            }
        }
    }
}