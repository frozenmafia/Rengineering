package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class findActiveFragment {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, execSingleAction>> values = new ConcurrentHashMap<>();

    public final void valueOf(String str, List<execSingleAction> list) {
        runAnimators.ag$a(str, "appId");
        runAnimators.ag$a(list, "gateKeeperList");
        ConcurrentHashMap<String, execSingleAction> concurrentHashMap = new ConcurrentHashMap<>();
        for (execSingleAction execsingleaction : list) {
            concurrentHashMap.put(execsingleaction.valueOf(), execsingleaction);
        }
        this.values.put(str, concurrentHashMap);
    }

    public final List<execSingleAction> ah$a(String str) {
        runAnimators.ag$a(str, "appId");
        ConcurrentHashMap<String, execSingleAction> concurrentHashMap = this.values.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ConcurrentHashMap<String, execSingleAction> concurrentHashMap2 = concurrentHashMap;
        ArrayList arrayList = new ArrayList(concurrentHashMap2.size());
        for (Map.Entry<String, execSingleAction> entry : concurrentHashMap2.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
