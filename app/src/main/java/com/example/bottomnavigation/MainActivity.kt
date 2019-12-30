package com.example.bottomnavigation

import android.icu.text.CaseMap
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.AttributedString

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }

    fun sendMessage1(view: View) {
        val rastgele = ("abcçdefgğhıijklmnoöprsştuüvyzz").random()
        textView.text= "?"
        textView5.text=rastgele.toString()
    }

    fun sendMessage2(view: View) {
        textView.text=textView5.text
    }

    fun Cevir(view: View) {
      val dizi1 = editText1.text.toString().toCharArray()

      val dizi2 = mutableListOf<String>()


        var i = 0
        while (i<dizi1.size) {
         if (dizi1[i].isUpperCase())
           {
               dizi2.add("&" + dizi1[i].toLowerCase().toString())
          }
           else
           {
               dizi2.add(dizi1[i].toString())
           }
           i++
       }
        val metin = editText1.text.toString()
        // bu araya büyük harfin indeksini belirleyen bir donksiyon yazmak lazım. böylece büyük harf işareti koyabilirim.
       val metin2 = metin.toLowerCase()
        textView2.text = dizi2.joinToString("","","",-1,"...",null)
       textView3.text = dizi2.joinToString("","","",-1,"...",null)

        // textView3.text =dizi[0].toString()+dizi[1].toString()
    }

}
