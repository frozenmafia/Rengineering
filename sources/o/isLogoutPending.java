package o;
/* loaded from: classes.dex */
public final class isLogoutPending {
    private static final String toString = "Haptik SDK is not initialized";
    public static final valueOf values = new valueOf();
    private final String ag$a;
    private final boolean valueOf;

    /* loaded from: classes.dex */
    public static final class valueOf {
    }

    public isLogoutPending(boolean z, String str) {
        runAnimators.ag$a(str, "message");
        this.valueOf = z;
        this.ag$a = str;
    }

    public /* synthetic */ isLogoutPending(boolean z, String str, int i, getTargetTypes gettargettypes) {
        this(z, (i & 2) != 0 ? "" : str);
    }

    public final boolean ag$a() {
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isLogoutPending) {
            isLogoutPending islogoutpending = (isLogoutPending) obj;
            return this.valueOf == islogoutpending.valueOf && runAnimators.values((Object) this.ag$a, (Object) islogoutpending.ag$a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.valueOf;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        return "Response(status=" + this.valueOf + ", message=" + this.ag$a + ')';
    }

    public final String valueOf() {
        return this.ag$a;
    }
}
