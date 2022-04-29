package net.wither.blockregen.command;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.Visibility;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.enumeration.TypeMaterial;
import com.massivecraft.massivecore.command.type.primitive.TypeInteger;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import net.wither.blockregen.Permission;
import net.wither.blockregen.Utils;
import net.wither.blockregen.command.Type.TypeBPlayer;
import net.wither.blockregen.entity.*;
import org.bukkit.ChatColor;
import org.bukkit.Material;

public class CmdBlockAddPerm extends BlockCommand {
    public CmdBlockAddPerm() {
        this.setDesc("Add allowed blocks to a player.");

        this.setVisibility(Visibility.SECRET);
        this.addRequirements(RequirementHasPerm.get(Permission.ADDPERM));

        this.addParameter(TypeBPlayer.get(), "player");
        this.addParameter(TypeString.get(), "blockID");
    }

    @Override
    public void perform() throws MassiveException {
        BPlayer player = this.readArg();
        String id = this.readArg();
        if(player != null) {
            if(Conf.get().blocks.containsKey(id)) {
                if(player.getAllowedBlocks().contains(id)) {
                    msg(ChatColor.translateAlternateColorCodes('&', LangConf.get().msgAlreadyHasPerm));
                    return;
                }
                player.addBlock(id);
                msg(ChatColor.translateAlternateColorCodes('&', LangConf.get().msgAddedPermission.replaceAll("\\{player}", player.getName())));
            } else {
                msg(ChatColor.translateAlternateColorCodes('&', LangConf.get().msgUnknownBlock));
                return;
            }
        } else {
            msg(ChatColor.translateAlternateColorCodes('&', LangConf.get().msgUnknownPlayer));
            return;
        }
    }
}
