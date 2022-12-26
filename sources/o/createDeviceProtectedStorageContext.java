package o;
/* loaded from: classes3.dex */
public final class createDeviceProtectedStorageContext {
    private final boolean ah$a;
    private final boolean toString;
    private final boolean valueOf;
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof createDeviceProtectedStorageContext) {
            createDeviceProtectedStorageContext createdeviceprotectedstoragecontext = (createDeviceProtectedStorageContext) obj;
            return this.ah$a == createdeviceprotectedstoragecontext.ah$a && this.valueOf == createdeviceprotectedstoragecontext.valueOf && this.values == createdeviceprotectedstoragecontext.values && this.toString == createdeviceprotectedstoragecontext.toString;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.ah$a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        ?? r2 = this.valueOf;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        ?? r3 = this.values;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        boolean z2 = this.toString;
        return (((((r0 * 31) + i) * 31) + i2) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.ah$a;
        boolean z2 = this.valueOf;
        boolean z3 = this.values;
        boolean z4 = this.toString;
        return "NewLineupData(isLineUpOrderExpected=" + z + ", isLineupOrderAnnounced=" + z2 + ", shouldShowBlueTooltip=" + z3 + ", shouldEnableLineupOnFab=" + z4 + ")";
    }

    public createDeviceProtectedStorageContext(boolean z, boolean z2, boolean z3, boolean z4) {
        this.ah$a = z;
        this.valueOf = z2;
        this.values = z3;
        this.toString = z4;
    }

    public final boolean ag$a() {
        return this.ah$a;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }

    public final boolean valueOf() {
        return this.values;
    }

    public final boolean values() {
        return this.toString;
    }
}
