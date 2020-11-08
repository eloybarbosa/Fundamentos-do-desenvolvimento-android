package br.ebarbosa.fda_eloybarbosa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ex1.*
import kotlin.random.Random

class Ex1Activity : AppCompatActivity() {
    var valorDado = 6
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)



        btnGerar.setOnClickListener {

            val valorAleatorio = java.util.Random().nextInt(valorDado) + 1
            textViewRandom.text = valorAleatorio.toString()
            textViewHistorico.text = "D$valorDado\t$valorAleatorio\n" + textViewHistorico.text.toString()
        }
/*
        btnValor04.setOnClickListener{
            valorDado = 4

        }
        btnValor10.setOnClickListener{
            valorDado = 10
        }
        btnValor20.setOnClickListener{
            valorDado = 20
        }
        btnValor30.setOnClickListener{
            valorDado = 30
        }*/
        }
        fun actionBtnSeleionaDados(it: View){
             when (it.id){
                 R.id.btnValor04 -> valorDado = 4
                 R.id.btnValor10 -> valorDado = 10
                 R.id.btnValor20 -> valorDado = 20
                 R.id.btnValor30 -> valorDado = 30
             }


    }
}