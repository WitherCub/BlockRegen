package net.wither.blockregen.command.Type;

import com.massivecraft.massivecore.command.type.Type;
import net.wither.blockregen.coll.BPlayerColl;
import net.wither.blockregen.entity.BPlayer;

public class TypeBPlayer {
    public static Type<BPlayer> get() {
        return BPlayerColl.get().getTypeEntity();
    }
}
