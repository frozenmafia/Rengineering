package o;

import com.facebook.FacebookRequestError;
import java.util.Map;
import java.util.Set;
/* loaded from: classes4.dex */
public final class enableNewStateManager {
    private static enableNewStateManager ag$a;
    public static final enableNewStateManager$ah$a values = new enableNewStateManager$ah$a(null);
    private final Map<Integer, Set<Integer>> HaptikSDK$a;
    private final String ah$a;
    private final String ah$b;
    private final String invoke;
    private final Map<Integer, Set<Integer>> toString;
    private final Map<Integer, Set<Integer>> valueOf;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class toString {
        public static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[FacebookRequestError.Category.valuesCustom().length];
            iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            ag$a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public enableNewStateManager(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.toString = map;
        this.HaptikSDK$a = map2;
        this.valueOf = map3;
        this.invoke = str;
        this.ah$b = str2;
        this.ah$a = str3;
    }

    public final String toString(FacebookRequestError.Category category) {
        int i = category == null ? -1 : toString.ag$a[category.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return this.ah$b;
            }
            return this.ah$a;
        }
        return this.invoke;
    }

    public final FacebookRequestError.Category ah$a(int i, int i2, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.toString;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = this.toString.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.valueOf;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = this.valueOf.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.HaptikSDK$a;
        if (map3 != null && map3.containsKey(Integer.valueOf(i)) && ((set = this.HaptikSDK$a.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        return FacebookRequestError.Category.OTHER;
    }
}
