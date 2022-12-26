package o;

import java.util.List;
/* loaded from: classes2.dex */
public final class setInterpolator {
    @isFullSpan(valueOf = "apiPaths")
    private final List<String> toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setInterpolator) && runAnimators.values(this.toString, ((setInterpolator) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        List<String> list = this.toString;
        return "DRSExperimentRequest(apiPaths=" + list + ")";
    }

    public setInterpolator(List<String> list) {
        runAnimators.ag$a(list, "apiPaths");
        this.toString = list;
    }
}
