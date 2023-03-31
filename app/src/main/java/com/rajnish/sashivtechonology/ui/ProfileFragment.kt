package com.rajnish.sashivtechonology.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rajnish.sashivtechonology.R
import com.rajnish.sashivtechonology.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var binding: FragmentProfileBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentProfileBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        binding.imgPic.setOnClickListener{
            val action = ProfileFragmentDirections.actionProfileFragmentToEditProfileFragment()
            navController.navigate(action)
        }
    }
}
