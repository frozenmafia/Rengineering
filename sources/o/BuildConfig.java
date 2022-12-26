package o;
/* loaded from: classes4.dex */
public final class BuildConfig {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuildConfig) && runAnimators.values((Object) this.ah$a, (Object) ((BuildConfig) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Wallet_Name_String_(value=" + this.ah$a + ')';
    }

    public BuildConfig(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
