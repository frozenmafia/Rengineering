package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getTextDirectionHeuristic implements getViewHorizontalDragRange {
    private final setDefaultComponent ah$a;
    private final onItemRangeRemoved values;

    public getTextDirectionHeuristic() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getTextDirectionHeuristic) {
            getTextDirectionHeuristic gettextdirectionheuristic = (getTextDirectionHeuristic) obj;
            return runAnimators.values(this.ah$a, gettextdirectionheuristic.ah$a) && runAnimators.values(this.values, gettextdirectionheuristic.values);
        }
        return false;
    }

    public int hashCode() {
        setDefaultComponent setdefaultcomponent = this.ah$a;
        int hashCode = setdefaultcomponent == null ? 0 : setdefaultcomponent.hashCode();
        onItemRangeRemoved onitemrangeremoved = this.values;
        return (hashCode * 31) + (onitemrangeremoved != null ? onitemrangeremoved.hashCode() : 0);
    }

    public String toString() {
        return "FabIconClicked(_clickType=" + this.ah$a + ", _entryPoint=" + this.values + ')';
    }

    public getTextDirectionHeuristic(setDefaultComponent setdefaultcomponent, onItemRangeRemoved onitemrangeremoved) {
        this.ah$a = setdefaultcomponent;
        this.values = onitemrangeremoved;
    }

    public /* synthetic */ getTextDirectionHeuristic(setDefaultComponent setdefaultcomponent, onItemRangeRemoved onitemrangeremoved, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : setdefaultcomponent, (i & 2) != 0 ? null : onitemrangeremoved);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FabIconClicked");
        setDefaultComponent setdefaultcomponent = this.ah$a;
        if (setdefaultcomponent != null) {
            hashMap.put("clickType", setdefaultcomponent.ag$a());
        }
        onItemRangeRemoved onitemrangeremoved = this.values;
        if (onitemrangeremoved != null) {
            hashMap.put("entryPoint", onitemrangeremoved.ah$a());
        }
        return hashMap;
    }
}
