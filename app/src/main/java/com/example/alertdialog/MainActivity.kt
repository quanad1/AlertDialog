package com.example.alertdialog

import android.graphics.Color
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(view: View) {
        val builder:AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle(("App Background color"))
        builder.setMessage("Are you want to set the app background color to RED??")
        builder.setIcon(R.drawable.ic_launcher_background)


        builder.setPositiveButton("YES"){dialog, which ->
            Toast.makeText(applicationContext,"Ok, we change the app background.",Toast.LENGTH_SHORT).show()

            val rootLayout:LinearLayout = findViewById(R.id.root_layout)
            rootLayout.setBackgroundResource(R.color.red)
        }
        builder.setNegativeButton("No"){dialog,which ->
            Toast.makeText(applicationContext,"You are not agree.",Toast.LENGTH_SHORT).show()
        }
        builder.setNeutralButton("Cancel"){_,_ ->
            Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}