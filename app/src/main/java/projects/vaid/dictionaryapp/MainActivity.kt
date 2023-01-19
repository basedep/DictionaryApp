package projects.vaid.dictionaryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import projects.vaid.dictionaryapp.ui.SearchFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, SearchFragment())
            .commit()
    }
}