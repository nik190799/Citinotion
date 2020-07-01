package com.android.citinotion

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.android.citinotion.Fragments.MayorInfo
import com.android.citinotion.Fragments.MayorPost
import com.android.citinotion.Fragments.MayorProfileFragment
import com.android.citinotion.Fragments.MayorsPost
import kotlinx.android.synthetic.main.activity_mayor.*

class MayorActivity : AppCompatActivity() {

    override fun onBackPressed() {

    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                replaceFragment(MayorPost())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my_posts -> {
                replaceFragment(MayorsPost())
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_camera -> {
                startActivity(Intent(this@MayorActivity, MayorPostActivity::class.java))
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_city_info -> {
                replaceFragment(MayorCityInfo())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
               replaceFragment(MayorProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mayor)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(MayorPost())


    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

}
