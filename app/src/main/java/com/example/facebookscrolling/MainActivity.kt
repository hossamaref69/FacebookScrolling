package com.example.facebookscrolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView: RecyclerView = findViewById(R.id.recycleView)

        var myArrayList = ArrayList<User>()

        myArrayList.add(User("Ali Mohamed", R.drawable.user1mage1,"30 minutes ago", R.drawable.postpictures1))
        myArrayList.add(User("Mohamed Ismail", R.drawable.userimage2,"58 minutes ago", R.drawable.postpictures2))
        myArrayList.add(User("Yasser Ibrahim", R.drawable.userimage3,"12 minutes ago", R.drawable.postpictures3))
        myArrayList.add(User("ebrahim Ahmed", R.drawable.userimage4,"41 minutes ago", R.drawable.postpictures4))
        myArrayList.add(User("Hossam Aref", R.drawable.user_image,"1 hours age", R.drawable.postpictures5))
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val customAdepter = CustomAdepter(myArrayList)
        recyclerView.adapter = customAdepter
    }
}