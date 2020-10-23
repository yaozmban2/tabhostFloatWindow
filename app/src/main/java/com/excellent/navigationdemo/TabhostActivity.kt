package com.excellent.navigationdemo

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TabHost


class TabhostActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tabhost_test)

        val tab = findViewById<View>(R.id.tabhost) as TabHost

        //初始化TabHost容器
        tab.setup()
        //在TabHost创建标签，然后设置：标题／图标／标签页布局
        tab.addTab(tab.newTabSpec("tab1").setIndicator("本地音乐", null).setContent(R.id.tab1))
        tab.addTab(tab.newTabSpec("tab2").setIndicator("网络音乐", null).setContent(R.id.tab2))
    }

}