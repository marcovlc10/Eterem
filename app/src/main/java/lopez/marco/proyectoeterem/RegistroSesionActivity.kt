package lopez.marco.proyectoeterem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegistroSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        var tengoCuenta: TextView =findViewById(R.id.text_tengo_cuenta)

        tengoCuenta.setOnClickListener{
            var intento= Intent(this, InicioSesionActivity::class.java)
            this.startActivity(intento)
        }

    }
}