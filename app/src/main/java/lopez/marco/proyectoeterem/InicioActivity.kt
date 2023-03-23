package lopez.marco.proyectoeterem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        var boton: Button =findViewById(R.id.btn_detalles_lugar)
        var inicio: View =findViewById(R.id.image_view_inicio)
        var social: View =findViewById(R.id.image_view_social)
        var busqueda: View =findViewById(R.id.image_view_busqueda)
        var opciones: View =findViewById(R.id.view_opciones)
        var promociones: View =findViewById(R.id.image_view_promociones)

        boton.setOnClickListener{
            var intento= Intent(this, DetalleLugarActivity::class.java)
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

        opciones.setOnClickListener{
            var intento= Intent(this, OpcionesActivity::class.java)
            this.startActivity(intento)
        }

        promociones.setOnClickListener{
            var intento= Intent(this, PromocionesActivity::class.java)
            this.startActivity(intento)
        }
    }
}