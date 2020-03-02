package garcia.luis.popcornfactory

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.celda_pelicula.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        var intent:Intent = Intent(this, CatalogActivity::class.java)

        // Buttons
        val boton:Button = findViewById(R.id.boton) as Button

        // Actions
        boton.setOnClickListener{
            startActivity(intent)
        }
    }
}
