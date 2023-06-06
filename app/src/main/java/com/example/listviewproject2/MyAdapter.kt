package com.example.listviewproject2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context:Activity,val arrayList: ArrayList<User>): ArrayAdapter<User>(context,R.layout.eachlistview,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater=LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachlistview,null)


        val name=view.findViewById<TextView>(R.id.name)
        val lastMesg=view.findViewById<TextView>(R.id.lastmesg)
        val lastMesgTime=view.findViewById<TextView>(R.id.lastMesgTime)
        val profile=view.findViewById<CircleImageView>(R.id.profile_image)

        name.text=arrayList[position].name
        lastMesg.text=arrayList[position].lastMesg
        lastMesgTime.text=arrayList[position].lastMesgTime
        profile.setImageResource(arrayList[position].profilePic)

        return view
    }
}