package o;
/* loaded from: classes3.dex */
public final class Suggested {
    private final String ag$a;
    private final int ah$a;
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Suggested) {
            Suggested suggested = (Suggested) obj;
            return runAnimators.values((Object) this.ag$a, (Object) suggested.ag$a) && this.valueOf == suggested.valueOf && this.ah$a == suggested.ah$a;
        }
        return false;
    }

    public int hashCode() {
        return (((this.ag$a.hashCode() * 31) + this.valueOf) * 31) + this.ah$a;
    }

    public String toString() {
        String str = this.ag$a;
        int i = this.valueOf;
        int i2 = this.ah$a;
        return "ContestStats(contestType=" + str + ", paidContestCount=" + i + ", freeContestCount=" + i2 + ")";
    }

    public Suggested(String str, int i, int i2) {
        runAnimators.ag$a(str, "contestType");
        this.ag$a = str;
        this.valueOf = i;
        this.ah$a = i2;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final int valueOf() {
        return this.valueOf;
    }

    public final String values() {
        return this.ag$a;
    }
}
