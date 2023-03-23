package lopez.marco.proyectoeterem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PromocionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promociones)

        var cerrar: View =findViewById(R.id.btn_cerrar)

        cerrar.setOnClickListener{
            var intento= Intent(this, InicioActivity::class.java)
            this.startActivity(intento)
        }
    }
}