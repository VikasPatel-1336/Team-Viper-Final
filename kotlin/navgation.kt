package san.rul.teamviper

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class navgation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navgation)

        val next: TextView = findViewById(R.id.guide)
        val report: TextView = findViewById(R.id.report1)


        next.setOnClickListener() {
            val intent = Intent(this, guidelines::class.java)
            startActivity(intent)
        }



        report.setOnClickListener() {
            val intent2 = Intent(this, report::class.java)
            startActivity(intent2)
        }

    }
}