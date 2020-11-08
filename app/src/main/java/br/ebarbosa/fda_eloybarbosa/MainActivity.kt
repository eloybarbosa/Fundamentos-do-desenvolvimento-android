package br.ebarbosa.fda_eloybarbosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_from_item.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("CicloDeVida", "MainAcitovoty OnCreate")

        //var textViewOlaMundo = findViewById<TextView>(R.id.txtVwOlaMundo)
        //btnAcessar.text = "Acessar"

        btnSub.setOnClickListener {
            contador--
            txtVwOlaMundo.text = "$contador"
        }

        btnAdd.setOnClickListener {
            //txtVwOlaMundo.text = "Você me Clicou!!!"
            //actionBtn()
            contador++
            txtVwOlaMundo.text = "$contador"
            var toast = Toast.makeText(
                    this, "Voce me Clicou!!", Toast.LENGTH_LONG
            )
            toast.show()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("CicloDeVida", "MainAcitovoty OnStart")

    }
    override fun onResume() {
        super.onResume()
        Log.i("CicloDeVida", "MainAcitovoty OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("CicloDeVida", "MainAcitovoty OnPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("CicloDeVida", "MainAcitovoty OnStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("CicloDeVida", "MainAcitovoty OnRestart")
    }

    fun actionBtn(){
        var intent = Intent (this, FromItemActivity::class.java)
        startActivity(intent)
    }

}