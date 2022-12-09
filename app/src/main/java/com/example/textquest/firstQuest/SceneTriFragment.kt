package com.example.textquest.firstQuest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textquest.MAIN
import com.example.textquest.R
import com.example.textquest.databinding.FragmentSceneTriBinding


class SceneTriFragment : Fragment() {  //    Handler(Looper.getMainLooper()).postDelayed({
                                        //view?.findNavController()?.navigate(R.id.beginningFragment)


//},3000)

    lateinit var binding: FragmentSceneTriBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSceneTriBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener{
            MAIN.navController.navigate(R.id.action_sceneTriFragment_to_enteringShip)

        }
    }


}