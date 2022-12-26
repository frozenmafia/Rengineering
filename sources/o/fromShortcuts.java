package o;
/* loaded from: classes3.dex */
public final class fromShortcuts {
    private final int ag$a;
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fromShortcuts) {
            fromShortcuts fromshortcuts = (fromShortcuts) obj;
            return this.ah$a == fromshortcuts.ah$a && this.ag$a == fromshortcuts.ag$a;
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a * 31) + this.ag$a;
    }

    public String toString() {
        int i = this.ah$a;
        int i2 = this.ag$a;
        return "DREarnRatio(amountSpent=" + i + ", drEarned=" + i2 + ")";
    }

    public fromShortcuts(int i, int i2) {
        this.ah$a = i;
        this.ag$a = i2;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final int ah$a() {
        return this.ag$a;
    }
}
