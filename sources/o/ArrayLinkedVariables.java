package o;
/* loaded from: classes3.dex */
public final class ArrayLinkedVariables {
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ArrayLinkedVariables) {
            ArrayLinkedVariables arrayLinkedVariables = (ArrayLinkedVariables) obj;
            return runAnimators.values((Object) this.ah$a, (Object) arrayLinkedVariables.ah$a) && runAnimators.values((Object) this.values, (Object) arrayLinkedVariables.values) && runAnimators.values((Object) this.toString, (Object) arrayLinkedVariables.toString) && runAnimators.values((Object) this.ag$a, (Object) arrayLinkedVariables.ag$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        int hashCode2 = this.values.hashCode();
        int hashCode3 = this.toString.hashCode();
        String str = this.ag$a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.ah$a;
        String str2 = this.values;
        String str3 = this.toString;
        String str4 = this.ag$a;
        return "Team(shortName=" + str + ", longName=" + str2 + ", flag=" + str3 + ", bandColor=" + str4 + ")";
    }

    public ArrayLinkedVariables(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "shortName");
        runAnimators.ag$a(str2, "longName");
        runAnimators.ag$a(str3, "flag");
        this.ah$a = str;
        this.values = str2;
        this.toString = str3;
        this.ag$a = str4;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.values;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final String values() {
        return this.toString;
    }
}
