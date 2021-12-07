package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var doneButton: Button
    lateinit var nicknameEdit: EditText
    lateinit var nicknameText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doneButton = findViewById(R.id.done_button)
        nicknameEdit = findViewById(R.id.nickname_edit)
        nicknameText = findViewById(R.id.nickname_textview)

        doneButton.setOnClickListener{
            displayNickname(it)
        }
    }

    private fun displayNickname(view: View){
        nicknameText.text = nicknameEdit.text
        doneButton.visibility = View.GONE
        nicknameEdit.visibility = View.GONE
        nicknameText.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}