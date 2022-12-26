package o;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class findAndCacheIsProjectedDrawableMethod implements getColorFilter {
    public static final getColorFilter$ah$a<findAndCacheIsProjectedDrawableMethod> toString = isProjected.ah$a;
    public final RoundedBitmapDrawableFactory valueOf;
    public final ImmutableList<Integer> values;

    public findAndCacheIsProjectedDrawableMethod(RoundedBitmapDrawableFactory roundedBitmapDrawableFactory, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= roundedBitmapDrawableFactory.valueOf)) {
            throw new IndexOutOfBoundsException();
        }
        this.valueOf = roundedBitmapDrawableFactory;
        this.values = ImmutableList.copyOf((Collection) list);
    }

    public int valueOf() {
        return this.valueOf.ag$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        findAndCacheIsProjectedDrawableMethod findandcacheisprojecteddrawablemethod = (findAndCacheIsProjectedDrawableMethod) obj;
        return this.valueOf.equals(findandcacheisprojecteddrawablemethod.valueOf) && this.values.equals(findandcacheisprojecteddrawablemethod.values);
    }

    public int hashCode() {
        return this.valueOf.hashCode() + (this.values.hashCode() * 31);
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(values(0), this.valueOf.toBundle());
        bundle.putIntArray(values(1), Ints.ag$a(this.values));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ findAndCacheIsProjectedDrawableMethod values(Bundle bundle) {
        return new findAndCacheIsProjectedDrawableMethod(RoundedBitmapDrawableFactory.values.ah$a((Bundle) FingerprintManagerCompat.toString(bundle.getBundle(values(0)))), Ints.ag$a((int[]) FingerprintManagerCompat.toString(bundle.getIntArray(values(1)))));
    }

    private static String values(int i) {
        return Integer.toString(i, 36);
    }
}
