package o;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
/* loaded from: classes3.dex */
public final class sendAccessibilityEventUnchecked {
    private final SparseArray<getCarrierFrequencyHz> ah$a = new SparseArray<>();

    public getCarrierFrequencyHz ag$a(int i) {
        getCarrierFrequencyHz getcarrierfrequencyhz = this.ah$a.get(i);
        if (getcarrierfrequencyhz == null) {
            getCarrierFrequencyHz getcarrierfrequencyhz2 = new getCarrierFrequencyHz(TimestampAdjuster.MODE_SHARED);
            this.ah$a.put(i, getcarrierfrequencyhz2);
            return getcarrierfrequencyhz2;
        }
        return getcarrierfrequencyhz;
    }

    public void ah$a() {
        this.ah$a.clear();
    }
}
