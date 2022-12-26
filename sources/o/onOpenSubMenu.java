package o;
/* loaded from: classes.dex */
public final class onOpenSubMenu {
    private final int HaptikSDK$b;
    private final int ag$a;
    private final int ah$a;
    private final int toString;
    private final int valueOf;
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onOpenSubMenu) {
            onOpenSubMenu onopensubmenu = (onOpenSubMenu) obj;
            return this.toString == onopensubmenu.toString && this.values == onopensubmenu.values && this.valueOf == onopensubmenu.valueOf && this.ag$a == onopensubmenu.ag$a && this.HaptikSDK$b == onopensubmenu.HaptikSDK$b && this.ah$a == onopensubmenu.ah$a;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.toString * 31) + this.values) * 31) + this.valueOf) * 31) + this.ag$a) * 31) + this.HaptikSDK$b) * 31) + this.ah$a;
    }

    public String toString() {
        int i = this.toString;
        int i2 = this.values;
        int i3 = this.valueOf;
        int i4 = this.ag$a;
        int i5 = this.HaptikSDK$b;
        int i6 = this.ah$a;
        return "CreatePrivateContestConfig(minContestSize=" + i + ", maxContestSize=" + i2 + ", minEntryFee=" + i3 + ", maxEntryFee=" + i4 + ", minSizeForMultipleEntry=" + i5 + ", minSizeDynamicContest=" + i6 + ")";
    }

    public onOpenSubMenu(int i, int i2, int i3, int i4, int i5, int i6) {
        this.toString = i;
        this.values = i2;
        this.valueOf = i3;
        this.ag$a = i4;
        this.HaptikSDK$b = i5;
        this.ah$a = i6;
    }

    public final int valueOf() {
        return this.toString;
    }

    public final int ag$a() {
        return this.values;
    }

    public final int values() {
        return this.valueOf;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final int HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final int invoke() {
        return this.ah$a;
    }
}
