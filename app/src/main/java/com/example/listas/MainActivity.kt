package com.example.listas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //inflar el activity
        setContentView(binding.root) //bindear l.a vista


        //Pasamos un listado que puede cambiarse
        userAdapter = UserAdapter(getUsers())
        linearLayoutManager = LinearLayoutManager(this)


        // Set up the toolbar
        setSupportActionBar(binding.toolbar)


        //Set the title
        supportActionBar?.title = "Usuarios"

        binding.recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }


    }


    private fun getUsers(): MutableList<User>{
        val users = mutableListOf<User>()

        val antonio = User(1,"Antonio", "Gallegos", "https://img.redbull.com/images/c_crop,x_283,y_0,h_1080,w_864/c_fill,w_450,h_600/q_auto:low,f_auto/redbullcom/2018/09/04/c71e5b50-b02e-4a42-89a3-3c8f9de164b0/spider-man-ps4")
        val jesus = User(2, "Jesus", "Martinez", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfPtXqokzLm0qolCvBsZmazYU1hixn9jUSbg&s")
        val emma = User(3, "Emma", "Lopez", "https://static.wikia.nocookie.net/monster/images/3/3b/Carnage_marvel.jpg/revision/latest/scale-to-width-down/348?cb=20210607120528")
        val stone = User(4, "Stone", "Watson", "https://www.mundodeportivo.com/alfabeta/hero/2023/01/Miles-Morales-resulta-ser-mejor-Spider-Man-que-Peter-Parker.jpg?width=768&aspect_ratio=16:9&format=nowebp")

        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        users.add(antonio)
        users.add(jesus)
        users.add(emma)
        users.add(stone)
        return users
    }
}