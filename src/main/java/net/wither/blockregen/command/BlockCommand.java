package net.wither.blockregen.command;

import com.massivecraft.massivecore.command.MassiveCommand;
import net.wither.blockregen.Permission;
import net.wither.blockregen.entity.BPlayer;

public class BlockCommand extends MassiveCommand {
    protected BPlayer senderBPlayer;

    public BlockCommand() {
        this.setDesc("View BlockEngine commands.");

        this.setSetupEnabled(true);
        this.setSetupPermClass(Permission.class);
    }

    @Override
    public void senderFields(boolean set) {
        if(this.senderIsConsole) {
            senderBPlayer = null;
        } else {
            this.senderBPlayer = set? BPlayer.get(this.sender):null;
        }
    }
}
