package com.example.listviewproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class OnclickActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onclick)

        val name=intent.getStringExtra("name")
        val phone=intent.getStringExtra("phone")
        val image=intent.getIntExtra("image",R.drawable.pic0)

        val tvName=findViewById<TextView>(R.id.tVName)
        val tvphone=findViewById<TextView>(R.id.tVPhone)
        val iImage=findViewById<CircleImageView>(R.id.profile_image)
        tvphone.text=phone
        tvName.text=name
        iImage.setImageResource(image)

    }
}