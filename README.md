**Introduction of androidX ViewPager2**

Android Viewpager2 launched by Google on 07th Feb 2019, It’s there in an ALPHA version.

You can know more information about the alpha release here 

**New concepts:**

Android ViewPager2 introduce given below features

    > Right to Left layout support

    > Vertical orientation support

    > A better PageChangeListener

**API changes :**

Android ViewPager2 has been updated some improvements are below

    > RecylerView.Adapter replaces PagerAdapter

    > FragementStateAdapter replaces FragementStatePagerAdapter

    > registerOnPageChangeCallback replaces addPageChangeListener


ViewPager2 is launched for AndroidX so, if you want to use your projects must have been the migration to AndroidX.

Let’s create an ViewPager2 setup and You will need your project configured with AndroidX already, as well as supporting minSdkVersion 14 or higher.
For example given below


**Gradle Dependency:** Following dependency add to your app build.gradle.

    dependencies { 
        implementation 'androidx.viewpager2:viewpager2:1.0.0-alpha01'
    }

**Setup ViewPager2:** Android viewPager2 widget to your XML file
**activity_main.xml**

**Let create on view pager 2 layouts:** We need to create the adapter for viewPager2. this is the best part of RecylerView.Adapter and give below sample code

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

**RecyclerView.ViewHolder**

    class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val countryName: TextView = view.findViewById(R.id.country_name)
    }

For create adapter of our Viewpager2 to be an instance of RecylerView adapter.

    viewPager.adapter = CountryPagerAdapter(Country.countryStrings)

We can set the orientation to scroll to vertical

    viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

**Know issues**

1. clipToPadding

2. No fake drug

3. JavaDoc

4. Nested scrolling parallel to an orientation

5. No offscreen limit control

6. Implement the better TabLayout integration

7. No page with setter (forced 100%/100%)

8. Page transformer: no hardware/software layer choice; no reverse drawing order

Android development doc : https://developer.android.com/jetpack/androidx/releases/viewpager2

**Output :**



