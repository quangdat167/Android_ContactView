package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactapp.adapter.ContactAdapter
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contactList = listOf<Contact>(
            Contact("Josefina Lehner", "111-12321-23", "Josefina@gmail.com", 1),
            Contact("Stuart Vandervort", "0394391232", "Stuart@example.com", 2),
            Contact("Maddison Russel", "1231249493", "Russel@example.com", 3),
            Contact("Halie Morrar", "1212346653", "Morrar@example.com", 4),
            Contact("Karelle Simonis", "113454243", "Karelle@example.com", 5),
            Contact("Hannah Welch", "0934382234", "Welch@example.com", 6),
            Contact("Fanny Frami", "092384234", "Fanny@example.com", 7),
            Contact("Elfrieda Wisozk", "0388584134", "Elfrieda@example.com", 8),
            Contact("Dang Quang Dat", "3425634532", "Dat@example.com", 9),
            Contact("ABC def", "3424523423", "ABC@example.com", 10)
        )

        binding.recyclerView.adapter = ContactAdapter(contactList)
        binding.recyclerView.setHasFixedSize(true)
    }
}