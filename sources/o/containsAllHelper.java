package o;

import java.util.List;
/* loaded from: classes3.dex */
public interface containsAllHelper {
    void ah$a(List<getKeySet> list, getKeySet getkeyset);

    /* loaded from: classes3.dex */
    public static final class values {
        public static /* synthetic */ void ah$a(containsAllHelper containsallhelper, List list, getKeySet getkeyset, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onToursSelected");
            }
            if ((i & 2) != 0) {
                getkeyset = null;
            }
            containsallhelper.ah$a(list, getkeyset);
        }
    }
}
