package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class onCancel {
    public final long HaptikSDK$a;
    public final long HaptikSDK$c;
    public final boolean ag$a;
    public final long ah$a;
    public final boolean ah$b;
    public final boolean invoke;
    public final boolean toString;
    public final isUserUnlocked$ag$a valueOf;
    public final long values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onCancel(isUserUnlocked$ag$a isuserunlocked_ag_a, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        FingerprintManagerCompat.toString(!z4 || z2);
        FingerprintManagerCompat.toString(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        FingerprintManagerCompat.toString(z5);
        this.valueOf = isuserunlocked_ag_a;
        this.HaptikSDK$c = j;
        this.HaptikSDK$a = j2;
        this.ah$a = j3;
        this.values = j4;
        this.toString = z;
        this.invoke = z2;
        this.ah$b = z3;
        this.ag$a = z4;
    }

    public onCancel ag$a(long j) {
        return j == this.HaptikSDK$c ? this : new onCancel(this.valueOf, j, this.HaptikSDK$a, this.ah$a, this.values, this.toString, this.invoke, this.ah$b, this.ag$a);
    }

    public onCancel valueOf(long j) {
        return j == this.HaptikSDK$a ? this : new onCancel(this.valueOf, this.HaptikSDK$c, j, this.ah$a, this.values, this.toString, this.invoke, this.ah$b, this.ag$a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        onCancel oncancel = (onCancel) obj;
        return this.HaptikSDK$c == oncancel.HaptikSDK$c && this.HaptikSDK$a == oncancel.HaptikSDK$a && this.ah$a == oncancel.ah$a && this.values == oncancel.values && this.toString == oncancel.toString && this.invoke == oncancel.invoke && this.ah$b == oncancel.ah$b && this.ag$a == oncancel.ag$a && getElevationDegrees.values(this.valueOf, oncancel.valueOf);
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int i = (int) this.HaptikSDK$c;
        int i2 = (int) this.HaptikSDK$a;
        int i3 = (int) this.ah$a;
        return ((((((((((((((((hashCode + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + i) * 31) + i2) * 31) + i3) * 31) + ((int) this.values)) * 31) + (this.toString ? 1 : 0)) * 31) + (this.invoke ? 1 : 0)) * 31) + (this.ah$b ? 1 : 0)) * 31) + (this.ag$a ? 1 : 0);
    }
}
