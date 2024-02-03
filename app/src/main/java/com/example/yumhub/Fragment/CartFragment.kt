package com.example.yumhub.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yumhub.CongratsBottomSheet
import com.example.yumhub.PayOutActivity
import com.example.yumhub.R
import com.example.yumhub.adapter.CartAdapter
//import com.example.yumhub.databinding.CartItemBinding
import com.example.yumhub.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater,container,false)
        val cartFoodName = listOf("Burger","Sandwich","Momo","Item","Sandwich","Momo")
        val cartItemPrice = listOf("$5","$4","$8","$10","$4","$8")
        val cartImage = listOf(
            R.drawable.menuphoto1,
            R.drawable.menuphoto2,
            R.drawable.menuphoto3,
            R.drawable.menuphoto1,
            R.drawable.menuphoto1,
            R.drawable.menuphoto1,
        )
        val adapter =CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter=adapter
        binding.proceedButton.setOnClickListener{
            val intent = Intent(requireContext(),PayOutActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }

    companion object {

    }
}