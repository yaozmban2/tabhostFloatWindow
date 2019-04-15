package com.excellent.navigationdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.NavOptions
import androidx.navigation.Navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

/**
 * lff
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var navController = findNavController(this, R.id.my_nav_host_fragment)

        var navBuilderOption = NavOptions.Builder().setClearTask(true).build()

        btn_home.setOnClickListener {
            navController.navigate(R.id.fragmentPageOne, null, navBuilderOption)
        }

        btn_user_info.setOnClickListener {
            navController.navigate(R.id.fragmentPageFour, null, navBuilderOption)
        }

        btn_setting.setOnClickListener {
            navController.navigate(R.id.fragmentPageFive, null, navBuilderOption)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(this, R.id.my_nav_host_fragment).navigateUp()
    }

}
