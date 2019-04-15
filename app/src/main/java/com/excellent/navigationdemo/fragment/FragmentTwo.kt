package com.excellent.navigationdemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.excellent.navigationdemo.R
import kotlinx.android.synthetic.main.fragment_two.*

/**
 * 作者：WangBinBin on 1/9 15:23
 * 邮箱：1205998131@qq.com
 */
class FragmentTwo : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_goto_fragment_three.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goto_fragment_three)
        }

        back_to_fragment_one.setOnClickListener { Navigation.findNavController(it).navigateUp() }

    }

}