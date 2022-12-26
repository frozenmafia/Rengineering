package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class coerceToText implements getViewHorizontalDragRange {
    private final findBinding toString;
    private final DataBindingComponent valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof coerceToText) {
            coerceToText coercetotext = (coerceToText) obj;
            return runAnimators.values(this.valueOf, coercetotext.valueOf) && runAnimators.values(this.toString, coercetotext.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        return "GLViewAllClicked(_channelUrl=" + this.valueOf + ", _channel_member_count=" + this.toString + ')';
    }

    public coerceToText(DataBindingComponent dataBindingComponent, findBinding findbinding) {
        runAnimators.ag$a(dataBindingComponent, "_channelUrl");
        runAnimators.ag$a(findbinding, "_channel_member_count");
        this.valueOf = dataBindingComponent;
        this.toString = findbinding;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "GLViewAllClicked");
        hashMap.put("channelUrl", this.valueOf.ah$a());
        hashMap.put("channel_member_count", Integer.valueOf(this.toString.values()));
        return hashMap;
    }
}
