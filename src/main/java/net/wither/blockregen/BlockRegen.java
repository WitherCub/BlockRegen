package net.wither.blockregen;

import com.massivecraft.massivecore.MassivePlugin;
import net.wither.blockregen.coll.BPlayerColl;
import net.wither.blockregen.coll.ConfColl;
import net.wither.blockregen.coll.LangConfColl;
import net.wither.blockregen.command.CmdBlock;
import net.wither.blockregen.engine.BlockEngine;
import net.wither.blockregen.intagration.aenchants.IntegrationAEnchants;
import net.wither.blockregen.intagration.customitems.EngineCustomItems;
import net.wither.blockregen.intagration.customitems.IntegrationCustomItems;
import net.wither.blockregen.intagration.ultimateskills.IntegrationUltimateSkills;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockRegen extends MassivePlugin {
    private static BlockRegen i;
    public static BlockRegen get() { return i; }

    public BlockRegen() {i = this;}

    @Override
    public void onEnableInner() {
        this.activate(
                BPlayerColl.class,
                ConfColl.class,
                LangConfColl.class
        );

        this.activate(
                CmdBlock.class
        );

        this.activate(
                BlockEngine.class
        );

        this.activate(
                IntegrationAEnchants.class,
                IntegrationCustomItems.class,
                IntegrationUltimateSkills.class
        );
    }

    @Override
    public void onDisable() {
        BlockEngine.get().blocks.forEach(((location, object) -> {
            Block block = location.getBlock();
            block.setType(object.getBlockID().getMaterial());
            block.setData((byte)object.getBlockID().getData());
        }));
        EngineCustomItems.get().resetBlocks();
    }
}
