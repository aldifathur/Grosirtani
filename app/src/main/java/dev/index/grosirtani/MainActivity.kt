package dev.index.grosirtani

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null

    private val mOnNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener{
        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            when (item.itemId){
                R.id.navigation_home -> {
                    val fragment = HomeFragment.Companion.newInstance()
                    addFragment(fragment)
                    return true
                }
                R.id.navigation_keranjang -> {
                    val fragment = KeranjangFragment()
                    addFragment(fragment)
                    return true
                }
                R.id.navigation_transaksi -> {
                    val fragment = TransaksiFragment()
                    addFragment(fragment)
                    return true
                }
                R.id.navigation_profile -> {
                    val fragment = ProfileFragment()
                    addFragment(fragment)
                    return true
                }
            }
            return false
        }
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.design_snackbar_in, R.anim.design_snackbar_out)
                .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
                .addToBackStack(fragment.javaClass.getSimpleName())
                .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content = findViewById(R.id.content) as FrameLayout
        val navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


        val fragment = HomeFragment.Companion.newInstance()
        addFragment(fragment)

    }
}
