package san.rul.teamviper

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val loginbtn : Button = findViewById(R.id.Loginbtn)
        val signin : TextView = findViewById(R.id.donthave)

        loginbtn.setOnClickListener(){
            val intent = Intent(this, OtpActivity::class.java)
            startActivity(intent)
        }

        signin.setOnClickListener(){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}