package dev.index.grosirtani

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.ImageView

class OTPActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val back = findViewById<View>(R.id.back) as ImageView
        val btnDaftarFix = findViewById<View>(R.id.btnDaftarFix) as Button

        back!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val b = Intent(applicationContext, SignUpActivity::class.java)
                startActivity(b)
            }
        })

        btnDaftarFix!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val dftr = Intent(applicationContext, MainActivity::class.java)
                startActivity(dftr)
            }
        })
    }
}
