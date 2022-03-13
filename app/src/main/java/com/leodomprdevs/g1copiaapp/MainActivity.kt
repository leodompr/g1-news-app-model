package com.leodomprdevs.g1copiaapp
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import com.leodomprdevs.g1copiaapp.R


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_G1Copia) // Selecionando tema principal
        Thread.sleep(1000) // Pausando a incialização para aumentar o tempo do splash
        setContentView(R.layout.activity_main)

        //Pegando as Views e atribuindo a variaveis
        val irNoticiasMundo : CardView = findViewById(R.id.card_noticias_mundo)
        val irNoticiasFinancas : CardView = findViewById(R.id.card_noticias_financas)
        val irNoticiasTech : CardView = findViewById(R.id.card_noticias_tech)
        val irNoticiasSaude : CardView = findViewById(R.id.card_noticias_saude)
        val irNoticiasEsporte : CardView = findViewById(R.id.card_noticias_esportes)
        val irNoticiasEntreterimento : CardView = findViewById(R.id.card_noticias_entreterimento)


        //Mandando a url para a função do WebView
        irNoticiasMundo.setOnClickListener{
            intent("https://g1.globo.com/mundo/")
        }

        irNoticiasFinancas.setOnClickListener {
            intent("https://g1.globo.com/economia/")
        }

        irNoticiasTech.setOnClickListener {
            intent("https://g1.globo.com/tecnologia/")
        }

        irNoticiasSaude.setOnClickListener {
            intent("https://g1.globo.com/saude/")
        }

        irNoticiasEsporte.setOnClickListener {
            intent("https://ge.globo.com")
        }

        irNoticiasEntreterimento.setOnClickListener {
            intent("https://g1.globo.com/pop-arte/")
        }

    }

    // Função responsavel por criar a intent
    fun intent(url:String){
        intent = Intent(applicationContext, WebOn::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

}