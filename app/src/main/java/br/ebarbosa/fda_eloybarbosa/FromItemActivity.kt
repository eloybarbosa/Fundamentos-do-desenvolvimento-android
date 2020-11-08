package br.ebarbosa.fda_eloybarbosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_from_item.*

class FromItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_from_item)

        btnForItemSalvar.setOnClickListener {
            finish()
            //intent = Intent ( this, MainActivity::class.java)
           // startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("CicloDeVida", "FromItemActivity  OnStart")

    }
    override fun onResume() {
        super.onResume()
        Log.i("CicloDeVida", "FromItemActivity  OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("CicloDeVida", "FromItemActivity  OnPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("CicloDeVida", "FromItemActivity  OnStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("CicloDeVida", "FromItemActivity OnRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloDeVida", "FromItemActivity OnDestroy")
    }

}