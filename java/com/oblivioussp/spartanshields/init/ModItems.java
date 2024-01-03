package com.oblivioussp.spartanshields.init;

import java.util.function.Supplier;

import com.oblivioussp.spartanshields.ModSpartanShields;
import com.oblivioussp.spartanshields.item.BasicShieldItem;
import com.oblivioussp.spartanshields.item.BlockEffectShieldItem;
import com.oblivioussp.spartanshields.item.ExternalModShieldItem;
import com.oblivioussp.spartanshields.item.FEPoweredShieldItem;
import com.oblivioussp.spartanshields.item.ObsidianShieldItem;
import com.oblivioussp.spartanshields.item.ShieldBaseItem;
import com.oblivioussp.spartanshields.item.SilverShieldItem;
import com.oblivioussp.spartanshields.util.Constants;
import com.oblivioussp.spartanshields.util.Defaults;
import com.oblivioussp.spartanshields.util.PowerUnit;
import com.oblivioussp.spartanshields.util.TierSS;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
	public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, ModSpartanShields.ID);
	
	public static CreativeModeTab tabSS = new CreativeModeTab("spartanshields")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(STONE_BASIC_SHIELD.get());
        }
    };
    
    // Vanilla Shields
	public static final RegistryObject<ShieldBaseItem> WOODEN_BASIC_SHIELD = REGISTER.register("wooden_basic_shield", () -> new BasicShieldItem(TierSS.WOOD, Defaults.DefaultDurabilityWoodShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> WOODEN_TOWER_SHIELD = REGISTER.register("wooden_tower_shield", () -> new BasicShieldItem(TierSS.WOOD, Defaults.DefaultDurabilityWoodShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> STONE_BASIC_SHIELD = REGISTER.register("stone_basic_shield", () -> new BasicShieldItem(TierSS.STONE, Defaults.DefaultDurabilityStoneShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> STONE_TOWER_SHIELD = REGISTER.register("stone_tower_shield", () -> new BasicShieldItem(TierSS.STONE, Defaults.DefaultDurabilityStoneShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> COPPER_BASIC_SHIELD = REGISTER.register("copper_basic_shield", () -> new BasicShieldItem(TierSS.COPPER, Defaults.DefaultDurabilityCopperShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> COPPER_TOWER_SHIELD = REGISTER.register("copper_tower_shield", () -> new BasicShieldItem(TierSS.COPPER, Defaults.DefaultDurabilityCopperShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> IRON_BASIC_SHIELD = REGISTER.register("iron_basic_shield", () -> new BasicShieldItem(TierSS.IRON, Defaults.DefaultDurabilityIronShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> IRON_TOWER_SHIELD = REGISTER.register("iron_tower_shield", () -> new BasicShieldItem(TierSS.IRON, Defaults.DefaultDurabilityIronShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> GOLDEN_BASIC_SHIELD = REGISTER.register("golden_basic_shield", () -> new BasicShieldItem(TierSS.GOLD, Defaults.DefaultDurabilityGoldShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> GOLDEN_TOWER_SHIELD = REGISTER.register("golden_tower_shield", () -> new BasicShieldItem(TierSS.GOLD, Defaults.DefaultDurabilityGoldShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> DIAMOND_BASIC_SHIELD = REGISTER.register("diamond_basic_shield", () -> new BasicShieldItem(TierSS.DIAMOND, Defaults.DefaultDurabilityDiamondShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> DIAMOND_TOWER_SHIELD = REGISTER.register("diamond_tower_shield", () -> new BasicShieldItem(TierSS.DIAMOND, Defaults.DefaultDurabilityDiamondShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> NETHERITE_BASIC_SHIELD = REGISTER.register("netherite_basic_shield", () -> new BasicShieldItem(TierSS.NETHERITE, Defaults.DefaultDurabilityNetheriteShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> NETHERITE_TOWER_SHIELD = REGISTER.register("netherite_tower_shield", () -> new BasicShieldItem(TierSS.NETHERITE, Defaults.DefaultDurabilityNetheriteShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> OBSIDIAN_BASIC_SHIELD = REGISTER.register("obsidian_basic_shield", () -> new ObsidianShieldItem(TierSS.OBSIDIAN, Defaults.DefaultDurabilityObsidianShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> OBSIDIAN_TOWER_SHIELD = REGISTER.register("obsidian_tower_shield", () -> new ObsidianShieldItem(TierSS.OBSIDIAN, Defaults.DefaultDurabilityObsidianShield, true, new Item.Properties().tab(tabSS)));

	// Common Modded Shields
	public static final RegistryObject<ShieldBaseItem> TIN_BASIC_SHIELD = REGISTER.register("tin_basic_shield", () -> new BasicShieldItem(TierSS.TIN, Defaults.DefaultDurabilityTinShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> TIN_TOWER_SHIELD = REGISTER.register("tin_tower_shield", () -> new BasicShieldItem(TierSS.TIN, Defaults.DefaultDurabilityTinShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> BRONZE_BASIC_SHIELD = REGISTER.register("bronze_basic_shield", () -> new BasicShieldItem(TierSS.BRONZE, Defaults.DefaultDurabilityBronzeShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> BRONZE_TOWER_SHIELD = REGISTER.register("bronze_tower_shield", () -> new BasicShieldItem(TierSS.BRONZE, Defaults.DefaultDurabilityBronzeShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> STEEL_BASIC_SHIELD = REGISTER.register("steel_basic_shield", () -> new BasicShieldItem(TierSS.STEEL, Defaults.DefaultDurabilitySteelShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> STEEL_TOWER_SHIELD = REGISTER.register("steel_tower_shield", () -> new BasicShieldItem(TierSS.STEEL, Defaults.DefaultDurabilitySteelShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> SILVER_BASIC_SHIELD = REGISTER.register("silver_basic_shield", () -> new SilverShieldItem(TierSS.SILVER, Defaults.DefaultDurabilitySilverShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> SILVER_TOWER_SHIELD = REGISTER.register("silver_tower_shield", () -> new SilverShieldItem(TierSS.SILVER, Defaults.DefaultDurabilitySilverShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ELECTRUM_BASIC_SHIELD = REGISTER.register("electrum_basic_shield", () -> new BasicShieldItem(TierSS.ELECTRUM, Defaults.DefaultDurabilityElectrumShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ELECTRUM_TOWER_SHIELD = REGISTER.register("electrum_tower_shield", () -> new BasicShieldItem(TierSS.ELECTRUM, Defaults.DefaultDurabilityElectrumShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> LEAD_BASIC_SHIELD = REGISTER.register("lead_basic_shield", () -> new BasicShieldItem(TierSS.LEAD, Defaults.DefaultDurabilityLeadShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> LEAD_TOWER_SHIELD = REGISTER.register("lead_tower_shield", () -> new BasicShieldItem(TierSS.LEAD, Defaults.DefaultDurabilityLeadShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> NICKEL_BASIC_SHIELD = REGISTER.register("nickel_basic_shield", () -> new BasicShieldItem(TierSS.NICKEL, Defaults.DefaultDurabilityNickelShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> NICKEL_TOWER_SHIELD = REGISTER.register("nickel_tower_shield", () -> new BasicShieldItem(TierSS.NICKEL, Defaults.DefaultDurabilityNickelShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> INVAR_BASIC_SHIELD = REGISTER.register("invar_basic_shield", () -> new BasicShieldItem(TierSS.INVAR, Defaults.DefaultDurabilityInvarShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> INVAR_TOWER_SHIELD = REGISTER.register("invar_tower_shield", () -> new BasicShieldItem(TierSS.INVAR, Defaults.DefaultDurabilityInvarShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> CONSTANTAN_BASIC_SHIELD = REGISTER.register("constantan_basic_shield", () -> new BasicShieldItem(TierSS.CONSTANTAN, Defaults.DefaultDurabilityConstantanShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> CONSTANTAN_TOWER_SHIELD = REGISTER.register("constantan_tower_shield", () -> new BasicShieldItem(TierSS.CONSTANTAN, Defaults.DefaultDurabilityConstantanShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> PLATINUM_BASIC_SHIELD = REGISTER.register("platinum_basic_shield", () -> new BasicShieldItem(TierSS.PLATINUM, Defaults.DefaultDurabilityPlatinumShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> PLATINUM_TOWER_SHIELD = REGISTER.register("platinum_tower_shield", () -> new BasicShieldItem(TierSS.PLATINUM, Defaults.DefaultDurabilityPlatinumShield, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ALUMINUM_BASIC_SHIELD = REGISTER.register("aluminum_basic_shield", () -> new BasicShieldItem(TierSS.ALUMINUM, Defaults.DefaultDurabilityAluminumShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ALUMINUM_TOWER_SHIELD = REGISTER.register("aluminum_tower_shield", () -> new BasicShieldItem(TierSS.ALUMINUM, Defaults.DefaultDurabilityAluminumShield, true, new Item.Properties().tab(tabSS)));	
	
	// Botania Shields
	public static final Supplier<ShieldBaseItem> CREATE_BASIC_MANASTEEL_SHIELD_NO_BOTANIA = () -> new ExternalModShieldItem(TierSS.MANASTEEL, Defaults.DefaultDurabilityManasteelShield, false, Constants.Botania_ModID, new Item.Properties().tab(ModItems.tabSS));
	public static final Supplier<ShieldBaseItem> CREATE_TOWER_MANASTEEL_SHIELD_NO_BOTANIA = () -> new ExternalModShieldItem(TierSS.MANASTEEL, Defaults.DefaultDurabilityManasteelShield, true, Constants.Botania_ModID, new Item.Properties().tab(ModItems.tabSS));
	public static final Supplier<ShieldBaseItem> CREATE_BASIC_TERRASTEEL_SHIELD_NO_BOTANIA = () -> new ExternalModShieldItem(TierSS.TERRASTEEL, Defaults.DefaultDurabilityTerrasteelShield, false, Constants.Botania_ModID, new Item.Properties().tab(ModItems.tabSS));
	public static final Supplier<ShieldBaseItem> CREATE_TOWER_TERRASTEEL_SHIELD_NO_BOTANIA = () -> new ExternalModShieldItem(TierSS.TERRASTEEL, Defaults.DefaultDurabilityTerrasteelShield, true, Constants.Botania_ModID, new Item.Properties().tab(ModItems.tabSS));
	public static final Supplier<ShieldBaseItem> CREATE_BASIC_ELEMENTIUM_SHIELD_NO_BOTANIA = () -> new ExternalModShieldItem(TierSS.ELEMENTIUM, Defaults.DefaultDurabilityElementiumShield, false, Constants.Botania_ModID, new Item.Properties().tab(ModItems.tabSS));
	public static final Supplier<ShieldBaseItem> CREATE_TOWER_ELEMENTIUM_SHIELD_NO_BOTANIA = () -> new ExternalModShieldItem(TierSS.ELEMENTIUM, Defaults.DefaultDurabilityElementiumShield, true, Constants.Botania_ModID, new Item.Properties().tab(ModItems.tabSS));
	
	public static final RegistryObject<ShieldBaseItem> MANASTEEL_BASIC_SHIELD = REGISTER.register("manasteel_basic_shield", ModList.get().isLoaded(Constants.Botania_ModID) ? BotaniaItems.createManasteelBasicShield() : CREATE_BASIC_MANASTEEL_SHIELD_NO_BOTANIA);
	public static final RegistryObject<ShieldBaseItem> MANASTEEL_TOWER_SHIELD = REGISTER.register("manasteel_tower_shield", ModList.get().isLoaded(Constants.Botania_ModID) ? BotaniaItems.createManasteelTowerShield() : CREATE_TOWER_MANASTEEL_SHIELD_NO_BOTANIA);
	public static final RegistryObject<ShieldBaseItem> TERRASTEEL_BASIC_SHIELD = REGISTER.register("terrasteel_basic_shield", ModList.get().isLoaded(Constants.Botania_ModID) ? BotaniaItems.createTerrasteelBasicShield() : CREATE_BASIC_TERRASTEEL_SHIELD_NO_BOTANIA);
	public static final RegistryObject<ShieldBaseItem> TERRASTEEL_TOWER_SHIELD = REGISTER.register("terrasteel_tower_shield", ModList.get().isLoaded(Constants.Botania_ModID) ? BotaniaItems.createTerrasteelTowerShield() : CREATE_TOWER_TERRASTEEL_SHIELD_NO_BOTANIA);
	public static final RegistryObject<ShieldBaseItem> ELEMENTIUM_BASIC_SHIELD = REGISTER.register("elementium_basic_shield", ModList.get().isLoaded(Constants.Botania_ModID) ? BotaniaItems.createElementiumBasicShield() : CREATE_BASIC_ELEMENTIUM_SHIELD_NO_BOTANIA);
	public static final RegistryObject<ShieldBaseItem> ELEMENTIUM_TOWER_SHIELD = REGISTER.register("elementium_tower_shield", ModList.get().isLoaded(Constants.Botania_ModID) ? BotaniaItems.createElementiumTowerShield() : CREATE_TOWER_ELEMENTIUM_SHIELD_NO_BOTANIA);

	// Mekanism Shields
	// NOTE: Where are the tower shields for the base materials in Mekanism? In the Mekanism Tools mod of course!
	public static final RegistryObject<ShieldBaseItem> OSMIUM_BASIC_SHIELD = REGISTER.register("osmium_basic_shield", () -> new BasicShieldItem(TierSS.OSMIUM, Defaults.DefaultDurabilityOsmiumShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> LAPIS_BASIC_SHIELD = REGISTER.register("lapis_lazuli_basic_shield", () -> new BasicShieldItem(TierSS.LAPIS_LAZULI, Defaults.DefaultDurabilityLapisLazuliShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> REFINED_GLOWSTONE_BASIC_SHIELD = REGISTER.register("refined_glowstone_basic_shield", () -> new BasicShieldItem(TierSS.REFINED_GLOWSTONE, Defaults.DefaultDurabilityRefinedGlowstoneShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> REFINED_OBSIDIAN_BASIC_SHIELD = REGISTER.register("refined_obsidian_basic_shield", () -> new BasicShieldItem(TierSS.REFINED_OBSIDIAN, Defaults.DefaultDurabilityRefinedObsidianShield, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> BASIC_MEKANISTS_BASIC_SHIELD = REGISTER.register("basic_mekanists_basic_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismBasic, Defaults.DefaultFEMaxRecieveMekanismBasic, "mekanism", PowerUnit.ForgeEnergy, false, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> BASIC_MEKANISTS_TOWER_SHIELD = REGISTER.register("basic_mekanists_tower_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismBasic, Defaults.DefaultFEMaxRecieveMekanismBasic, "mekanism", PowerUnit.ForgeEnergy, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ADVANCED_MEKANISTS_BASIC_SHIELD = REGISTER.register("advanced_mekanists_basic_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismAdvanced, Defaults.DefaultFEMaxRecieveMekanismAdvanced, "mekanism", PowerUnit.ForgeEnergy, false, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ADVANCED_MEKANISTS_TOWER_SHIELD = REGISTER.register("advanced_mekanists_tower_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismAdvanced, Defaults.DefaultFEMaxRecieveMekanismAdvanced, "mekanism", PowerUnit.ForgeEnergy, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ELITE_MEKANISTS_BASIC_SHIELD = REGISTER.register("elite_mekanists_basic_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismElite, Defaults.DefaultFEMaxRecieveMekanismElite, "mekanism", PowerUnit.ForgeEnergy, false, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ELITE_MEKANISTS_TOWER_SHIELD = REGISTER.register("elite_mekanists_tower_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismElite, Defaults.DefaultFEMaxRecieveMekanismElite, "mekanism", PowerUnit.ForgeEnergy, true, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ULTIMATE_MEKANISTS_BASIC_SHIELD = REGISTER.register("ultimate_mekanists_basic_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismUltimate, Defaults.DefaultFEMaxRecieveMekanismUltimate, "mekanism", PowerUnit.ForgeEnergy, false, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ULTIMATE_MEKANISTS_TOWER_SHIELD = REGISTER.register("ultimate_mekanists_tower_shield", () -> new FEPoweredShieldItem(Defaults.DefaultFECapacityMekanismUltimate, Defaults.DefaultFEMaxRecieveMekanismUltimate, "mekanism", PowerUnit.ForgeEnergy, true, new Item.Properties().tab(tabSS)));

	// Thermal Series Shields
	public static final RegistryObject<ShieldBaseItem> SIGNALUM_BASIC_SHIELD = REGISTER.register("signalum_basic_shield", () -> new BlockEffectShieldItem(TierSS.SIGNALUM, Defaults.DefaultDurabilitySignalumShield, MobEffects.WEAKNESS, 100, 1, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> SIGNALUM_TOWER_SHIELD = REGISTER.register("signalum_tower_shield", () -> new BlockEffectShieldItem(TierSS.SIGNALUM, Defaults.DefaultDurabilitySignalumShield, true, MobEffects.WEAKNESS, 100, 1, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> LUMIUM_BASIC_SHIELD = REGISTER.register("lumium_basic_shield", () -> new BlockEffectShieldItem(TierSS.LUMIUM, Defaults.DefaultDurabilityLumiumShield, MobEffects.GLOWING, 200, 0, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> LUMIUM_TOWER_SHIELD = REGISTER.register("lumium_tower_shield", () -> new BlockEffectShieldItem(TierSS.LUMIUM, Defaults.DefaultDurabilityLumiumShield, true, MobEffects.GLOWING, 200, 0, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ENDERIUM_BASIC_SHIELD = REGISTER.register("enderium_basic_shield", () -> new BlockEffectShieldItem(TierSS.ENDERIUM, Defaults.DefaultDurabilityEnderiumShield, MobEffects.MOVEMENT_SLOWDOWN, 100, 1, new Item.Properties().tab(tabSS)));
	public static final RegistryObject<ShieldBaseItem> ENDERIUM_TOWER_SHIELD = REGISTER.register("enderium_tower_shield", () -> new BlockEffectShieldItem(TierSS.ENDERIUM, Defaults.DefaultDurabilityEnderiumShield, true, MobEffects.MOVEMENT_SLOWDOWN, 100, 1, new Item.Properties().tab(tabSS)));
}
