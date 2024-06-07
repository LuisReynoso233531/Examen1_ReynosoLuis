package mx.itson.edu.e1ReynosoLuis

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var descuento = 0.0f
        var precioCompleto = 0.0f

        var boton10: Button = findViewById(R.id.button)
        var boton15: Button = findViewById(R.id.button2)
        var boton20: Button = findViewById(R.id.button3)
        var boton25: Button = findViewById(R.id.button4)
        var boton30: Button = findViewById(R.id.button5)
        var boton40: Button = findViewById(R.id.button6)
        var botonPropina: Button = findViewById(R.id.button7)
        var botonPrecio: Button = findViewById(R.id.button8)
        var textoDescuento: TextView = findViewById(R.id.textView6)
        var textoPrecio: EditText = findViewById(R.id.editTextNumber)
        var precioTotal: TextView = findViewById(R.id.textView7)

        boton10.setOnClickListener {
            descuento = 0.1f
        }
        boton15.setOnClickListener {
            descuento = 0.15f
        }
        boton20.setOnClickListener {
            descuento = 0.20f
        }
        boton25.setOnClickListener {
            descuento = 0.25f
        }
        boton30.setOnClickListener {
            descuento = 0.30f
        }
        boton40.setOnClickListener {
            descuento = 0.40f
            println(descuento)
        }
        botonPropina.setOnClickListener {
            val textoPrecio = textoPrecio.text.toString().toFloat()
            val descuentoTotal=descuentoPrecio(textoPrecio, descuento)

            val precio=dineroTotal(descuentoTotal,textoPrecio)
            textoDescuento.setText(descuentoTotal.toString())
            precioTotal.setText(precio.toString())

        }

        botonPrecio.setOnClickListener{
            val textoPrecio = textoPrecio.text.toString().toFloat()
            val descuentoTotal=descuentoPrecio(textoPrecio, descuento)

            val precio=quitarDescuento(descuentoTotal,textoPrecio)
            textoDescuento.setText(descuentoTotal.toString())
            precioTotal.setText(precio.toString())
        }

    }


    fun descuentoPrecio(precioCompleto: Float, descuento: Float): Float {
        val descuento: Float = descuento * precioCompleto
        println(descuento)
        return descuento
    }

    fun dineroTotal(descuento: Float, precioCompleto: Float): Float {
        val totalDinero: Float = descuento + precioCompleto
        return totalDinero
    }

    fun quitarDescuento(descuento: Float, precioCompleto: Float): Float {
        val totalDinero: Float = precioCompleto - descuento
        return totalDinero
    }

}