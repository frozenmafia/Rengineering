package o;
/* loaded from: classes3.dex */
public final class applyToWithoutCustom {
    private String ah$a;
    private String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof applyToWithoutCustom) {
            applyToWithoutCustom applytowithoutcustom = (applyToWithoutCustom) obj;
            return runAnimators.values((Object) this.ah$a, (Object) applytowithoutcustom.ah$a) && runAnimators.values((Object) this.toString, (Object) applytowithoutcustom.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        String str = this.ah$a;
        String str2 = this.toString;
        return "ViewMoreItem(index=" + str + ", viewMoreDescription=" + str2 + ")";
    }

    public applyToWithoutCustom(String str, String str2) {
        runAnimators.ag$a(str, "index");
        runAnimators.ag$a(str2, "viewMoreDescription");
        this.ah$a = str;
        this.toString = str2;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.toString;
    }
}
