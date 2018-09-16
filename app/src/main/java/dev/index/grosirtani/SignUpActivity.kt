package dev.index.grosirtani

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnDaftarOTP = findViewById<View>(R.id.btnDaftarOTP) as Button
        val back = findViewById<View>(R.id.back) as ImageView

        back!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val b = Intent(applicationContext, FirstLoginActivity::class.java)
                startActivity(b)
            }
        })

        btnDaftarOTP!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val dftr = Intent(applicationContext, OTPActivity::class.java)
                startActivity(dftr)
            }
        })

    }
}
