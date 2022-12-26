package o;

import com.sendbird.android.constant.StringSet;
import java.util.Map;
import o.FragmentStateAdapter;
import o.Styleable;
/* loaded from: classes5.dex */
public final class Logger {
    private final Map<FragmentStateAdapter.DataSetChangeObserver, Map<valueOf<Object>, Object>> values = createMessage.ah$a(1);

    /* loaded from: classes5.dex */
    public static final class valueOf<T> {
    }

    public final <T> void ah$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, valueOf<T> valueof, T t) {
        runAnimators.ag$a(dataSetChangeObserver, "descriptor");
        runAnimators.ag$a(valueof, StringSet.key);
        runAnimators.ag$a(t, "value");
        Map<FragmentStateAdapter.DataSetChangeObserver, Map<valueOf<Object>, Object>> map = this.values;
        Map<valueOf<Object>, Object> map2 = map.get(dataSetChangeObserver);
        if (map2 == null) {
            map2 = createMessage.ah$a(1);
            map.put(dataSetChangeObserver, map2);
        }
        map2.put(valueof, t);
    }

    public final <T> T toString(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, valueOf<T> valueof, Styleable.ArcMotion<? extends T> arcMotion) {
        runAnimators.ag$a(dataSetChangeObserver, "descriptor");
        runAnimators.ag$a(valueof, StringSet.key);
        runAnimators.ag$a(arcMotion, "defaultValue");
        T t = (T) toString(dataSetChangeObserver, valueof);
        if (t == null) {
            T invoke = arcMotion.invoke();
            ah$a(dataSetChangeObserver, valueof, invoke);
            return invoke;
        }
        return t;
    }

    public final <T> T toString(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, valueOf<T> valueof) {
        runAnimators.ag$a(dataSetChangeObserver, "descriptor");
        runAnimators.ag$a(valueof, StringSet.key);
        Map<valueOf<Object>, Object> map = this.values.get(dataSetChangeObserver);
        Object obj = map == null ? null : map.get(valueof);
        if (obj != null) {
            return (T) obj;
        }
        return null;
    }
}
