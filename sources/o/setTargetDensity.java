package o;

import android.media.AudioAttributes;
import android.os.Bundle;
/* loaded from: classes3.dex */
public final class setTargetDensity implements getColorFilter {
    public static final setTargetDensity ag$a = new toString().valueOf();
    public static final getColorFilter$ah$a<setTargetDensity> values = RoundedBitmapDrawable21.ah$a;
    public final int HaptikSDK$a;
    public final int HaptikSDK$c;
    public final int ah$a;
    private setTargetDensity$ag$a ah$b;
    public final int toString;
    public final int valueOf;

    /* loaded from: classes3.dex */
    public static final class toString {
        private int ag$a = 0;
        private int ah$a = 0;
        private int valueOf = 1;
        private int toString = 1;
        private int values = 0;

        public toString values(int i) {
            this.ag$a = i;
            return this;
        }

        public toString ag$a(int i) {
            this.ah$a = i;
            return this;
        }

        public toString valueOf(int i) {
            this.valueOf = i;
            return this;
        }

        public toString toString(int i) {
            this.toString = i;
            return this;
        }

        public toString ah$a(int i) {
            this.values = i;
            return this;
        }

        public setTargetDensity valueOf() {
            return new setTargetDensity(this.ag$a, this.ah$a, this.valueOf, this.toString, this.values);
        }
    }

    private setTargetDensity(int i, int i2, int i3, int i4, int i5) {
        this.valueOf = i;
        this.toString = i2;
        this.HaptikSDK$a = i3;
        this.ah$a = i4;
        this.HaptikSDK$c = i5;
    }

    public setTargetDensity$ag$a valueOf() {
        if (this.ah$b == null) {
            this.ah$b = new setTargetDensity$ag$a(this);
        }
        return this.ah$b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setTargetDensity settargetdensity = (setTargetDensity) obj;
        return this.valueOf == settargetdensity.valueOf && this.toString == settargetdensity.toString && this.HaptikSDK$a == settargetdensity.HaptikSDK$a && this.ah$a == settargetdensity.ah$a && this.HaptikSDK$c == settargetdensity.HaptikSDK$c;
    }

    public int hashCode() {
        int i = this.valueOf;
        int i2 = this.toString;
        int i3 = this.HaptikSDK$a;
        return ((((((((i + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + i2) * 31) + i3) * 31) + this.ah$a) * 31) + this.HaptikSDK$c;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(toString(0), this.valueOf);
        bundle.putInt(toString(1), this.toString);
        bundle.putInt(toString(2), this.HaptikSDK$a);
        bundle.putInt(toString(3), this.ah$a);
        bundle.putInt(toString(4), this.HaptikSDK$c);
        return bundle;
    }

    public static /* synthetic */ setTargetDensity toString(Bundle bundle) {
        toString tostring = new toString();
        if (bundle.containsKey(toString(0))) {
            tostring.values(bundle.getInt(toString(0)));
        }
        if (bundle.containsKey(toString(1))) {
            tostring.ag$a(bundle.getInt(toString(1)));
        }
        if (bundle.containsKey(toString(2))) {
            tostring.valueOf(bundle.getInt(toString(2)));
        }
        if (bundle.containsKey(toString(3))) {
            tostring.toString(bundle.getInt(toString(3)));
        }
        if (bundle.containsKey(toString(4))) {
            tostring.ah$a(bundle.getInt(toString(4)));
        }
        return tostring.valueOf();
    }

    private static String toString(int i) {
        return Integer.toString(i, 36);
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public static void toString(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class values {
    }
}
