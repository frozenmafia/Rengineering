package o;

import java.util.List;
/* renamed from: o.helper  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0378helper {
    private final List<horizontalChain> ah$a;
    private final verticalChain values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0378helper) {
            C0378helper c0378helper = (C0378helper) obj;
            return runAnimators.values(this.values, c0378helper.values) && runAnimators.values(this.ah$a, c0378helper.ah$a);
        }
        return false;
    }

    public int hashCode() {
        verticalChain verticalchain = this.values;
        return ((verticalchain == null ? 0 : verticalchain.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        verticalChain verticalchain = this.values;
        List<horizontalChain> list = this.ah$a;
        return "RecentMatch(recentMatchPageInfo=" + verticalchain + ", recentMatches=" + list + ")";
    }

    public C0378helper(verticalChain verticalchain, List<horizontalChain> list) {
        runAnimators.ag$a(list, "recentMatches");
        this.values = verticalchain;
        this.ah$a = list;
    }

    public final verticalChain values() {
        return this.values;
    }

    public final List<horizontalChain> valueOf() {
        return this.ah$a;
    }
}
