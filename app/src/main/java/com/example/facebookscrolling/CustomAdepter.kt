package com.example.facebookscrolling

import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CustomAdepter(var arrayList: ArrayList<User>) : RecyclerView.Adapter<CustomAdepter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage = itemView.findViewById(R.id.circleImageView) as CircleImageView
        val userName = itemView.findViewById(R.id.userNameTv) as TextView
        val timesAgo = itemView.findViewById(R.id.timeTv) as TextView
        val postImage = itemView.findViewById(R.id.psotImageTv) as ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val infoUser = arrayList.get(position)

        holder.profileImage.setImageResource(infoUser.userPhoto)
        holder.postImage.setImageResource(infoUser.postPhoto)
        holder.userName.text = infoUser.userName
        holder.timesAgo.text = infoUser.timeAgo

    }

}