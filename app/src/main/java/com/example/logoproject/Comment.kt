package com.example.logoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.logoproject.databinding.ActivityCommentBinding


class Comment : AppCompatActivity() {
    private lateinit var binding:ActivityCommentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val commentList = ArrayList<CommentType>()

        binding.back.setOnClickListener {
            val intent = Intent(this,AllProductPage::class.java)
            startActivity(intent)
        }


        binding.comBtn.setOnClickListener {
            var use = binding.use.text.toString()
            var com = binding.com.text.toString()
            if (use.isNotEmpty() && com.isNotEmpty()) {
                commentList.add(CommentType(R.drawable.profile, "$use", "$com"))
                binding.commentRecycleView.adapter?.notifyDataSetChanged()

                binding.use.text.clear()
                binding.com.text.clear()
            }
        }
        commentList.add(CommentType(R.drawable.img_7,"Aimer","Lego is so good"))
        commentList.add(CommentType(R.drawable.img_11,"TOMOO","best lego in the world"))
        commentList.add(CommentType(R.drawable.img_10,"Lilas Ikuta","this is lego change my life"))
        commentList.add(CommentType(R.drawable.img_8,"Mirei","this make my day"))
        commentList.add(CommentType(R.drawable.img_12,"TOMOO","can I get a trial?"))
        commentList.add(CommentType(R.drawable.img,"Aimer","good quality Lego"))
        commentList.add(CommentType(R.drawable.img_1,"Fujii Kaze","SAYONARA BABY SAYONARA BABY SAYONARA BABY   "))


        val commentAdapter =  CommentAdapter(commentList)
        binding.commentRecycleView.apply {
            adapter = commentAdapter
            layoutManager = LinearLayoutManager(this@Comment)
        }





    }
}