package fr.freemann.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import fr.freemann.utils.CustomItems;

public class Heart {

    public static void InitHeartRecipe() {
        ItemStack heart = CustomItems.getHearthItem();
        // When using a custom ItemStack as result, you must give a NamespacedKey (for Bukkit 1.13+)
        // But assuming you handle that elsewhere or using legacy constructor, here’s the shaped recipe:
        ShapedRecipe heartRecipe = new ShapedRecipe(/* key */, heart);

        // Define the shape. We use 3 strings — each string is one row.
        // Row 1: E M E  → EMERALD_ORE | GOLDEN_APPLE | EMERALD_ORE
        // Row 2: D S D  → DIAMOND_BLOCK | WITHER_SKELETON_SKULL | DIAMOND_BLOCK
        // Row 3: E M E  → EMERALD_ORE | GOLDEN_APPLE | EMERALD_ORE
        heartRecipe.shape("EME", "DSD", "EME");

        // Map characters to materials
        heartRecipe.setIngredient('E', Material.EMERALD_ORE);
        heartRecipe.setIngredient('M', Material.GOLDEN_APPLE);
        heartRecipe.setIngredient('D', Material.DIAMOND_BLOCK);
        heartRecipe.setIngredient('S', Material.WITHER_SKELETON_SKULL);

        Bukkit.addRecipe(heartRecipe);
    }

}
