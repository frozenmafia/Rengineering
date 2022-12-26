package o;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes3.dex */
public final class isHardwareDetected {
    public static <T extends getColorFilter> ImmutableList<T> ah$a(getColorFilter$ah$a<T> getcolorfilter_ah_a, List<Bundle> list) {
        ImmutableList.valueOf builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.toString((ImmutableList.valueOf) getcolorfilter_ah_a.ah$a((Bundle) FingerprintManagerCompat.toString(list.get(i))));
        }
        return builder.ah$a();
    }

    public static <T extends getColorFilter> ArrayList<Bundle> valueOf(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (T t : collection) {
            arrayList.add(t.toBundle());
        }
        return arrayList;
    }

    public static <T extends getColorFilter> SparseArray<T> ah$a(getColorFilter$ah$a<T> getcolorfilter_ah_a, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), getcolorfilter_ah_a.ah$a(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static <T extends getColorFilter> SparseArray<Bundle> ah$a(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).toBundle());
        }
        return sparseArray2;
    }

    public static void valueOf(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) getElevationDegrees.ah$a(isHardwareDetected.class.getClassLoader()));
        }
    }

    private isHardwareDetected() {
    }
}
