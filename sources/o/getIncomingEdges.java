package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class getIncomingEdges {
    private final List<getIncomingEdgesInternal> ag$a;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getIncomingEdges) {
            getIncomingEdges getincomingedges = (getIncomingEdges) obj;
            return runAnimators.values((Object) this.values, (Object) getincomingedges.values) && runAnimators.values(this.ag$a, getincomingedges.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        String str = this.values;
        List<getIncomingEdgesInternal> list = this.ag$a;
        return "PrivacySetting(sectionHeader=" + str + ", settings=" + list + ")";
    }

    public getIncomingEdges(String str, List<getIncomingEdgesInternal> list) {
        runAnimators.ag$a(str, "sectionHeader");
        runAnimators.ag$a(list, "settings");
        this.values = str;
        this.ag$a = list;
    }

    public final String ag$a() {
        return this.values;
    }

    public final List<getIncomingEdgesInternal> ah$a() {
        return this.ag$a;
    }
}
