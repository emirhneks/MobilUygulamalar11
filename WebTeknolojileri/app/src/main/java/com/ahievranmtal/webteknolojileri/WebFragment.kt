package com.ahievranmtal.webteknolojileri

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ahievranmtal.webteknolojileri.databinding.FragmentWebBinding

class WebFragment : Fragment() {
    private var _binding: FragmentWebBinding? = null
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
        _binding = FragmentWebBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mvc.setOnClickListener { mvc(it) }
        binding.angular.setOnClickListener { angular(it) }
        binding.react.setOnClickListener { react(it) }
        binding.graphql.setOnClickListener { graphql(it) }
        binding.php.setOnClickListener { php(it) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun mvc(view: View) {
        val teknoloji = "MVC"
        val action = WebFragmentDirections.actionWebFragmentToWebDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun angular(view: View) {
        val teknoloji = "Angular"
        val action = WebFragmentDirections.actionWebFragmentToWebDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun react(view: View) {
        val teknoloji = "React"
        val action = WebFragmentDirections.actionWebFragmentToWebDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun graphql(view: View) {
        val teknoloji = "GraphQL"
        val action = WebFragmentDirections.actionWebFragmentToWebDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }

    fun php(view: View) {
        val teknoloji = "PHP"
        val action = WebFragmentDirections.actionWebFragmentToWebDetayFragment(teknoloji)
        Navigation.findNavController(view).navigate(action)
    }
}
