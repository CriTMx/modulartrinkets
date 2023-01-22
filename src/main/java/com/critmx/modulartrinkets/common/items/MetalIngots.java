package com.critmx.modulartrinkets.common.items;

import com.critmx.modulartrinkets.common.creativetabs.MTCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.List;

public class MetalIngots {

    static final CreativeModeTab tab = MTCreativeTab.MT_MATERIALS_TAB;
    static final Item.Properties metal_ingot_properties = new Item.Properties().tab(tab);
    public static CreativeModeTab mGetTab()
    {
        return tab;
    }
    public static Item.Properties mGetProperties()
    {
        return metal_ingot_properties;
    }

    public static class CobaltIngot extends Item
    {
        static final String name = "cobalt_ingot";

        public CobaltIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class LeadIngot extends Item
    {
        static final String name = "lead_ingot";

        public LeadIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class TinIngot extends Item
    {
        static final String name = "tin_ingot";

        public TinIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class BronzeIngot extends Item
    {
        static final String name = "bronze_ingot";

        public BronzeIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class BrassIngot extends Item
    {
        static final String name = "brass_ingot";

        public BrassIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class SilverIngot extends Item
    {
        static final String name = "silver_ingot";

        public SilverIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class InvarIngot extends Item
    {
        static final String name = "invar_ingot";

        public InvarIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class ElectrumIngot extends Item
    {
        static final String name = "electrum_ingot";

        public ElectrumIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class HaemiumIngot extends Item
    {
        static final String name = "haemium_ingot";

        public HaemiumIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
    public static class PlatinumIngot extends Item
    {
        static final String name = "platinum_ingot";

        public PlatinumIngot(Properties pProperties) {
            super(pProperties);
        }
        public static String mGetName()
        {
            return name;
        }
    }
}