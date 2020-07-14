package kr.co.tjoeun.pizzastore_20200714.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kr.co.tjoeun.pizzastore_20200714.R
import kr.co.tjoeun.pizzastore_20200714.datas.PizzaStore

class PizzaStoreAdapter(
    val mContext:Context,
    val resId:Int,
    val mList:List<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)

        val data = mList[position]

        nameTxt.text = data.name

        Glide.with(mContext).load(data.logoUrl).into(logoImg)

        return row
    }

}