package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class saveLastMotion implements getViewHorizontalDragRange {
    private final onItemRangeChanged ah$a;
    private final invalidateAll toString;
    private final setCheckedButton valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof saveLastMotion) {
            saveLastMotion savelastmotion = (saveLastMotion) obj;
            return runAnimators.values(this.ah$a, savelastmotion.ah$a) && runAnimators.values(this.toString, savelastmotion.toString) && runAnimators.values(this.valueOf, savelastmotion.valueOf);
        }
        return false;
    }

    public int hashCode() {
        onItemRangeChanged onitemrangechanged = this.ah$a;
        int hashCode = onitemrangechanged == null ? 0 : onitemrangechanged.hashCode();
        invalidateAll invalidateall = this.toString;
        return (((hashCode * 31) + (invalidateall != null ? invalidateall.hashCode() : 0)) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "RequestListLoaded(_errorCode=" + this.ah$a + ", _is_error=" + this.toString + ", _request_count=" + this.valueOf + ')';
    }

    public saveLastMotion(onItemRangeChanged onitemrangechanged, invalidateAll invalidateall, setCheckedButton setcheckedbutton) {
        runAnimators.ag$a(setcheckedbutton, "_request_count");
        this.ah$a = onitemrangechanged;
        this.toString = invalidateall;
        this.valueOf = setcheckedbutton;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RequestListLoaded");
        onItemRangeChanged onitemrangechanged = this.ah$a;
        if (onitemrangechanged != null) {
            hashMap.put("errorCode", Integer.valueOf(onitemrangechanged.ag$a()));
        }
        invalidateAll invalidateall = this.toString;
        if (invalidateall != null) {
            hashMap.put("is_error", Boolean.valueOf(invalidateall.valueOf()));
        }
        hashMap.put("request_count", Integer.valueOf(this.valueOf.valueOf()));
        return hashMap;
    }
}
