package montoya.eduardo.thecheezary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class HotActivity : AppCompatActivity() {
    var hotDrinks = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hot)

        agregarProductos()

        var listview: ListView = findViewById(R.id.listview) as ListView
        var adaptador: adaptadorProductos = adaptadorProductos(this, hotDrinks)
        listview.adapter = adaptador
    }

    fun agregarProductos()    {
        hotDrinks.add(Product("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk", 6.0))
        hotDrinks.add(Product("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5.0))
        hotDrinks.add(Product("Espresso", R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4.0))
        hotDrinks.add(Product("Chai Latte", R.drawable.chailatte, "Spiced tea concentrate with milk", 6.0))
        hotDrinks.add(Product("Capuccino", R.drawable.capuccino, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7.0))
        hotDrinks.add(Product("American coffee", R.drawable.americano, "Espresso with hot water", 2.0))
    }

}