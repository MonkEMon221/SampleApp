package com.vishesh.sampleapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButtonToggleGroup
import com.vishesh.sampleapp.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myadapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val model = ArrayList<Model>()
        model.add(Model(R.drawable.buttons, "Button"))
        model.add(Model(R.drawable.image_view, "ImageView"))
        model.add(Model(R.drawable.fab_button, "FAB"))
        model.add(Model(R.drawable.card_screen, "CardView"))
        model.add(Model(R.drawable.edit_box_screen, "EditText"))
        model.add(Model(R.drawable.image_button, "ImageButton"))
        model.add(Model(R.drawable.tab_screen, "TabLayout"))

        binding.recycler.apply {
            myadapter = RecyclerAdapter(this@MainActivity, model)

            myadapter.setOnItemClickListener(object : RecyclerAdapter.ItemClickListener {
                override fun onItemClicked(position: Int) {

                    if (position == 0) {
                        val intent = Intent(this@MainActivity, ButtonView::class.java)
                        startActivity(intent)
                    }
                    if (position == 1) {
                        val intent = Intent(this@MainActivity, ImageView::class.java)
                        startActivity(intent)
                    }
                    if (position == 2) {
                        val intent = Intent(this@MainActivity, FabView::class.java)
                        startActivity(intent)
                    }
                    if (position == 3) {
                        val intent = Intent(this@MainActivity, CardView::class.java)
                        startActivity(intent)
                    }
                    if (position == 4) {
                        val intent = Intent(this@MainActivity, RoundedEditTextBox::class.java)
                        startActivity(intent)
                    }
                    if (position == 5) {
                        val intent = Intent(this@MainActivity, ImageButton::class.java)
                        startActivity(intent)
                    }
                    if (position == 6) {
                        val intent = Intent(this@MainActivity, TabLayout::class.java)
                        startActivity(intent)
                    }
                }

            })
            this.layoutManager = GridLayoutManager(this@MainActivity, 2)
            this.adapter = myadapter
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.setting, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.settings) {
            val bottomSheetDialog = BottomSheetDialog(this, R.style.BottomSheetDialogTheme)
            val bottomSheetView = LayoutInflater.from(this).inflate(
                R.layout.bottom_sheet_setting, findViewById(R.id.bottomSheet)
            )
            bottomSheetView.findViewById<MaterialButtonToggleGroup>(R.id.toggleGrp)
                .addOnButtonCheckedListener { _, checkedId, isChecked ->
                    if (isChecked) {
                        when (checkedId) {
                            R.id.lightButton -> AppCompatDelegate.setDefaultNightMode(
                                AppCompatDelegate.MODE_NIGHT_NO
                            )
                            R.id.darkButton -> AppCompatDelegate.setDefaultNightMode(
                                AppCompatDelegate.MODE_NIGHT_YES
                            )
                            R.id.defaultButton -> AppCompatDelegate.setDefaultNightMode(
                                AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                            )
                        }
                    }
                }
            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()
        }
        return super.onOptionsItemSelected(item)
    }
}