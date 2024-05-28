package com.example.logoproject

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.logoproject.databinding.CommentitemBinding
import org.w3c.dom.Text

class CommentAdapter(var commentList: ArrayList<CommentType>) : RecyclerView.Adapter<CommentAdapter.CommentViewHolder>() {
    class CommentViewHolder(val binding: CommentitemBinding): RecyclerView.ViewHolder(binding.root) {
        var pic:ImageView = binding.pic
        var user:TextView = binding.user
        var commenter:TextView = binding.comment
        fun bind(comment:CommentType) {
            pic.setImageResource(comment.pic)
            user.text = comment.user
            commenter.text = comment.commenter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        return CommentViewHolder(CommentitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val current:CommentType = commentList[position]
        holder.bind(current)
        holder.pic.setImageResource(current.pic)
        holder.user.text = current.user
        holder.commenter.text = current.commenter
    }

    override fun getItemCount(): Int {
        return commentList.size
    }

}



