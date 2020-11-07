package com.example.ejerciciolisteners

import android.annotation.SuppressLint
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class principal : AppCompatActivity() {

    private lateinit var boton : Button
    private lateinit var editText : EditText
    private lateinit var imageView: ImageView

    private val textWatcher = object : TextWatcher {

        @SuppressLint("SetTextI18n")
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        @SuppressLint("SetTextI18n")
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {ç

            if (boton.isClickable())
                editText.isActivated
            boton.text = "Finalizar"
            boton.isClickable
            boton.isEnabled
            boton.text = ""

            if (editText.isFocusable)
                editText.setText("")

        }

        override fun afterTextChanged(p0: Editable?) {
        }
    }

    private val textWatcher2 = object : TextWatcher {

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun afterTextChanged(p0: Editable?) {
            if (editText.text.equals(""))
                imageView.isActivated
        }

    }


    //private val textWatcher2 = object : TextWatcher {

        //override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        //}

        //override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        //}

        //override fun afterTextChanged(p0: Editable?) {
            //if (editText.text.equals("Wayne"))
        //}