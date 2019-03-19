package kr.mallow.sampleviewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        viewPager.adapter = CountryPagerAdapter(Country.countryStrings)
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }

    class CountryPagerAdapter(private val countryStrings: Array<String>) : RecyclerView.Adapter<CountryViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
            return CountryViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.country_list_item,
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
            holder.countryName.text = countryStrings[position]
        }

        override fun getItemCount() = countryStrings.size
    }

    class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val countryName: TextView = view.findViewById(R.id.country_name)
    }
}
