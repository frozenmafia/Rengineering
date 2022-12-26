package o;

import java.util.HashMap;
import java.util.Map;
import o.CallbackRegistry;
/* loaded from: classes4.dex */
public final class ensureMotionHistorySizeForId implements getViewHorizontalDragRange {
    private final CallbackRegistry.NotifierCallback values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ensureMotionHistorySizeForId) && runAnimators.values(this.values, ((ensureMotionHistorySizeForId) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "RegistrationPageButtonTapped(_button=" + this.values + ')';
    }

    public ensureMotionHistorySizeForId(CallbackRegistry.NotifierCallback notifierCallback) {
        runAnimators.ag$a(notifierCallback, "_button");
        this.values = notifierCallback;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RegistrationPageButtonTapped");
        hashMap.put("button", this.values.ag$a());
        return hashMap;
    }
}
