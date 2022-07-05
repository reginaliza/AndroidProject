package ph.gcash.cadet.cjregina.recipeappproj.`interface`

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ph.gcash.cadet.cjregina.recipeappproj.entities.Recipes

interface RecipeInterface {

    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val allRecipes: List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipes: Recipes)
}