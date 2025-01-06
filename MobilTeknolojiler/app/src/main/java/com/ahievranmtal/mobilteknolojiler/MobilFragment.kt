package com.ahievranmtal.mobilteknolojiler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ahievranmtal.mobilteknolojiler.databinding.FragmentMobilBinding

class MobilFragment : Fragment() {
    private var _binding: FragmentMobilBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMobilBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.kotlin.setOnClickListener { kotlin(it) }
        binding.flutter.setOnClickListener { flutter(it) }
        binding.reactNative.setOnClickListener { reactNative(it) }
        binding.ionic.setOnClickListener { ionic(it) }
        binding.xamarin.setOnClickListener { xamarin(it) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun kotlin(view: View) {
        val teknoloji = "Kotlin"
        val action = MobilFragmentDirections.actionMobilFragmentToMobilDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun flutter(view: View) {
        val teknoloji = "Flutter"
        val action = MobilFragmentDirections.actionMobilFragmentToMobilDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun reactNative(view: View) {
        val teknoloji = "React Native"
        val action = MobilFragmentDirections.actionMobilFragmentToMobilDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun ionic(view: View) {
        val teknoloji = "Ionic"
        val action = MobilFragmentDirections.actionMobilFragmentToMobilDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun xamarin(view: View) {
        val teknoloji = "Xamarin"
        val action = MobilFragmentDirections.actionMobilFragmentToMobilDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }
}
