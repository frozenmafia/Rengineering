package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class setSize implements getViewHorizontalDragRange {
    private final setCapitalize ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setSize) && runAnimators.values(this.ah$a, ((setSize) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "BankIFSCAPISuccess(_successflag=" + this.ah$a + ')';
    }

    public setSize(setCapitalize setcapitalize) {
        runAnimators.ag$a(setcapitalize, "_successflag");
        this.ah$a = setcapitalize;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "BankIFSCAPISuccess");
        hashMap.put("successflag", Boolean.valueOf(this.ah$a.ah$a()));
        return hashMap;
    }
}
