package com.example.logoproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class LegoRecycleViewAdaptor(var legoItemList:ArrayList<LegoItem>):RecyclerView.Adapter<LegoRecycleViewAdaptor.LegoViewHolder>() {
    var onItemClick : ((LegoItem) -> Unit)? = null
    var onCartClick : ((LegoItem) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LegoViewHolder {
        val itemView:View = LayoutInflater.from(parent.context).inflate(R.layout.legoitem,parent,false)
        return LegoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return legoItemList.size
    }

    override fun onBindViewHolder(holder: LegoViewHolder, position: Int) {
        val current:LegoItem = legoItemList[position]
        holder.bind(current)
        holder.product.setImageResource(current.product)
        holder.favBtn.setImageResource(current.favBtn)
        holder.cartBtn.setImageResource(current.cartBtn)


        holder.itemView.setOnClickListener {
            onItemClick?.invoke(current)
        }
        holder.cartBtn.setOnClickListener {
            onCartClick?.invoke(current)
        }
    }

    class LegoViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {

        var product: ImageView = itemView.findViewById(R.id.product)
        var favBtn: ImageView = itemView.findViewById(R.id.favBtn)
        var cartBtn: ImageView = itemView.findViewById(R.id.cartBtn)


        fun bind(legoItem: LegoItem) {
            product.setImageResource(legoItem.product)
            favBtn.setImageResource(legoItem.favBtn)
            cartBtn.setImageResource(legoItem.cartBtn)



        }

    }

}

