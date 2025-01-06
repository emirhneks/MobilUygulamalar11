package com.ahievranmtal.webteknolojileri

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ahievranmtal.webteknolojileri.databinding.FragmentWebDetayBinding

class WebDetayFragment : Fragment() {
    private var _binding: FragmentWebDetayBinding? = null
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
        _binding = FragmentWebDetayBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val teknoloji = arguments?.let { WebDetayFragmentArgs.fromBundle(it).teknoloji }
        when (teknoloji) {
            "MVC" -> mvc()
            "Angular" -> angular()
            "React" -> react()
            "GraphQL" -> graphql()
            "PHP" -> php()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun mvc() {
        binding.txtDetaySayfasi.text = "MVC Detay Sayfası"
        binding.img.setImageResource(R.drawable.mvc)
        binding.txtLink.setText("https://yelloware.com.tr/mvc-net")
    }

    fun angular() {
        binding.txtDetaySayfasi.text = "Angular Detay Sayfası"
        binding.img.setImageResource(R.drawable.angular)
        binding.txtLink.setText("https://yelloware.com.tr/angular")
    }

    fun react() {
        binding.txtDetaySayfasi.text = "React Detay Sayfası"
        binding.img.setImageResource(R.drawable.react)
        binding.txtLink.setText("https://yelloware.com.tr/react")
    }

    fun graphql() {
        binding.txtDetaySayfasi.text = "GraphQL Detay Sayfası"
        binding.img.setImageResource(R.drawable.graphql)
        binding.txtLink.setText("https://yelloware.com.tr/graphql")
    }

    fun php() {
        binding.txtDetaySayfasi.text = "PHP Detay Sayfası"
        binding.img.setImageResource(R.drawable.php)
        binding.txtLink.setText("https://yelloware.com.tr/php-programlama")
    }
}
