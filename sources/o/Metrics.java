package o;

import com.app.dream11.core.event.EventType;
import com.app.dream11.model.FeatureUpdate;
/* loaded from: classes3.dex */
public final class Metrics extends FeatureUpdate {
    private String toString;
    private boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metrics) {
            Metrics metrics = (Metrics) obj;
            return runAnimators.values((Object) this.toString, (Object) metrics.toString) && this.valueOf == metrics.valueOf;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.toString.hashCode();
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        String str = this.toString;
        boolean z = this.valueOf;
        return "SaveTeamNameFeatureUpdate(mesg=" + str + ", isSuccess=" + z + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Metrics(String str, boolean z) {
        super(EventType.NOTIFY_TEAMNAME_CHANGED_RESPONSE);
        runAnimators.ag$a(str, "mesg");
        this.toString = str;
        this.valueOf = z;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final boolean values() {
        return this.valueOf;
    }
}
