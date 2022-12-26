package kotlin.collections.builders;

import o.addTransitionInternal;
import o.getTargetTypes;
/* loaded from: classes5.dex */
final class MapBuilder$ah$a {
    public /* synthetic */ MapBuilder$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private MapBuilder$ah$a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int values(int i) {
        return Integer.highestOneBit(addTransitionInternal.ah$a(i, 1) * 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int ag$a(int i) {
        return Integer.numberOfLeadingZeros(i) + 1;
    }
}
