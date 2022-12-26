package o;

import android.util.SparseBooleanArray;
/* loaded from: classes3.dex */
public final class onAuthenticationError {
    private final SparseBooleanArray values;

    /* loaded from: classes3.dex */
    public static final class toString {
        private boolean ag$a;
        private final SparseBooleanArray values = new SparseBooleanArray();

        public toString ah$a(int i) {
            FingerprintManagerCompat.ah$a(!this.ag$a);
            this.values.append(i, true);
            return this;
        }

        public toString ah$a(int i, boolean z) {
            return z ? ah$a(i) : this;
        }

        public toString ag$a(int... iArr) {
            for (int i : iArr) {
                ah$a(i);
            }
            return this;
        }

        public toString valueOf(onAuthenticationError onauthenticationerror) {
            for (int i = 0; i < onauthenticationerror.valueOf(); i++) {
                ah$a(onauthenticationerror.ag$a(i));
            }
            return this;
        }

        public onAuthenticationError values() {
            FingerprintManagerCompat.ah$a(!this.ag$a);
            this.ag$a = true;
            return new onAuthenticationError(this.values);
        }
    }

    private onAuthenticationError(SparseBooleanArray sparseBooleanArray) {
        this.values = sparseBooleanArray;
    }

    public boolean values(int i) {
        return this.values.get(i);
    }

    public int valueOf() {
        return this.values.size();
    }

    public int ag$a(int i) {
        FingerprintManagerCompat.values(i, 0, valueOf());
        return this.values.keyAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onAuthenticationError) {
            onAuthenticationError onauthenticationerror = (onAuthenticationError) obj;
            if (getElevationDegrees.HaptikSDK$b < 24) {
                if (valueOf() != onauthenticationerror.valueOf()) {
                    return false;
                }
                for (int i = 0; i < valueOf(); i++) {
                    if (ag$a(i) != onauthenticationerror.ag$a(i)) {
                        return false;
                    }
                }
                return true;
            }
            return this.values.equals(onauthenticationerror.values);
        }
        return false;
    }

    public int hashCode() {
        if (getElevationDegrees.HaptikSDK$b < 24) {
            int valueOf = valueOf();
            for (int i = 0; i < valueOf(); i++) {
                valueOf = (valueOf * 31) + ag$a(i);
            }
            return valueOf;
        }
        return this.values.hashCode();
    }
}
