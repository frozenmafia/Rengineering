package o;
/* loaded from: classes3.dex */
public final class getPerformStopActivity2Params$ah$a {
    private String ag$a;
    private boolean ah$a;
    private int valueOf;
    private String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getPerformStopActivity2Params$ah$a) {
            getPerformStopActivity2Params$ah$a getperformstopactivity2params_ah_a = (getPerformStopActivity2Params$ah$a) obj;
            return runAnimators.values((Object) this.ag$a, (Object) getperformstopactivity2params_ah_a.ag$a) && runAnimators.values((Object) this.values, (Object) getperformstopactivity2params_ah_a.values) && this.valueOf == getperformstopactivity2params_ah_a.valueOf && this.ah$a == getperformstopactivity2params_ah_a.ah$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        int hashCode2 = this.values.hashCode();
        int i = this.valueOf;
        boolean z = this.ah$a;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + i2;
    }

    public String toString() {
        String str = this.ag$a;
        String str2 = this.values;
        int i = this.valueOf;
        boolean z = this.ah$a;
        return "ReactionTabVM(name=" + str + ", url=" + str2 + ", id=" + i + ", shouldShowName=" + z + ")";
    }

    public getPerformStopActivity2Params$ah$a(String str, String str2, int i, boolean z) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "url");
        this.ag$a = str;
        this.values = str2;
        this.valueOf = i;
        this.ah$a = z;
    }

    public final boolean ag$a() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.ag$a;
    }

    public final int valueOf() {
        return this.valueOf;
    }

    public final String values() {
        return this.values;
    }
}
