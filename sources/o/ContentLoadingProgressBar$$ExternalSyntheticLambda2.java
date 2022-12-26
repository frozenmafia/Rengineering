package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ContentLoadingProgressBar$$ExternalSyntheticLambda2 implements getViewHorizontalDragRange {
    private final String values;

    public ContentLoadingProgressBar$$ExternalSyntheticLambda2() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContentLoadingProgressBar$$ExternalSyntheticLambda2) && runAnimators.values((Object) this.values, (Object) ((ContentLoadingProgressBar$$ExternalSyntheticLambda2) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "AddEmailButtonTapped(_no_value=" + this.values + ')';
    }

    public ContentLoadingProgressBar$$ExternalSyntheticLambda2(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.values = str;
    }

    public /* synthetic */ ContentLoadingProgressBar$$ExternalSyntheticLambda2(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "AddEmailButtonTapped");
        return hashMap;
    }
}
