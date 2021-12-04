package olga.example.mysecond

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

private const val HELLO_KEY = "hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nextActivityButton = findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {


            val googlelink = Uri.parse("https://google.com")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, googlelink)
            val chooser=Intent.createChooser(openBrowserIntent, "Browser")
            startActivity(chooser)
        }

    }

}


