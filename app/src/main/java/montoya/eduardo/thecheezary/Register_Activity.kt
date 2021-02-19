package montoya.eduardo.thecheezary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_)

        var button: Button = findViewById(R.id.button_sing_in)

        button.setOnClickListener {
            var intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}