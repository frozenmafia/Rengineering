package o;
/* loaded from: classes3.dex */
public final class addStream {
    private final String ag$a;
    private final int ah$a;
    private final String toString;
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof addStream) {
            addStream addstream = (addStream) obj;
            return runAnimators.values((Object) this.ag$a, (Object) addstream.ag$a) && runAnimators.values((Object) this.toString, (Object) addstream.toString) && this.valueOf == addstream.valueOf && this.ah$a == addstream.ah$a;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.ag$a.hashCode() * 31) + this.toString.hashCode()) * 31) + this.valueOf) * 31) + this.ah$a;
    }

    public String toString() {
        String str = this.ag$a;
        String str2 = this.toString;
        int i = this.valueOf;
        int i2 = this.ah$a;
        return "LegendItem(iconUrl=" + str + ", text=" + str2 + ", leftPadding=" + i + ", rightPdding=" + i2 + ")";
    }

    public addStream(String str, String str2, int i, int i2) {
        runAnimators.ag$a(str, "iconUrl");
        runAnimators.ag$a(str2, "text");
        this.ag$a = str;
        this.toString = str2;
        this.valueOf = i;
        this.ah$a = i2;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final int values() {
        return this.valueOf;
    }
}
