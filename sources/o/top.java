package o;

import com.app.dream11.model.GameConfig;
import com.app.dream11.model.PlayersBean;
import com.app.dream11.model.RoundInfo;
/* loaded from: classes3.dex */
public final class top {
    private final RoundInfo ag$a;
    private final PlayersBean ah$a;
    private final boolean valueOf;
    private final GameConfig values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof top) {
            top topVar = (top) obj;
            return runAnimators.values(this.ah$a, topVar.ah$a) && this.valueOf == topVar.valueOf && runAnimators.values(this.values, topVar.values) && runAnimators.values(this.ag$a, topVar.ag$a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((hashCode * 31) + i) * 31) + this.values.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        PlayersBean playersBean = this.ah$a;
        boolean z = this.valueOf;
        GameConfig gameConfig = this.values;
        RoundInfo roundInfo = this.ag$a;
        return "TeamPreviewPlayerInfoRequestData(playerBean=" + playersBean + ", shouldShowPoints=" + z + ", gameConfig=" + gameConfig + ", roundInfo=" + roundInfo + ")";
    }

    public top(PlayersBean playersBean, boolean z, GameConfig gameConfig, RoundInfo roundInfo) {
        runAnimators.ag$a(playersBean, "playerBean");
        runAnimators.ag$a(gameConfig, "gameConfig");
        runAnimators.ag$a(roundInfo, "roundInfo");
        this.ah$a = playersBean;
        this.valueOf = z;
        this.values = gameConfig;
        this.ag$a = roundInfo;
    }

    public final PlayersBean ag$a() {
        return this.ah$a;
    }

    public final boolean values() {
        return this.valueOf;
    }

    public final GameConfig ah$a() {
        return this.values;
    }

    public final RoundInfo valueOf() {
        return this.ag$a;
    }
}
