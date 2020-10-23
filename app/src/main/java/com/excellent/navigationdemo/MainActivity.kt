package com.excellent.navigationdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.plusAssign
import androidx.navigation.ui.setupWithNavController
import com.lzf.easyfloat.EasyFloat
import com.lzf.easyfloat.anim.AppFloatDefaultAnimator
import com.lzf.easyfloat.anim.DefaultAnimator
import com.lzf.easyfloat.enums.ShowPattern
import com.lzf.easyfloat.enums.SidePattern
import com.lzf.easyfloat.interfaces.OnInvokeView
import kotlinx.android.synthetic.main.activity_fragment_test.*
import kotlinx.android.synthetic.main.activity_main.*

/**
 * lff
 */
class MainActivity : AppCompatActivity() {

    var mContext: Context = this

    var checkBox:CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            EasyFloat.with(this)
                .setShowPattern(ShowPattern.ALL_TIME)
                .setTag("float")
                .setDragEnable(true)
                .setGravity(Gravity.CENTER)
                .setDragEnable(false)
                .setMatchParent(widthMatch = false, heightMatch = false)
                .setAppFloatAnimator(AppFloatDefaultAnimator())
                .setLayout(R.layout.tabhost_test)
                .invokeView(OnInvokeView {

                    val tab = it.findViewById<TabHost>(R.id.tabhost)
                    //初始化TabHost容器
                    tab.setup()
                    //在TabHost创建标签，然后设置：标题／图标／标签页布局
                    tab.addTab(tab.newTabSpec("tab1").setIndicator("本地音乐", null).setContent(R.id.tab1))
                    tab.addTab(tab.newTabSpec("tab2").setIndicator("网络音乐", null).setContent(R.id.tab2))

                    checkBox = it.findViewById<CheckBox>(R.id.tech_build_check)

                    it.findViewById<Button>(R.id.test_button).setOnClickListener {
                        Toast.makeText(applicationContext, "checkBox状态 = " + checkBox!!.isChecked, 2000.toInt()).show()
                    }

                })
                .show()

            //startActivity(Intent(this, TabhostActivity::class.java))
        }

    }


}
