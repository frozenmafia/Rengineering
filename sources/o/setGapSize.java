package o;
/* loaded from: classes2.dex */
public final class setGapSize {
    private final int ag$a;
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setGapSize) {
            setGapSize setgapsize = (setGapSize) obj;
            return this.ag$a == setgapsize.ag$a && runAnimators.values((Object) this.ah$a, (Object) setgapsize.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        int i = this.ag$a;
        String str = this.ah$a;
        return "SingleTeamWinningVM(teamNumber=" + i + ", wonAmount=" + str + ")";
    }

    public setGapSize(int i, String str) {
        runAnimators.ag$a(str, "wonAmount");
        this.ag$a = i;
        this.ah$a = str;
    }

    public final int valueOf() {
        return this.ag$a;
    }

    public final String values() {
        return this.ah$a;
    }
}
