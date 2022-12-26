package o;
/* loaded from: classes2.dex */
public final class tryShow {
    private final String ag$a;
    private final int ah$a;
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tryShow) {
            tryShow tryshow = (tryShow) obj;
            return runAnimators.values((Object) this.ag$a, (Object) tryshow.ag$a) && this.ah$a == tryshow.ah$a && this.valueOf == tryshow.valueOf;
        }
        return false;
    }

    public int hashCode() {
        return (((this.ag$a.hashCode() * 31) + this.ah$a) * 31) + this.valueOf;
    }

    public String toString() {
        String str = this.ag$a;
        int i = this.ah$a;
        int i2 = this.valueOf;
        return "ImageStackViewItem(imageUrl=" + str + ", errorView=" + i + ", placeholder=" + i2 + ")";
    }

    public tryShow(String str, int i, int i2) {
        runAnimators.ag$a(str, "imageUrl");
        this.ag$a = str;
        this.ah$a = i;
        this.valueOf = i2;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final int values() {
        return this.ah$a;
    }

    public final int ah$a() {
        return this.valueOf;
    }
}
