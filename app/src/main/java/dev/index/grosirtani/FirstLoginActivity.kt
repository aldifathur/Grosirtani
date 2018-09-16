package dev.index.grosirtani

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_first_login.*


class FirstLoginActivity : AppCompatActivity() {

    // deklarasi tombol
    var btnMasuk: Button? = null
    var btnDaftar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_login)

        //inisial tombol
        btnMasuk = findViewById(R.id.btnMasuk) as Button
        btnDaftar = findViewById(R.id.btnDaftar) as Button

        // function tombol
        btnMasuk!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val iLogin = Intent(applicationContext, LoginActivity::class.java)
                startActivity(iLogin)
            }
        })

        btnDaftar!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val iDaftar = Intent(applicationContext, SignUpActivity::class.java)
                startActivity(iDaftar)
            }
        })

    }
}
