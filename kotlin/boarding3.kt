package san.rul.teamviper

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class boarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding3)
        val next: TextView = findViewById(R.id.get_started)


        next.setOnClickListener() {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}