package com.natlus.courtcounter.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.natlus.courtcounter.viewmodels.CounterViewModel
import com.natlus.courtcounter.R
import com.natlus.courtcounter.databinding.CounterFragmentBinding

class CounterFragment : Fragment() {
    private lateinit var viewModel: CounterViewModel
    private lateinit var binding: CounterFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.counter_fragment, container, false)
        viewModel = ViewModelProvider(this).get(CounterViewModel::class.java)
        binding.counterViewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}