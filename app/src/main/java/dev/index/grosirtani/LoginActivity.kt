package dev.index.grosirtani

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val back = findViewById<View>(R.id.back) as ImageView
        val tvDaftar = findViewById<View>(R.id.tvDaftar) as TextView
        val btnMasukFix = findViewById<View>(R.id.btnMasukFix) as Button

        back!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val b = Intent(applicationContext, FirstLoginActivity::class.java)
                startActivity(b)
            }
        })

        btnMasukFix!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val msk = Intent(applicationContext, MainActivity::class.java)
                startActivity(msk)
            }
        })

        tvDaftar!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val dftr = Intent(applicationContext, SignUpActivity::class.java)
                startActivity(dftr)
            }
        })

    }
}
