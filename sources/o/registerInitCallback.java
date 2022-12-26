package o;

import java.util.List;
/* loaded from: classes4.dex */
public final class registerInitCallback {
    private final String ah$a;
    private final boolean toString;
    private final List<String> values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof registerInitCallback) {
            registerInitCallback registerinitcallback = (registerInitCallback) obj;
            return this.toString == registerinitcallback.toString && runAnimators.values((Object) this.ah$a, (Object) registerinitcallback.ah$a) && runAnimators.values(this.values, registerinitcallback.values);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.toString;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        String str = this.ah$a;
        int hashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.values;
        return (((r0 * 31) + hashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "OtpOrFailedParams(otpFound=" + this.toString + ", otp=" + ((Object) this.ah$a) + ", failParams=" + this.values + ')';
    }

    public registerInitCallback(boolean z, String str, List<String> list) {
        this.toString = z;
        this.ah$a = str;
        this.values = list;
    }

    public final boolean ag$a() {
        return this.toString;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final List<String> values() {
        return this.values;
    }
}
