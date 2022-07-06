package ph.gcash.cadet.cjregina.recipeappproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import ph.gcash.cadet.cjregina.recipeappproj.adapter.MainCategoryAdapter
import ph.gcash.cadet.cjregina.recipeappproj.adapter.SubCategoryAdapter
import ph.gcash.cadet.cjregina.recipeappproj.entities.Recipes

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //temporary
        arrMainCategory.add(Recipes(1, "Beef"))
        arrMainCategory.add(Recipes(2, "Chicken"))
        arrMainCategory.add(Recipes(3, "Dessert"))
        arrMainCategory.add(Recipes(4, "Lamb"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1, "Beef and Mustard pie"))
        arrSubCategory.add(Recipes(2, "Chicken and mushroom hotpot"))
        arrSubCategory.add(Recipes(3, "Banana pancakes"))
        arrSubCategory.add(Recipes(4, "Lamb Skewers"))

        subCategoryAdapter.setData(arrSubCategory)


        rv_main_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_sub_category.adapter = subCategoryAdapter
    }
}