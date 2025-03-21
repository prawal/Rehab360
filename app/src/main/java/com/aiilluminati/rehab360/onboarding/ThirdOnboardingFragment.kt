package com.aiilluminati.rehab360.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aiilluminati.rehab360.R

/**
 * Fragment class for the third onboarding screen
 */
class ThirdOnboardingFragment : Fragment() {

    // Called to create the view for this fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.third_fragment_onboarding, container, false)
    }
}