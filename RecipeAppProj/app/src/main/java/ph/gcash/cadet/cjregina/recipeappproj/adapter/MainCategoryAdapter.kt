package ph.gcash.cadet.cjregina.recipeappproj.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ph.gcash.cadet.cjregina.recipeappproj.R
import ph.gcash.cadet.cjregina.recipeappproj.entities.Recipes

class MainCategoryAdapter: RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>() {
    var arrMainCategory = ArrayList<Recipes>()
    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    fun setData(arrData : List<Recipes>) {
        arrMainCategory = arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {

        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main_category, parent, false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = arrMainCategory[position].dishName
    }

    override fun getItemCount(): Int {
        return arrMainCategory.size
    }
}