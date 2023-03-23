package lopez.marco.proyectoeterem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InicioSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        var boton: Button =findViewById(R.id.btn_login)
        var registrarse: TextView =findViewById(R.id.text_registrar)

        boton.setOnClickListener{
            var intento= Intent(this, InicioActivity::class.java)
            this.startActivity(intento)
        }

        registrarse.setOnClickListener{
            var intento= Intent(this, RegistroSesionActivity::class.java)
            this.startActivity(intento)
        }
    }
}