package com.example.dz6_3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz6_3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val list = arrayListOf<Song>()
    private lateinit var adapter: SongAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initAdapter()
    }

    private fun loadData() {
        list.add(Song("Круглый год", "Anacondaz", "4:20", 1))
        list.add(Song("Englishman", "Sting", "3:12", 2))
        list.add(Song("Моя игра", "Basta", "3:16", 3))
        list.add(Song("Инкогнито", "Picnic", "3:10", 4))
        list.add(Song("Лесник", "Король И Шут", "3:17", 5))
        list.add(Song("Трасса Е-95", "Алиса", "3:36", 6))
        list.add(Song("Штиль", "Ария", "5:35", 7))
    }

    private fun initAdapter() {
        adapter = SongAdapter(list, this::onClickItem)
        binding.recycler.adapter = adapter
    }

    private fun onClickItem(name : String) {
        val intent = Intent(requireContext(), SecondActivity()::class.java)
        intent.putExtra("nameMusic", name)
        startActivity(intent)
    }
}