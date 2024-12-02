package com.example.mobile.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mobile.Activity.DetailActivity
import com.example.mobile.Model.ItemsModel
import com.example.mobile.databinding.ViewholderItemBinding

class ListItemAdapter(val items: MutableList<ItemsModel>) :
    RecyclerView.Adapter<ListItemAdapter.Viewholder>() {

    private var context: Context? = null

    // ViewHolder que segura a referência do binding
    class Viewholder(val binding: ViewholderItemBinding) : RecyclerView.ViewHolder(binding.root)

    // Criação do ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        context = parent.context
        val binding = ViewholderItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return Viewholder(binding)
    }

    // Vincula os dados aos componentes da interface (UI)
    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.binding.titleTxt.text = items[position].title
        holder.binding.priceTxt.text = "$" + items[position].price.toString()
        holder.binding.subtitleTxt.text = items[position].extra

        // Usando Glide para carregar a imagem
        Glide.with(holder.itemView.context)
            .load(items[position].picUrl[0])
            .into(holder.binding.img)

        // Configura o click para a atividade de detalhes
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("object", items[position]) // Envio do item como extra
            holder.itemView.context.startActivity(intent)
        }
    }

    // Retorna o número de itens da lista
    override fun getItemCount(): Int = items.size
}