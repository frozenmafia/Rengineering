package o;
/* loaded from: classes3.dex */
public final class dfs {
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dfs) {
            dfs dfsVar = (dfs) obj;
            return runAnimators.values((Object) this.ah$a, (Object) dfsVar.ah$a) && runAnimators.values((Object) this.values, (Object) dfsVar.values) && runAnimators.values((Object) this.toString, (Object) dfsVar.toString) && runAnimators.values((Object) this.ag$a, (Object) dfsVar.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.ah$a.hashCode() * 31) + this.values.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        String str = this.ah$a;
        String str2 = this.values;
        String str3 = this.toString;
        String str4 = this.ag$a;
        return "ConfirmationPopup(affirmation=" + str + ", desc=" + str2 + ", header=" + str3 + ", negation=" + str4 + ")";
    }

    public dfs(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "affirmation");
        runAnimators.ag$a(str2, "desc");
        runAnimators.ag$a(str3, "header");
        runAnimators.ag$a(str4, "negation");
        this.ah$a = str;
        this.values = str2;
        this.toString = str3;
        this.ag$a = str4;
    }

    public final String values() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String ag$a() {
        return this.ag$a;
    }
}
