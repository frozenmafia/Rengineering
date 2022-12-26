package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ResourceCursorAdapter implements getViewHorizontalDragRange {
    private final forceExecuteBindings toString;
    private final setRequiresFadingEdge valueOf;

    public ResourceCursorAdapter() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResourceCursorAdapter) {
            ResourceCursorAdapter resourceCursorAdapter = (ResourceCursorAdapter) obj;
            return runAnimators.values(this.toString, resourceCursorAdapter.toString) && runAnimators.values(this.valueOf, resourceCursorAdapter.valueOf);
        }
        return false;
    }

    public int hashCode() {
        forceExecuteBindings forceexecutebindings = this.toString;
        int hashCode = forceexecutebindings == null ? 0 : forceexecutebindings.hashCode();
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        return (hashCode * 31) + (setrequiresfadingedge != null ? setrequiresfadingedge.hashCode() : 0);
    }

    public String toString() {
        return "LaunchScreen(_isSourceFcCTA=" + this.toString + ", _utm_redirection=" + this.valueOf + ')';
    }

    public ResourceCursorAdapter(forceExecuteBindings forceexecutebindings, setRequiresFadingEdge setrequiresfadingedge) {
        this.toString = forceexecutebindings;
        this.valueOf = setrequiresfadingedge;
    }

    public /* synthetic */ ResourceCursorAdapter(forceExecuteBindings forceexecutebindings, setRequiresFadingEdge setrequiresfadingedge, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : forceexecutebindings, (i & 2) != 0 ? null : setrequiresfadingedge);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "LaunchScreen");
        forceExecuteBindings forceexecutebindings = this.toString;
        if (forceexecutebindings != null) {
            hashMap.put("isSourceFcCTA", Boolean.valueOf(forceexecutebindings.valueOf()));
        }
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        if (setrequiresfadingedge != null) {
            hashMap.put("utm_redirection", setrequiresfadingedge.ah$a());
        }
        return hashMap;
    }
}
