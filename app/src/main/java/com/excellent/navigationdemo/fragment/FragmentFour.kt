package com.excellent.navigationdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.excellent.navigationdemo.R
import kotlinx.android.synthetic.main.fragment_four.*

/**
 * 作者：WangBinBin on 1/9 15:24
 * 邮箱：1205998131@qq.com
 */
class FragmentFour : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentFour", "onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_four, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        four_4.setOnClickListener {
            Toast.makeText(context,"444",Toast.LENGTH_LONG).show()
        }
    }
}