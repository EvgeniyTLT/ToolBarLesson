package com.example.toolbarlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Admin"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.sync -> {
                Toast.makeText(this, R.string.sync, Toast.LENGTH_LONG).show()
            }
            R.id.save -> {
                Toast.makeText(this, R.string.save, Toast.LENGTH_LONG).show()
            }
            R.id.delete -> {
                Toast.makeText(this, R.string.delete, Toast.LENGTH_LONG).show()
            }
            R.id.search -> {
                Toast.makeText(this, R.string.search, Toast.LENGTH_LONG).show()
            }
        }

        return true
    }
}