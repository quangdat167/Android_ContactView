package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import com.example.contactapp.adapter.ContactAdapter
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_contact_menu -> {
                val navController = findNavController(R.id.nav_host_fragment)
                navController.navigate(R.id.nav_new_contact)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        val contactList: MutableList<Contact> = mutableListOf<Contact>(

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
    }
}

