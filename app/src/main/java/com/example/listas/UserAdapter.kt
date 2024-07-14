package com.example.listas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.listas.databinding.ItemUserBinding
import com.example.listas.databinding.ActivityMainBinding

class UserAdapter (private val users: List<User>, private val listener: OnClickListener)
    : RecyclerView.Adapter<UserAdapter.ViewHolder>(){

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

            setListener(user,position + 1) //llamada al evento del holder que pasa al activity
            binding.tvOrder.text = (position + 1).toString()
            binding.tvName.text = user.getFullName()


            Glide.with(context)
                .load(user.url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .circleCrop()
                .into(binding.imgPhoto)



        }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemUserBinding.bind(view)

        //Preparando el adaptador para pasar los cambios a la actividad
        fun setListener(user:User, position: Int){
            binding.root.setOnClickListener{listener.OnClick(user, position)}
        }

    }

}