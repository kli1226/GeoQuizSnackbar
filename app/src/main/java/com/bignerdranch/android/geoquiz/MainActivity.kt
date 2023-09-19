package com.bignerdranch.android.geoquiz
import com.google.android.material.snackbar.Snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            val trueAns = Snackbar.make(
                view,
                R.string.correct_snackbar,
                Snackbar.LENGTH_SHORT
            )
            trueAns.show()
        }

        falseButton.setOnClickListener { view: View ->
            val falseAns = Snackbar.make(
                view,
                R.string.incorrect_snackbar,
                Snackbar.LENGTH_SHORT
            )
            falseAns.show()
        }
    }
}
