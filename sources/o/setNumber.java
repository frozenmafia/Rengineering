package o;

import com.app.dream11.core.service.graphql.api.fragment.GUser;
import java.util.List;
/* loaded from: classes3.dex */
public final class setNumber {
    private final boolean ag$a;
    private final GUser toString;

    public final GUser ah$a() {
        return this.toString;
    }

    public final String valueOf() {
        GUser.OfficialTick officialTick;
        String src;
        List<GUser.OfficialTick> officialTick2 = this.toString.getOfficialTick();
        return (officialTick2 == null || (officialTick = (GUser.OfficialTick) reserveEndViewTransition.invoke((List<? extends Object>) officialTick2)) == null || (src = officialTick.getSrc()) == null) ? "" : src;
    }

    public final String values() {
        return this.ag$a ? "You" : this.toString.getTeamName();
    }
}
