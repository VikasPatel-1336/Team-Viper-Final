package san.rul.teamviper

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Boardingone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boardingone)

        val next: TextView = findViewById(R.id.first)
        val getstart: View= findViewById(R.id.rectangle_1)


        next.setOnClickListener() {
            val intent = Intent(this, boarding2::class.java)
            startActivity(intent)
        }
        getstart.setOnClickListener(){
            val intent = Intent(this, boarding2::class.java)
            startActivity(intent)
        }

    }
}