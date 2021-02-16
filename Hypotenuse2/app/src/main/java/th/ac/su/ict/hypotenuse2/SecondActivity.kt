package th.ac.su.ict.hypotenuse2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    var a :Float? = null
    var b :Float? = null
    var c : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var tvA = findViewById<TextView>(R.id.vtAResult)
        var tvB = findViewById<TextView>(R.id.vtBResult)
        var tvC = findViewById<TextView>(R.id.vtCResult)
        var btnOk = findViewById<Button>(R.id.btnOk)


        a = intent.getFloatExtra("a", 0.0f)
        b = intent.getFloatExtra("b", 0.0f)
        c = intent.getDoubleExtra("c", -1.0)

        tvA.setText(a.toString())
        tvB.setText(b.toString())
        tvC.setText(c.toString())


        btnOk.setOnClickListener{
            var intent = Intent()
            intent.putExtra("a",tvA.text.toString())
            intent.putExtra("b",tvB.text.toString())
            setResult(Activity.RESULT_OK,intent)

            finish()

        }

    }
}


