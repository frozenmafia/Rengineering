package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class obtainBounds implements getViewHorizontalDragRange {
    private final ViewGroupBindingAdapter.AnonymousClass2 valueOf;

    public obtainBounds() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obtainBounds) && runAnimators.values(this.valueOf, ((obtainBounds) obj).valueOf);
    }

    public int hashCode() {
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.valueOf;
        if (anonymousClass2 == null) {
            return 0;
        }
        return anonymousClass2.hashCode();
    }

    public String toString() {
        return "PasswordSubmitTapped(_variant=" + this.valueOf + ')';
    }

    public obtainBounds(ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2) {
        this.valueOf = anonymousClass2;
    }

    public /* synthetic */ obtainBounds(ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : anonymousClass2);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "PasswordSubmitTapped");
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.valueOf;
        if (anonymousClass2 != null) {
            hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
        }
        return hashMap;
    }
}
