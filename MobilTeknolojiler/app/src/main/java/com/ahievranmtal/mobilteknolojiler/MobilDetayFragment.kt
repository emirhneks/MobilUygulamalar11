package com.ahievranmtal.mobilteknolojiler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ahievranmtal.mobilteknolojiler.databinding.FragmentMobilDetayBinding

class MobilDetayFragment : Fragment() {
    private var _binding: FragmentMobilDetayBinding? = null
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
        _binding = FragmentMobilDetayBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val teknoloji = arguments?.let { MobilDetayFragmentArgs.fromBundle(it).teknoloji }
        when (teknoloji) {
            "Kotlin" -> kotlin()
            "Flutter" -> flutter()
            "React Native" -> reactNative()
            "Ionic" -> ionic()
            "Xamarin" -> xamarin()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun kotlin() {
        binding.txtDetaySayfasi.text = "Kotlin Detay Sayfası"
        binding.img.setImageResource(R.drawable.kotlin)
        binding.txtLink.setText("https://yelloware.com.tr/kotlin")
    }

    fun flutter() {
        binding.txtDetaySayfasi.text = "Flutter Detay Sayfası"
        binding.img.setImageResource(R.drawable.flutter)
        binding.txtLink.setText("https://yelloware.com.tr/flutter")
    }

    fun reactNative() {
        binding.txtDetaySayfasi.text = "React Native Detay Sayfası"
        binding.img.setImageResource(R.drawable.reactnative)
        binding.txtLink.setText("https://yelloware.com.tr/reactnative")
    }

    fun ionic() {
        binding.txtDetaySayfasi.text = "Ionic Detay Sayfası"
        binding.img.setImageResource(R.drawable.ionic)
        binding.txtLink.setText("https://yelloware.com.tr/ionic")
    }

    fun xamarin() {
        binding.txtDetaySayfasi.text = "Xamarin Detay Sayfası"
        binding.img.setImageResource(R.drawable.xamarin)
        binding.txtLink.setText("https://yelloware.com.tr/xamarin")
    }
}
