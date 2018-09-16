package dev.index.grosirtani

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent



class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //creating thread that will sleep for 10 seconds
        val t = object : Thread() {
            override fun run() {

                try {
                    //sleep thread for 10 seconds, time in milliseconds
                    Thread.sleep(5000)

                    //start new activity
                    val i = Intent(this@SplashScreenActivity, FirstLoginActivity::class.java)
                    startActivity(i)

                    //destroying Splash activity
                    finish()

                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }

        //start thread
        t.start()
    }
}
