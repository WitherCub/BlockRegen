package net.wither.blockregen.coll;

import com.massivecraft.massivecore.MassiveCore;
import com.massivecraft.massivecore.store.Coll;
import net.wither.blockregen.entity.Conf;
import net.wither.blockregen.entity.LangConf;

public class LangConfColl extends Coll<LangConf> {
    private static final LangConfColl i = new LangConfColl();
    public static LangConfColl get() { return i; }

    @Override
    public void onTick() {
        super.onTick();
    }

    @Override
    public void setActive(boolean active) {
        super.setActive(active);
        if (!active)return;
        LangConf.set(get(MassiveCore.INSTANCE, true));
    }
}
