package com.voss.guess

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.linear_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_main)
    }

    fun check(view: View) {
        println("answer : ${secretNumber.secret}")
        val enterNumber = ed_guessNumber.text.toString().toInt()
        var message = getString(R.string.bingo)
        if (enterNumber > secretNumber.secret) {
            message = getString(R.string.big)
        } else if (enterNumber < secretNumber.secret) {
            message = getString(R.string.small)
        }
        AlertDialog.Builder(this)
            .setTitle(getString(R.string.message))
            .setMessage(message)
            .setPositiveButton(getString(R.string.exit),null)
            .show()
//        Toast.makeText(this , message , Toast.LENGTH_LONG).show()
        if(enterNumber==secretNumber.secret)finish()
    }

}