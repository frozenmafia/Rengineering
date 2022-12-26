package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class ratio {
    private final List<Suggested> ag$a;
    private final String toString;
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ratio) {
            ratio ratioVar = (ratio) obj;
            return this.values == ratioVar.values && runAnimators.values((Object) this.toString, (Object) ratioVar.toString) && runAnimators.values(this.ag$a, ratioVar.ag$a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.values;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = this.toString.hashCode();
        List<Suggested> list = this.ag$a;
        return (((r0 * 31) + hashCode) * 31) + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z = this.values;
        String str = this.toString;
        List<Suggested> list = this.ag$a;
        return "ContestsBreakup(isPrivacyEnabled=" + z + ", message=" + str + ", contestStats=" + list + ")";
    }

    public ratio(boolean z, String str, List<Suggested> list) {
        runAnimators.ag$a(str, "message");
        this.values = z;
        this.toString = str;
        this.ag$a = list;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final boolean ah$a() {
        return this.values;
    }

    public final List<Suggested> values() {
        return this.ag$a;
    }
}
