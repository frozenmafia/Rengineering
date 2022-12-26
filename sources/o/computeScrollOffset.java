package o;

import java.util.HashMap;
import java.util.Map;
import o.ObservableInt;
/* loaded from: classes4.dex */
public final class computeScrollOffset implements getViewHorizontalDragRange {
    private final isRemoved toString;
    private final startCollection valueOf;
    private final ObservableInt.AnonymousClass1 values;

    public computeScrollOffset() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof computeScrollOffset) {
            computeScrollOffset computescrolloffset = (computeScrollOffset) obj;
            return runAnimators.values(this.toString, computescrolloffset.toString) && runAnimators.values(this.values, computescrolloffset.values) && runAnimators.values(this.valueOf, computescrolloffset.valueOf);
        }
        return false;
    }

    public int hashCode() {
        isRemoved isremoved = this.toString;
        int hashCode = isremoved == null ? 0 : isremoved.hashCode();
        ObservableInt.AnonymousClass1 anonymousClass1 = this.values;
        int hashCode2 = anonymousClass1 == null ? 0 : anonymousClass1.hashCode();
        startCollection startcollection = this.valueOf;
        return (((hashCode * 31) + hashCode2) * 31) + (startcollection != null ? startcollection.hashCode() : 0);
    }

    public String toString() {
        return "DRAnimationLoaded(_animationTrigger=" + this.toString + ", _drBalance=" + this.values + ", _newDreamBoxAssignedCount=" + this.valueOf + ')';
    }

    public computeScrollOffset(isRemoved isremoved, ObservableInt.AnonymousClass1 anonymousClass1, startCollection startcollection) {
        this.toString = isremoved;
        this.values = anonymousClass1;
        this.valueOf = startcollection;
    }

    public /* synthetic */ computeScrollOffset(isRemoved isremoved, ObservableInt.AnonymousClass1 anonymousClass1, startCollection startcollection, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : isremoved, (i & 2) != 0 ? null : anonymousClass1, (i & 4) != 0 ? null : startcollection);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "DRAnimationLoaded");
        isRemoved isremoved = this.toString;
        if (isremoved != null) {
            hashMap.put("animationTrigger", isremoved.valueOf());
        }
        ObservableInt.AnonymousClass1 anonymousClass1 = this.values;
        if (anonymousClass1 != null) {
            hashMap.put("drBalance", Integer.valueOf(anonymousClass1.ah$a()));
        }
        startCollection startcollection = this.valueOf;
        if (startcollection != null) {
            hashMap.put("newDreamBoxAssignedCount", Integer.valueOf(startcollection.valueOf()));
        }
        return hashMap;
    }
}
