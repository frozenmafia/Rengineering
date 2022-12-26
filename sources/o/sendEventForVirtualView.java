package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class sendEventForVirtualView implements getViewHorizontalDragRange {
    private final String ah$a;

    public sendEventForVirtualView() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sendEventForVirtualView) && runAnimators.values((Object) this.ah$a, (Object) ((sendEventForVirtualView) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "OnboardingLanguageChangeIconClicked(_no_value=" + this.ah$a + ')';
    }

    public sendEventForVirtualView(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.ah$a = str;
    }

    public /* synthetic */ sendEventForVirtualView(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "OnboardingLanguageChangeIconClicked");
        return hashMap;
    }
}
