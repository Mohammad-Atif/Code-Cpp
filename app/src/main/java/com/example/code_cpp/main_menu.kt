package com.example.code_cpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_menu.*

class main_menu : toextend() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        getting_started_btn.setOnClickListener {
            val intent=Intent(this,gt_started_activity::class.java)
            startActivity(intent)
        }



        ide_btn.setOnClickListener {

            val intent=Intent(this,Editor::class.java)
            startActivity(intent)
        }

        core_topics_btn.setOnClickListener {

            val intent=Intent(this,coretopics_activity::class.java)
            startActivity(intent)
        }

        advance_topics_btn.setOnClickListener {

            val intent=Intent(this,advancecpp_activity::class.java)
            startActivity(intent)
        }

        comp_coding_btn.setOnClickListener {

            Toast.makeText(this,"Coming soon",Toast.LENGTH_SHORT).show()
        }

        resources_used_btn.setOnClickListener {

            Toast.makeText(this,"Coming soon",Toast.LENGTH_SHORT).show()
        }

    }
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        super.onCreateOptionsMenu(menu)
//        menuInflater.inflate(R.menu.app_bar_menu,menu)
//        return true
//    }
}

