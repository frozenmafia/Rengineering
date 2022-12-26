package o;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import com.app.dream11.core.service.graphql.api.type.InningStatus;
/* loaded from: classes3.dex */
public final class calcPathPosition {
    private final String ah$a;
    private final String toString;
    private final int valueOf;
    private final enableHomeButtonByDefault values;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class toString {
        public static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[InningStatus.values().length];
            iArr[InningStatus.IN_PROGRESS.ordinal()] = 1;
            ah$a = iArr;
        }
    }

    public calcPathPosition(CricketMiniScoreCardQuery.CricketScore cricketScore, enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(cricketScore, "teamScore");
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.values = enablehomebuttonbydefault;
        this.ah$a = ah$a(cricketScore);
        this.toString = toString(cricketScore);
        this.valueOf = valueOf(cricketScore);
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final int values() {
        return this.valueOf;
    }

    private final String ah$a(CricketMiniScoreCardQuery.CricketScore cricketScore) {
        return this.values.valueOf(com.app.dream11Pro.R.string.res_0x7f120b33, Integer.valueOf(cricketScore.getRuns()), Integer.valueOf(cricketScore.getWickets()));
    }

    private final String toString(CricketMiniScoreCardQuery.CricketScore cricketScore) {
        if (cricketScore.getStatus() == InningStatus.DECLARED) {
            return this.values.valueOf(com.app.dream11Pro.R.string.res_0x7f120b32, new Object[0]);
        }
        enableHomeButtonByDefault enablehomebuttonbydefault = this.values;
        Object[] objArr = new Object[1];
        String bowlingSet = cricketScore.getBowlingSet();
        if (bowlingSet == null) {
            bowlingSet = "";
        }
        objArr[0] = bowlingSet;
        return enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120b31, objArr);
    }

    private final int valueOf(CricketMiniScoreCardQuery.CricketScore cricketScore) {
        return this.values.ag$a(toString.ah$a[cricketScore.getStatus().ordinal()] == 1 ? com.app.dream11Pro.R.color.d11_color_neutral__white : com.app.dream11Pro.R.color.d11_color_neutral__40);
    }
}
