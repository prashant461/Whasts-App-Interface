package com.example.listviewproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name= arrayOf("Virat","Sachin","Ab DE Villiers","MS Dhoni","Rohit","SuryaKumar","Yuvraj","Shubhman","Ishan")
        val lastMesg= arrayOf("hey, guys lets do it..","Nice idea ","how are you?","yea did it..","No,its okay","okay lets see","yep see ya","Bro,we can do it..","yea,lets make it big")
        val lastMesgTime= arrayOf("2:34 PM","3:45 PM","9:23 AM","5:34 PM","4:23 PM","2:35 PM","8:22 AM","9:59 PM","3:55 PM")
        val mobile = arrayOf("8999989749","8999989749","8999989749","8999989749","8999989749","8999989749","8999989749","8999989749","9087767675")
        val profile= arrayOf(R.drawable.pic0,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.rohit,R.drawable.surya,R.drawable.yuvraj,R.drawable.subhman,R.drawable.ishan)

        userArrayList=ArrayList()

        for(each in name.indices){
            val user =User(name[each],lastMesg[each],lastMesgTime[each],mobile[each],profile[each])

            userArrayList.add(user)
        }

        // listview
        var listview=findViewById<ListView>(R.id.listView)

        listview.isClickable=true
        listview.adapter=MyAdapter(this,userArrayList)

        // when user click on the paticular listview then new screen will be shown to him
        listview.setOnItemClickListener { adapterView, view, i, l ->
            val name=userArrayList[i].name
            val phone=userArrayList[i].mobile
            val image=userArrayList[i].profilePic

            intent = Intent(this,OnclickActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("phone",phone)
            intent.putExtra("image",image)
            startActivity(intent)
        }
    }
}