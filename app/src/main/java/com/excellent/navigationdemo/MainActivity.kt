package com.excellent.navigationdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavOptions
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.plusAssign
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

/**
 * lff
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(this, R.id.my_nav_host_fragment)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment)!!

        val navigator = CustomNavigator(this,navHostFragment.childFragmentManager,R.id.my_nav_host_fragment)
        navController.navigatorProvider += navigator

        navController.setGraph(R.navigation.nav_graph_main)

        navigation_lin_layout.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.rbtn_home -> {
                    navController.navigate(R.id.fragmentPageOne, null)
                }

                R.id.rbtn_user_info ->{
                    navController.navigate(R.id.fragmentPageFour, null)
                }

                R.id.rbtn_setting -> {
                    navController.navigate(R.id.fragmentPageFive, null)
                }
            }
        }

    }


}
