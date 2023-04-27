package com.example.hw2_month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw2_month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var list: ArrayList<Photo>
    private lateinit var adapter: PhotoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        initAdapter()
    }

    private fun initAdapter() {
        adapter = PhotoAdapter(list)
        binding.recyclerView.adapter = adapter
    }

    private fun loadData() {
        list = ArrayList()
        list.add(Photo("https://i.pinimg.com/736x/0e/71/ec/0e71eccb48b35e512719f712f1289fca.jpg"))
        list.add(Photo("https://i1.sndcdn.com/artworks-GVJX4ENgJXJ3Nmd1-vks5oQ-t500x500.jpg"))
        list.add(Photo("https://www.gluwee.com/wp-content/uploads/2021/08/Sunwoo-The-Boyz_cover.jpg"))
        list.add(Photo("https://webnewsobserver.com/wp-content/uploads/2022/08/The-BOYZs-member-Sunwoo-goes-on-a-hiatus-owing-to-health-problems-800x500.jpg"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNSZvu5k-SunlUdc-_GSrSsR5G7DmUE2VXMg&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFjE1KAhwyCfeGLxxswV63C0a3TK0uExV2dw&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7r1oiUez4ZPx0pq7qrlsX6ggar17iiSlYTQ&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnK9wmlXuG-kKY_5HNypGjHHuUfIOGuA4bCQ&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBGRGJ8P7RJc9H_rzd5ao7JiVW4xXDHvkGBQ&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNJn-4RizNgbcVipo7zNVnYI6wyIPW3dTAaA&usqp=CAU"))
        list.add(Photo("https://i.pinimg.com/originals/f3/03/1c/f3031c2a7cfc8fdd4e90a32b5ccb8c91.jpg"))
        list.add(Photo("https://www.adorama.com/alc/wp-content/uploads/2017/11/shutterstock_114802408-825x465.jpg"))
        list.add(Photo("https://images.all-free-download.com/images/graphiclarge/beautiful_scenery_04_hd_images_166175.jpg"))
        list.add(Photo("https://i.pinimg.com/originals/e6/87/24/e68724db306f08ee2ab2d3ed9f6ea8bb.jpg"))
        list.add(Photo("https://st.depositphotos.com/1903767/3375/i/600/depositphotos_33751169-stock-photo-provence-france-lavender-in-a.jpg"))
    }
}