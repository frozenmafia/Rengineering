package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class getOutgoingEdges {
    private final List<getIncomingEdges> ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getOutgoingEdges) && runAnimators.values(this.ag$a, ((getOutgoingEdges) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        List<getIncomingEdges> list = this.ag$a;
        return "PrivacyQueryResponse(privacySettings=" + list + ")";
    }

    public getOutgoingEdges(List<getIncomingEdges> list) {
        runAnimators.ag$a(list, "privacySettings");
        this.ag$a = list;
    }

    public final List<getIncomingEdges> valueOf() {
        return this.ag$a;
    }
}
