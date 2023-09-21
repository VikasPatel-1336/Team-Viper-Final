package san.rul.teamviper

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        val verify: Button = findViewById(R.id.verify)


        verify.setOnClickListener() {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}