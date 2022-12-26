package o;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
/* loaded from: classes3.dex */
public abstract class valueAt {
    private final int HaptikSDK$a;
    private final int HaptikSDK$b;
    private boolean HaptikSDK$c;
    private final boolean ag$a;
    private final boolean ah$a;
    private final int ah$b;
    private final int invoke;
    private final boolean toString;
    private final int valueOf;
    private final int values;

    public /* synthetic */ valueAt(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, boolean z3, int i6, boolean z4, getTargetTypes gettargettypes) {
        this(z, z2, i, i2, i3, i4, i5, z3, i6, z4);
    }

    private valueAt(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, boolean z3, int i6, boolean z4) {
        this.toString = z;
        this.ag$a = z2;
        this.HaptikSDK$a = i;
        this.valueOf = i2;
        this.HaptikSDK$b = i3;
        this.values = i4;
        this.invoke = i5;
        this.ah$a = z3;
        this.ah$b = i6;
        this.HaptikSDK$c = z4;
    }

    public /* synthetic */ valueAt(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, boolean z3, int i6, boolean z4, int i7, getTargetTypes gettargettypes) {
        this((i7 & 1) != 0 ? false : z, (i7 & 2) != 0 ? false : z2, (i7 & 4) != 0 ? com.app.dream11Pro.R.string.res_0x7f1206f2 : i, (i7 & 8) != 0 ? com.app.dream11Pro.R.drawable.ic_location_disabled : i2, (i7 & 16) != 0 ? com.app.dream11Pro.R.string.res_0x7f1206fc : i3, (i7 & 32) != 0 ? com.app.dream11Pro.R.string.res_0x7f1206f8 : i4, (i7 & 64) != 0 ? com.app.dream11Pro.R.string.res_0x7f1206fb : i5, (i7 & 128) != 0 ? false : z3, (i7 & 256) != 0 ? com.app.dream11Pro.R.string.res_0x7f1206fa : i6, (i7 & 512) == 0 ? z4 : false, null);
    }

    public final boolean HaptikSDK$e() {
        return this.toString;
    }

    public final boolean HaptikSDK$b() {
        return this.ag$a;
    }

    public final int invoke() {
        return this.HaptikSDK$a;
    }

    public final int ah$a() {
        return this.valueOf;
    }

    public final int HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final int valueOf() {
        return this.values;
    }

    public final int ah$b() {
        return this.invoke;
    }

    public final boolean ag$a() {
        return this.ah$a;
    }

    public final int values() {
        return this.ah$b;
    }

    public final boolean HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    /* loaded from: classes3.dex */
    public static final class values extends valueAt {
        public values() {
            super(true, false, 0, 0, 0, 0, 0, false, 0, false, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class valueOf extends valueAt {
        public valueOf() {
            this(false, 1, null);
        }

        public valueOf(boolean z) {
            super(false, false, 0, com.app.dream11Pro.R.drawable.ic_location_off, com.app.dream11Pro.R.string.res_0x7f1206fc, com.app.dream11Pro.R.string.res_0x7f1206f8, 0, z, 0, false, 839, null);
        }

        public /* synthetic */ valueOf(boolean z, int i, getTargetTypes gettargettypes) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* loaded from: classes3.dex */
    public static final class toString extends valueAt {
        public toString() {
            this(0, 1, null);
        }

        public toString(int i) {
            super(false, false, 0, com.app.dream11Pro.R.drawable.ic_location_banned_state, com.app.dream11Pro.R.string.res_0x7f1206f4, com.app.dream11Pro.R.string.res_0x7f1206ef, i, false, 0, true, 391, null);
        }

        public /* synthetic */ toString(int i, int i2, getTargetTypes gettargettypes) {
            this((i2 & 1) != 0 ? com.app.dream11Pro.R.string.res_0x7f1206f3 : i);
        }
    }
}
