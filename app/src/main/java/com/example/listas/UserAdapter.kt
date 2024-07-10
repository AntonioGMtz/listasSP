package com.example.listas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listas.databinding.ItemUserBinding
import com.example.listas.databinding.ActivityMainBinding

class UserAdapter (private val users: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){

    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        context = parent.context

        //Iinflar la vista
        val view= LayoutInflater.from(context).inflate(R.layout.item_user,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val user = users.get(position)
        with(holder){
            binding.tvOrder.text = user.id.toString()
            binding.tvName.text = user.name



        }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemUserBinding.bind(view)

    }

}