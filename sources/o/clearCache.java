package o;

import android.graphics.Color;
import o.FragmentStateAdapter;
/* loaded from: classes3.dex */
public final class clearCache {
    public static final clearCache$ah$a ag$a = new containsItem<clearCache>() { // from class: o.clearCache$ah$a
        @Override // o.scheduleGracePeriodEnd
        public Object ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
            runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
            return new clearCache(Color.parseColor(animateLayoutChangeDetector.getInitSettings()));
        }

        @Override // o.containsItem, o.scheduleGracePeriodEnd
        public FragmentStateAdapter.DataSetChangeObserver values() {
            return clearCache.valueOf;
        }
    };
    public static final FragmentStateAdapter.DataSetChangeObserver valueOf = FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass3.ag$a("ColorWrapper", inferViewPager$HaptikSDK$a.values);
    public final int values;

    public clearCache(int i) {
        this.values = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clearCache) && this.values == ((clearCache) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "ColorWrapper(color=" + this.values + ')';
    }
}
