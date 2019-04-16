package com.excellent.navigationdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.excellent.navigationdemo.R
import kotlinx.android.synthetic.main.fragment_two.*

/**
 * 作者：WangBinBin on 1/9 15:23
 * 邮箱：1205998131@qq.com
 */
class FragmentTwo : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentTwo", "onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_goto_fragment_three.setOnClickListener {
            findNavController().navigate(R.id.goto_fragment_three)
        }

        back_to_fragment_one.setOnClickListener { Navigation.findNavController(it).navigateUp() }

    }

}