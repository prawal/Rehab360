package com.aiilluminati.rehab360.data.plan

import android.util.Log
import com.aiilluminati.rehab360.R

/**
Object containing constants related to exercise data
 **/
object Constants {
    fun getRehabExerciseList(): List<Exercise> {
        val rehabExercises = listOf(
            Exercise(
                id = 8,
                name = "Pendulum Swings",
                image = R.drawable.pendulum_swings,
                description = "A gentle shoulder mobility exercise where you lean forward, allowing your arm to swing freely in circles or back and forth.",
                calorie = 2.0,
                level = "Beginner"
            ),
            Exercise(
                id = 9,
                name = "Wall Angels",
                image = R.drawable.wall_angels,
                description = "Stand with your back against a wall and move your arms like making a snow angel, improving shoulder flexibility and posture.",
                calorie = 2.5,
                level = "Beginner"
            ),
            Exercise(
                id = 10,
                name = "External Rotation",
                image = R.drawable.external_rotation,
                description = "Using a resistance band, hold your elbows at 90 degrees and rotate your forearms outward to strengthen the rotator cuff.",
                calorie = 3.0,
                level = "Intermediate"
            ),
            Exercise(
                id = 11,
                name = "Scapular Retraction",
                image = R.drawable.scapular_retraction,
                description = "Sit or stand upright, squeeze your shoulder blades together, and hold for a few seconds to strengthen back muscles.",
                calorie = 3.5,
                level = "Intermediate"
            ),
            Exercise(
                id = 12,
                name = "Sleeper Stretch",
                image = R.drawable.sleeper_stretch,
                description = "Lie on your side and use your opposite hand to gently push your forearm toward the ground, stretching the posterior shoulder.",
                calorie = 2.8,
                level = "Beginner"
            ),
            Exercise(
                id = 13,
                name = "Shoulder Flexion",
                image = R.drawable.shoulder_flexion,
                description = "Hold a towel or band behind your back and pull it upward with the opposite arm to stretch and mobilize the shoulder.",
                calorie = 3.2,
                level = "Advance"
            ),
            Exercise(
                id = 14,
                name = "Internal Rotation",
                image = R.drawable.internal_rotation,
                description = "Using a resistance band attached to a stationary object, rotate your arm inward to strengthen internal shoulder muscles.",
                calorie = 3.0,
                level = "Advance"
            )
        )

        Log.d("Constants", "Rehab Exercise List Size: ${rehabExercises.size}")
        return rehabExercises
    }

    fun getExerciseList(): List<Exercise> {
        return listOf(
            Exercise(
                id = 1,
                name = "Push up",
                image = R.drawable.push_up,
                description = "A classic bodyweight exercise targeting the chest, shoulders, and triceps by lowering and pushing up the body.",
                calorie = 3.2,
                level = "Intermediate"
            ),
            Exercise(
                id = 2,
                name = "Lunge",
                image = R.drawable.reverse_lunges,
                description = "A lower-body exercise where one leg steps forward while bending both knees, engaging the glutes and quads.",
                calorie = 3.0,
                level = "Beginner"
            ),
            Exercise(
                id = 3,
                name = "Squat",
                image = R.drawable.squat,
                description = "A compound movement where you lower your hips from a standing position, strengthening the legs and core.",
                calorie = 3.8,
                level = "Beginner"
            ),
            Exercise(
                id = 4,
                name = "Sit up",
                image = R.drawable.sit_ups,
                description = "An abdominal exercise where you lift your torso from a lying position, engaging core muscles.",
                calorie = 5.0,
                level = "Advance"
            ),
            Exercise(
                id = 5,
                name = "Chest press",
                image = R.drawable.chest_press,
                description = "A weightlifting movement where you push a barbell or dumbbells away from your chest, strengthening the upper body.",
                calorie = 7.0,
                level = "Advance"
            ),
            Exercise(
                id = 6,
                name = "Dead lift",
                image = R.drawable.dead_lift,
                description = "A full-body strength exercise where you lift a loaded barbell from the ground, primarily engaging the back and legs.",
                calorie = 10.0,
                level = "Advance"
            ),
            Exercise(
                id = 7,
                name = "Shoulder press",
                image = R.drawable.shoulder_press,
                description = "An upper-body movement where you push weights overhead, targeting the deltoid muscles.",
                calorie = 9.0,
                level = "Advance"
            )
        )
    }
}
