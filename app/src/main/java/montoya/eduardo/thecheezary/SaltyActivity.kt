package montoya.eduardo.thecheezary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SaltyActivity : AppCompatActivity() {
    var salty = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salty)

        agregarProductos()

        var listview: ListView = findViewById(R.id.listview) as ListView
        var adaptador: adaptadorProductos = adaptadorProductos(this, salty)
        listview.adapter = adaptador
    }

    fun agregarProductos()    {
        salty.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6.0))
        salty.add(Product("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5.0))
        salty.add(Product("Panini", R.drawable.hampanini, "Sandwich made with Italian bread  served warmed by grilling.", 4.0))
        salty.add(Product("Philly cheese steak", R.drawable. phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6.0))
        salty.add(Product("Nachos", R.drawable. nachos,"Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7.0))
    }

}