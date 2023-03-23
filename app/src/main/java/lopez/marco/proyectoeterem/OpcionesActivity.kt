package lopez.marco.proyectoeterem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OpcionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        var volver: Button =findViewById(R.id.btn_volver)
        var ayuda: Button =findViewById(R.id.btn_ayuda)
        var config: Button =findViewById(R.id.btn_configuracion)
        var cerrarSesion: Button =findViewById(R.id.btn_cerrar_sesion)

        volver.setOnClickListener{
            var intento= Intent(this, InicioActivity::class.java)
            this.startActivity(intento)
        }

    }
}