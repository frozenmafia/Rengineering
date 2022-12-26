package o;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;
import o.StaggeredGridLayoutManager;
/* loaded from: classes5.dex */
public final class prepareLayoutStateForDelta extends invalidateSpanAssignments {
    private final LinkedTreeMap<String, invalidateSpanAssignments> valueOf = new LinkedTreeMap<>();

    public void toString(String str, invalidateSpanAssignments invalidatespanassignments) {
        LinkedTreeMap<String, invalidateSpanAssignments> linkedTreeMap = this.valueOf;
        if (invalidatespanassignments == null) {
            invalidatespanassignments = setGapStrategy.values;
        }
        linkedTreeMap.put(str, invalidatespanassignments);
    }

    public void ah$a(String str, Number number) {
        toString(str, number == null ? setGapStrategy.values : new StaggeredGridLayoutManager.AnonymousClass1(number));
    }

    public Set<Map.Entry<String, invalidateSpanAssignments>> HaptikSDK$d() {
        return this.valueOf.entrySet();
    }

    public Set<String> onXdkEvent() {
        return this.valueOf.keySet();
    }

    public invalidateSpanAssignments ag$a(String str) {
        return this.valueOf.get(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof prepareLayoutStateForDelta) && ((prepareLayoutStateForDelta) obj).valueOf.equals(this.valueOf));
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }
}
