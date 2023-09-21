package san.rul.teamviper

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginbtn: Button = findViewById(R.id.nextbutton)
        val signin: TextView = findViewById(R.id.donthaveac)

        signin.setOnClickListener() {

            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
        loginbtn.setOnClickListener(){
            val intent = Intent(this, navgation::class.java)
            startActivity(intent)
        }
    }
}