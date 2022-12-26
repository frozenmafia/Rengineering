package o;
/* loaded from: classes3.dex */
public final class verticalGuideline {
    private final String ah$a;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof verticalGuideline) {
            verticalGuideline verticalguideline = (verticalGuideline) obj;
            return runAnimators.values((Object) this.values, (Object) verticalguideline.values) && runAnimators.values((Object) this.ah$a, (Object) verticalguideline.ah$a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.values;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ah$a;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.values;
        String str2 = this.ah$a;
        return "Squad(flagUrl=" + str + ", shortName=" + str2 + ")";
    }

    public verticalGuideline(String str, String str2) {
        this.values = str;
        this.ah$a = str2;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final String values() {
        return this.values;
    }
}
