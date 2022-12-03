package ru.netology.statsview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import ru.netology.statsview.ui.StatsView

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.statsView)
        view.data = listOf(
            500F,
            500F,
            500F,
            500F,
        )

    }
}