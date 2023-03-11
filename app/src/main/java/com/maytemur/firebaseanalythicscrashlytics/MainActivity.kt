package com.maytemur.firebaseanalythicscrashlytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firebaseAnalytics= Firebase.analytics
        throw RuntimeException("Test Cokerttik")

    }

    fun favorilereEkleTiklandi(view:View){
        val veriBundle= Bundle()
        veriBundle.putString("kullanici","maytemur")

        firebaseAnalytics.logEvent("favorilereEkleTiklandi",veriBundle)
    }
}