package defpackage;
/* renamed from: co  reason: default package */
/* loaded from: classes6.dex */
public final class co {
    private final a ag$a;
    private final String values;

    /* renamed from: co$a */
    /* loaded from: classes6.dex */
    public enum a {
        USER_TERMINATED
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            co coVar = (co) obj;
            if (this.ag$a != coVar.ag$a) {
                return false;
            }
            String str = this.values;
            String str2 = coVar.values;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.ag$a;
        int hashCode = aVar == null ? 0 : aVar.hashCode();
        String str = this.values;
        return ((hashCode + 31) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format("%s {cause='%s', description='%s'}", super.toString(), this.ag$a.toString(), this.values);
    }
}
