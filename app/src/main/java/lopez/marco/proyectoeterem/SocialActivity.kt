package lopez.marco.proyectoeterem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SocialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social)

        var regresar: View =findViewById(R.id.view_regresar)
        var inicio: View =findViewById(R.id.image_view_inicio)
        var social: View =findViewById(R.id.image_view_social)
        var busqueda: View =findViewById(R.id.image_view_busqueda)

        regresar.setOnClickListener{
            var intento= Intent(this, InicioActivity::class.java)
            this.startActivity(intento)
        }

        inicio.setOnClickListener{
            var intento= Intent(this, InicioActivity::class.java)
            this.startActivity(intento)
        }

        social.setOnClickListener{
            var intento= Intent(this, SocialActivity::class.java)
            this.startActivity(intento)
        }

        busqueda.setOnClickListener{
            var intento= Intent(this, BusquedaActivity::class.java)
            this.startActivity(intento)
        }
    }
}