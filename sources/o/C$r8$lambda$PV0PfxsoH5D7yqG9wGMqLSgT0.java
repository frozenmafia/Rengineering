package o;

import com.google.android.exoplayer2.C;
/* renamed from: o.$r8$lambda$-PV0PfxsoH5D7yqG9wGMqLSg-T0  reason: invalid class name */
/* loaded from: classes3.dex */
final class C$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0 {
    private boolean HaptikSDK$c;
    private boolean ag$a;
    private int ah$a;
    private C$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a valueOf = new C$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a();
    private C$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a toString = new C$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a();
    private long values = C.TIME_UNSET;

    public void HaptikSDK$a() {
        this.valueOf.ah$b();
        this.toString.ah$b();
        this.ag$a = false;
        this.values = C.TIME_UNSET;
        this.ah$a = 0;
    }

    public void ag$a(long j) {
        this.valueOf.ag$a(j);
        if (this.valueOf.ag$a() && !this.HaptikSDK$c) {
            this.ag$a = false;
        } else if (this.values != C.TIME_UNSET) {
            if (!this.ag$a || this.toString.valueOf()) {
                this.toString.ah$b();
                this.toString.ag$a(this.values);
            }
            this.ag$a = true;
            this.toString.ag$a(j);
        }
        if (this.ag$a && this.toString.ag$a()) {
            C$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a c$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a = this.valueOf;
            this.valueOf = this.toString;
            this.toString = c$r8$lambda$PV0PfxsoH5D7yqG9wGMqLSgT0$ah$a;
            this.ag$a = false;
            this.HaptikSDK$c = false;
        }
        this.values = j;
        this.ah$a = this.valueOf.ag$a() ? 0 : this.ah$a + 1;
    }

    public boolean HaptikSDK$b() {
        return this.valueOf.ag$a();
    }

    public int values() {
        return this.ah$a;
    }

    public long valueOf() {
        return HaptikSDK$b() ? this.valueOf.values() : C.TIME_UNSET;
    }

    public long ah$a() {
        return HaptikSDK$b() ? this.valueOf.ah$a() : C.TIME_UNSET;
    }

    public float ag$a() {
        if (HaptikSDK$b()) {
            return (float) (1.0E9d / this.valueOf.ah$a());
        }
        return -1.0f;
    }
}
