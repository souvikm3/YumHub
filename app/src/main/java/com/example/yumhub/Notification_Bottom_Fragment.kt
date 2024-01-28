package com.example.yumhub

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yumhub.adapter.NotificationAdapter
import com.example.yumhub.databinding.FragmentHistoryBinding
import com.example.yumhub.databinding.FragmentNotificationBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Notification_Bottom_Fragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentNotificationBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotificationBottomBinding.inflate(layoutInflater,container,false)
        val notifications = listOf("Your order has been Canceled Successfully","Order has been taken by the driver","Congrats Your Order Placed")
        val notificationImages = listOf(R.drawable.sademoji, R.drawable.car,R.drawable.illustration)
            val adapter =NotificationAdapter(
                ArrayList(notifications),
                ArrayList(notificationImages)
            )
        binding.notificationRecyclerView.layoutManager =LinearLayoutManager(requireContext())
        binding.notificationRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}