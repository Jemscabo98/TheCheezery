package montoya.eduardo.thecheezary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class adaptadorProductos: BaseAdapter {
    var productos = ArrayList<Product>()
    var contexto: Context? = null

    constructor(context: Context, product: ArrayList<Product>){
        this.productos = product
        this.contexto = context
    }

    override fun getCount(): Int {
        return productos.size
    }

    override fun getItem(position: Int): Any {
        return productos[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var product = productos[position]
        var buffer = LayoutInflater.from(contexto)
        var vista = buffer.inflate(R.layout.producto_view, null)

        var imagen = vista.findViewById(R.id.producto_img) as ImageView
        var nombre = vista.findViewById(R.id.producto_nombre) as TextView
        var descripcion = vista.findViewById(R.id.producto_descripcion) as TextView
        var precio = vista.findViewById(R.id.producto_precio) as TextView

        imagen.setImageResource(product.image)
        nombre.setText(product.name)
        descripcion.setText(product.descripcion)
        precio.setText("$${product.price}")

        return vista
    }

}