package o;

import android.os.Bundle;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class FontsContractCompat$ah$a implements getColorFilter {
    public static final getColorFilter$ah$a<FontsContractCompat$ah$a> valueOf = RequestExecutor.ag$a;
    public final int[] ag$a;
    public final int ah$a;
    public final int toString;
    public final int values;

    public FontsContractCompat$ah$a(int i, int[] iArr, int i2) {
        this.toString = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.ag$a = copyOf;
        this.values = iArr.length;
        this.ah$a = i2;
        Arrays.sort(copyOf);
    }

    public int hashCode() {
        return (((this.toString * 31) + Arrays.hashCode(this.ag$a)) * 31) + this.ah$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FontsContractCompat$ah$a fontsContractCompat$ah$a = (FontsContractCompat$ah$a) obj;
        return this.toString == fontsContractCompat$ah$a.toString && Arrays.equals(this.ag$a, fontsContractCompat$ah$a.ag$a) && this.ah$a == fontsContractCompat$ah$a.ah$a;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Integer.toString(0, 36), this.toString);
        bundle.putIntArray(Integer.toString(1, 36), this.ag$a);
        bundle.putInt(Integer.toString(2, 36), this.ah$a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FontsContractCompat$ah$a toString(Bundle bundle) {
        boolean z = false;
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i >= 0 && i2 >= 0) {
            z = true;
        }
        FingerprintManagerCompat.toString(z);
        FingerprintManagerCompat.toString(intArray);
        return new FontsContractCompat$ah$a(i, intArray, i2);
    }
}
