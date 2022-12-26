package o;
/* loaded from: classes3.dex */
public final class getLength2D {
    private final String ag$a;
    private final String toString;
    private final boolean valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getLength2D) {
            getLength2D getlength2d = (getLength2D) obj;
            return runAnimators.values((Object) this.ag$a, (Object) getlength2d.ag$a) && runAnimators.values((Object) this.toString, (Object) getlength2d.toString) && runAnimators.values((Object) this.values, (Object) getlength2d.values) && this.valueOf == getlength2d.valueOf;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        int hashCode2 = this.toString.hashCode();
        int hashCode3 = this.values.hashCode();
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public String toString() {
        String str = this.ag$a;
        String str2 = this.toString;
        String str3 = this.values;
        boolean z = this.valueOf;
        return "BatsmanModel(name=" + str + ", runsTaken=" + str2 + ", ballsTaken=" + str3 + ", isOnStrike=" + z + ")";
    }

    public getLength2D(String str, String str2, String str3, boolean z) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "runsTaken");
        runAnimators.ag$a(str3, "ballsTaken");
        this.ag$a = str;
        this.toString = str2;
        this.values = str3;
        this.valueOf = z;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String valueOf() {
        return this.values;
    }

    public final boolean values() {
        return this.valueOf;
    }
}
