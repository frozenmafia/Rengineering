package o;
/* loaded from: classes3.dex */
public final class verticalChain {
    private final boolean ah$a;
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof verticalChain) {
            verticalChain verticalchain = (verticalChain) obj;
            return runAnimators.values((Object) this.toString, (Object) verticalchain.toString) && this.ah$a == verticalchain.ah$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.toString;
        int hashCode = str == null ? 0 : str.hashCode();
        boolean z = this.ah$a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        String str = this.toString;
        boolean z = this.ah$a;
        return "RecentMatchPageInfo(endCursor=" + str + ", hasNextPage=" + z + ")";
    }

    public verticalChain(String str, boolean z) {
        this.toString = str;
        this.ah$a = z;
    }

    public final boolean ah$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.toString;
    }
}
