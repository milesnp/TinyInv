package nuparu.tinyinv.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;


public class ClientConfig {
    public static BooleanValue fakeSlotOverlay;
    public static IntValue fakeSlotOverlayColor;
    public static BooleanValue hideOffhand;



    public static void init(ForgeConfigSpec.Builder server) {
        fakeSlotOverlay=server.comment("Should draw overlay over the fake slots").define("general.fake_slot_overlay",true);
        fakeSlotOverlayColor=server.comment("Color of the fake slot overlay").defineInRange("general.fake_slot_overlay_color",0xC6C6C6,0,Integer.MAX_VALUE);
        hideOffhand = server.comment("Should hide the offhand slot? Ignored if disableOffhand in the common config is true").define("general.hide_offhand", false);
    }
}
