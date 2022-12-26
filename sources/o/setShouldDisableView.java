package o;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;
/* loaded from: classes7.dex */
public final class setShouldDisableView {
    private static SparseArray<Priority> ah$a = new SparseArray<>();
    private static HashMap<Priority, Integer> valueOf;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        valueOf = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        valueOf.put(Priority.VERY_LOW, 1);
        valueOf.put(Priority.HIGHEST, 2);
        for (Priority priority : valueOf.keySet()) {
            ah$a.append(valueOf.get(priority).intValue(), priority);
        }
    }

    public static Priority valueOf(int i) {
        Priority priority = ah$a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }

    public static int values(Priority priority) {
        Integer num = valueOf.get(priority);
        if (num == null) {
            throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
        }
        return num.intValue();
    }
}
