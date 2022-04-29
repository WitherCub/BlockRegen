package net.wither.blockregen.coll;

import com.massivecraft.massivecore.store.SenderColl;
import net.wither.blockregen.entity.BPlayer;

public class BPlayerColl extends SenderColl<BPlayer> {
    private static BPlayerColl i = new BPlayerColl();
    public static BPlayerColl get() { return i; }

    private BPlayerColl() {
        super("blockregen_players");
    }
}
