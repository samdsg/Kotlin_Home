package com.example.apptitudetest

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Stats : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        supportActionBar?.hide();

        val allStat: ArrayList<StatFeed> = ArrayList();
        allStat.add(StatFeed("Total Score", R.drawable.icon_15_trophy));
        allStat.add(StatFeed("Total Test", R.drawable.group_25));
        allStat.add(StatFeed("Previous Score", R.drawable.iconfinder_12));
        allStat.add(StatFeed("Time Taken", R.drawable.group_24));

        val simpleGrid: GridView = findViewById<GridView>(R.id.simpleGridView);
        simpleGrid.adapter = StatAdapter(this, allStat);

        val nextBtn = findViewById<ImageButton>(R.id.next_btn);
        nextBtn.setOnClickListener {
            val intent: Intent = Intent(this, Category::class.java);
            startActivity(intent)
        }


    }
}
