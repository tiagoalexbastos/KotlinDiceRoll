package tiago.kotlin.com.kotlindiceroll

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val max = 6
    private val min = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollme.setOnClickListener { rollDices() }
    }

    private fun rollDices() {
        val random = Random()
        val randomNumber1 = random.nextInt(max + 1 - min) + min
        val randomNumber2 = random.nextInt(max + 1 - min) + min

        first_dice.text = randomNumber1.toString()
        second_dice.text = randomNumber2.toString()
    }
}
