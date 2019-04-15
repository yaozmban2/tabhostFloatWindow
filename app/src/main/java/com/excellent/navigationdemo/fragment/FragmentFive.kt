package com.excellent.navigationdemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.excellent.navigationdemo.R

/**
 * 作者：WangBinBin on 1/9 15:25
 * 邮箱：1205998131@qq.com
 */
class FragmentFive : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_five,container,false)
    }
}