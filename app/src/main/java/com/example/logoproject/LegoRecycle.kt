package com.example.logoproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.logoproject.databinding.LegooItemBinding

class LegoRecycle : AppCompatActivity() {

    private lateinit var binding: LegooItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LegooItemBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.back.setOnClickListener {
            val back = Intent(this,Mainpage::class.java)
            startActivity(back)
        }


        val legoItemList = ArrayList<LegoItem>()

        legoItemList.add(LegoItem(R.drawable.apicture1, R.drawable.heart, R.drawable.cart))
        legoItemList.add(LegoItem(R.drawable.apicture2, R.drawable.heart, R.drawable.cart))
        legoItemList.add(LegoItem(R.drawable.apicture3, R.drawable.heart, R.drawable.cart))
        legoItemList.add(LegoItem(R.drawable.apicture2, R.drawable.heart, R.drawable.cart))
        legoItemList.add(LegoItem(R.drawable.apicture1, R.drawable.heart, R.drawable.cart))


        val legoRecycleViewAdaptor = LegoRecycleViewAdaptor(legoItemList)
        binding.noteRecycleView.apply {
            adapter = legoRecycleViewAdaptor
            layoutManager = LinearLayoutManager(this@LegoRecycle)
        }


        legoRecycleViewAdaptor.onCartClick = {
            val intent = Intent(this,AllProductPage::class.java)
            startActivity(intent)
        }


//noteRecycleViewAdaptor.onItemClick = {
//    val intent = Intent(this,AllProductPage::class.java)
//    startActivity(intent)
//}
    }


}