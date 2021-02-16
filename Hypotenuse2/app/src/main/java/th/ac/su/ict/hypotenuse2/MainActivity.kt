package th.ac.su.ict.hypotenuse2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import th.ac.su.ict.hypotenuse2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<EditText>(R.id.a)
        val b = findViewById<EditText>(R.id.b)
        //val total = findViewById<TextView>(R.id.total)
        val bt = findViewById<TextView>(R.id.solve)



        bt.setOnClickListener() {
            var aNum: Float = a.text.toString().toFloat()
            var bNum: Float = b.text.toString().toFloat()

            var totalNum: Float = ((aNum * aNum) + (bNum * bNum))
            var lastNum: Double = Math.sqrt(totalNum.toDouble())

            //total.text = "C =" + lastNum.toString()


            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("a", aNum!!)
            intent.putExtra("b", bNum!!)
            intent.putExtra("c", lastNum!!)

            startActivity(intent)


        }


    }

}
