package o;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import java.util.Date;
/* loaded from: classes3.dex */
public final class getTouchRegion {
    private final String ah$a;
    private final Date valueOf;
    private final MatchStatus values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getTouchRegion) {
            getTouchRegion gettouchregion = (getTouchRegion) obj;
            return runAnimators.values(this.valueOf, gettouchregion.valueOf) && runAnimators.values((Object) this.ah$a, (Object) gettouchregion.ah$a) && this.values == gettouchregion.values;
        }
        return false;
    }

    public int hashCode() {
        return (((this.valueOf.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        Date date = this.valueOf;
        String str = this.ah$a;
        MatchStatus matchStatus = this.values;
        return "MatchTimeName(roundLockTime=" + date + ", name=" + str + ", status=" + matchStatus + ")";
    }

    public getTouchRegion(Date date, String str, MatchStatus matchStatus) {
        runAnimators.ag$a(date, "roundLockTime");
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(matchStatus, "status");
        this.valueOf = date;
        this.ah$a = str;
        this.values = matchStatus;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final MatchStatus ah$a() {
        return this.values;
    }

    public final Date values() {
        return this.valueOf;
    }
}
