package o;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.ViewInfoStore;
/* loaded from: classes5.dex */
public class containsPosition {
    private static volatile containsPosition ag$a = null;
    private static boolean ah$a = true;
    static final containsPosition values = new containsPosition(true);
    private final Map<containsPosition$ag$a, GeneratedMessageLite.invoke<?, ?>> valueOf;

    public static containsPosition valueOf() {
        containsPosition containsposition = ag$a;
        if (containsposition == null) {
            synchronized (containsPosition.class) {
                containsposition = ag$a;
                if (containsposition == null) {
                    containsposition = ah$a ? findOneViewWithinBoundFlags.valueOf() : values;
                    ag$a = containsposition;
                }
            }
        }
        return containsposition;
    }

    public <ContainingType extends ViewInfoStore.InfoRecord> GeneratedMessageLite.invoke<ContainingType, ?> valueOf(final ContainingType containingtype, final int i) {
        return (GeneratedMessageLite.invoke<ContainingType, ?>) this.valueOf.get(new Object(containingtype, i) { // from class: o.containsPosition$ag$a
            private final int ag$a;
            private final Object values;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.values = containingtype;
                this.ag$a = i;
            }

            public int hashCode() {
                return (System.identityHashCode(this.values) * 65535) + this.ag$a;
            }

            public boolean equals(Object obj) {
                if (obj instanceof containsPosition$ag$a) {
                    containsPosition$ag$a containsposition_ag_a = (containsPosition$ag$a) obj;
                    return this.values == containsposition_ag_a.values && this.ag$a == containsposition_ag_a.ag$a;
                }
                return false;
            }
        });
    }

    containsPosition() {
        this.valueOf = new HashMap();
    }

    containsPosition(boolean z) {
        this.valueOf = Collections.emptyMap();
    }
}
