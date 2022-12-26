package o;

import android.os.Bundle;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes3.dex */
public final class hasBasebandCn0DbHz implements getColorFilter {
    public static final getColorFilter$ah$a<hasBasebandCn0DbHz> valueOf = hasAlmanacData.values;
    private int HaptikSDK$c;
    public final int ag$a;
    public final int ah$a;
    public final int toString;
    public final byte[] values;

    @Pure
    public static int ag$a(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int toString(int i) {
        if (i != 1) {
            if (i != 16) {
                if (i != 18) {
                    return (i == 6 || i == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public hasBasebandCn0DbHz(int i, int i2, int i3, byte[] bArr) {
        this.ag$a = i;
        this.toString = i2;
        this.ah$a = i3;
        this.values = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hasBasebandCn0DbHz hasbasebandcn0dbhz = (hasBasebandCn0DbHz) obj;
        return this.ag$a == hasbasebandcn0dbhz.ag$a && this.toString == hasbasebandcn0dbhz.toString && this.ah$a == hasbasebandcn0dbhz.ah$a && Arrays.equals(this.values, hasbasebandcn0dbhz.values);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.ag$a);
        sb.append(", ");
        sb.append(this.toString);
        sb.append(", ");
        sb.append(this.ah$a);
        sb.append(", ");
        sb.append(this.values != null);
        sb.append(")");
        return sb.toString();
    }

    public int hashCode() {
        if (this.HaptikSDK$c == 0) {
            int i = this.ag$a;
            int i2 = this.toString;
            int i3 = this.ah$a;
            this.HaptikSDK$c = ((((((i + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + i2) * 31) + i3) * 31) + Arrays.hashCode(this.values);
        }
        return this.HaptikSDK$c;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Integer.toString(0, 36), this.ag$a);
        bundle.putInt(Integer.toString(1, 36), this.toString);
        bundle.putInt(Integer.toString(2, 36), this.ah$a);
        bundle.putByteArray(Integer.toString(3, 36), this.values);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ hasBasebandCn0DbHz ag$a(Bundle bundle) {
        return new hasBasebandCn0DbHz(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }
}
