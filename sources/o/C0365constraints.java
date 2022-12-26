package o;
/* renamed from: o.constraints  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0365constraints {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0365constraints) && runAnimators.values((Object) this.ah$a, (Object) ((C0365constraints) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        String str = this.ah$a;
        return "Badge(imgSrc=" + str + ")";
    }

    public C0365constraints(String str) {
        runAnimators.ag$a(str, "imgSrc");
        this.ah$a = str;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
