package com.excellent.navigationdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.excellent.navigationdemo.R
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_one.*

/**
 * 作者：WangBinBin on 1/9 15:19
 * 邮箱：1205998131@qq.com
 */
class FragmentOne : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentOne", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goto_fragment_two.setOnClickListener {
            findNavController().navigate(R.id.goto_fragment_two)
            // 支持fragment跳转传值
            //var bundle = Bundle()
            //bundle.putString("id","1")
            //bundle.putInt("taskId",0)
            //Navigation.findNavController(view).navigate(R.id.goto_fragment_two,bundle)
        }
    }

}