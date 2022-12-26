package o;

import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import java.util.Date;
import java.util.List;
/* loaded from: classes3.dex */
public final class getLimitBoundsToId {
    private final Date HaptikSDK$a;
    private final MatchData.Squad HaptikSDK$b;
    private final MatchData.Squad HaptikSDK$c;
    private final String HaptikSDK$d;
    private final String HaptikSDK$e;
    private final int HaptikWebView;
    private final String ag$a;
    private final String ah$a;
    private final String ah$b;
    private final String getInitSettings;
    private final String getSignupData;
    private final int invoke;
    private final String isLogoutPending;
    private final String toString;
    private final MatchData valueOf;
    private final String values;

    public getLimitBoundsToId(MatchData matchData) {
        List<MatchData.Flag> flag;
        MatchData.Flag flag2;
        String src;
        List<MatchData.Flag> flag3;
        MatchData.Flag flag4;
        runAnimators.ag$a(matchData, "matchData");
        this.valueOf = matchData;
        MatchData.Squad squad = (MatchData.Squad) reserveEndViewTransition.invoke((List<? extends Object>) matchData.getSquads());
        this.HaptikSDK$b = squad;
        MatchData.Squad squad2 = (MatchData.Squad) reserveEndViewTransition.ag$a((List<? extends Object>) matchData.getSquads(), 1);
        this.HaptikSDK$c = squad2;
        String str = "";
        this.getSignupData = (squad == null || (r3 = squad.getShortName()) == null) ? "" : "";
        this.getInitSettings = (squad2 == null || (r3 = squad2.getShortName()) == null) ? "" : "";
        this.HaptikSDK$e = (squad == null || (r3 = squad.getFullName()) == null) ? "" : "";
        this.HaptikSDK$d = (squad2 == null || (r3 = squad2.getFullName()) == null) ? "" : "";
        this.invoke = matchData.getId();
        this.HaptikWebView = matchData.getTour().getId();
        this.toString = (squad == null || (flag3 = squad.getFlag()) == null || (flag4 = (MatchData.Flag) reserveEndViewTransition.invoke((List<? extends Object>) flag3)) == null || (r3 = flag4.getSrc()) == null) ? "" : "";
        if (squad2 != null && (flag = squad2.getFlag()) != null && (flag2 = (MatchData.Flag) reserveEndViewTransition.invoke((List<? extends Object>) flag)) != null && (src = flag2.getSrc()) != null) {
            str = src;
        }
        this.ah$a = str;
        this.values = squad == null ? null : squad.getSquadColorPalette();
        this.ag$a = squad2 != null ? squad2.getSquadColorPalette() : null;
        this.HaptikSDK$a = matchData.getStartTime();
        this.ah$b = matchData.getName();
        this.isLogoutPending = matchData.getTour().getName();
    }

    public final MatchData HaptikSDK$b() {
        return this.valueOf;
    }

    public final String getSignupData() {
        return this.getSignupData;
    }

    public final String HaptikSDK$d() {
        return this.getInitSettings;
    }

    public final String HaptikSDK$a() {
        return this.HaptikSDK$e;
    }

    public final String HaptikSDK$e() {
        return this.HaptikSDK$d;
    }

    public final int HaptikSDK$c() {
        return this.invoke;
    }

    public final int getInitSettings() {
        return this.HaptikWebView;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String values() {
        return this.ag$a;
    }

    public final Date ah$b() {
        return this.HaptikSDK$a;
    }

    public final String invoke() {
        return this.ah$b;
    }

    public final String HaptikWebView() {
        return this.isLogoutPending;
    }
}
