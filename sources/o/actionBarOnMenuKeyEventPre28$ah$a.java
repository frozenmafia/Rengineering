package o;

import java.util.List;
import o.ViewPager2;
/* loaded from: classes3.dex */
public final class actionBarOnMenuKeyEventPre28$ah$a {
    public final List<TypefaceCompat> valueOf;

    public /* synthetic */ actionBarOnMenuKeyEventPre28$ah$a(int i, List list) {
        if (1 != (i & 1)) {
            ViewPager2.AnonymousClass4.values(i, 1, actionBarOnMenuKeyEventPre28$ah$a$ah$a.values.values());
        }
        this.valueOf = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof actionBarOnMenuKeyEventPre28$ah$a) && runAnimators.values(this.valueOf, ((actionBarOnMenuKeyEventPre28$ah$a) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "LayerMetadata(layers=" + this.valueOf + ')';
    }
}
