package com.aplikasi.myportofolio.ui

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import com.aplikasi.myportofolio.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.kontak1.setOnClickListener {
            CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_A))
        }

        binding.kontak2.setOnClickListener {
            CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_B))
        }

        binding.kontak3.setOnClickListener {
            CustomTabsIntent.Builder().build().launchUrl(requireContext(), Uri.parse(LINK_C))
        }
    }
}

private const val LINK_A = "https://www.linkedin.com/in/syauqi-alif-ibrahim-35440b222/"
private const val LINK_B = "https://github.com/SyauqiAlifI"
private const val LINK_C = "https://mail.google.com/mail/u/0/#inbox?compose=CllgCJvkXKlKVSnVkKZVnCNvwxwtzQcFfjZZVrLHMsxbFBMxlGHdKqPsmCpchhFGBsMWZdzRKtg"