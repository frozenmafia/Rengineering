package o;

import java.util.Map;
import o.SortedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getAndRemoveOriginalDelegateForItem extends dispatchAddFinished {
    private static final shouldBeKeptAsChild values = shouldBeKeptAsChild.ah$a();
    private final SortedList.Callback ah$a;

    private boolean ah$a(Long l) {
        return l != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getAndRemoveOriginalDelegateForItem(SortedList.Callback callback) {
        this.ah$a = callback;
    }

    @Override // o.dispatchAddFinished
    public boolean ah$a() {
        if (!values(this.ah$a, 0)) {
            shouldBeKeptAsChild shouldbekeptaschild = values;
            shouldbekeptaschild.ah$a("Invalid Trace:" + this.ah$a.HaptikSDK$a());
            return false;
        } else if (!valueOf(this.ah$a) || ah$a(this.ah$a)) {
            return true;
        } else {
            shouldBeKeptAsChild shouldbekeptaschild2 = values;
            shouldbekeptaschild2.ah$a("Invalid Counters for Trace:" + this.ah$a.HaptikSDK$a());
            return false;
        }
    }

    private boolean valueOf(SortedList.Callback callback) {
        boolean z;
        if (callback.ag$a() > 0) {
            return true;
        }
        for (SortedList.Callback callback2 : callback.HaptikSDK$e()) {
            if (callback2.ag$a() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private boolean ah$a(SortedList.Callback callback) {
        return toString(callback, 0);
    }

    private boolean toString(SortedList.Callback callback, int i) {
        if (callback == null) {
            return false;
        }
        if (i > 1) {
            values.ah$a("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : callback.HaptikSDK$c().entrySet()) {
            if (!valueOf(entry.getKey())) {
                shouldBeKeptAsChild shouldbekeptaschild = values;
                shouldbekeptaschild.ah$a("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!ah$a(entry.getValue())) {
                shouldBeKeptAsChild shouldbekeptaschild2 = values;
                shouldbekeptaschild2.ah$a("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (SortedList.Callback callback2 : callback.HaptikSDK$e()) {
            if (!toString(callback2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean values(SortedList.Callback callback, int i) {
        if (callback == null) {
            values.ah$a("TraceMetric is null");
            return false;
        } else if (i > 1) {
            values.ah$a("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!values(callback.HaptikSDK$a())) {
            shouldBeKeptAsChild shouldbekeptaschild = values;
            shouldbekeptaschild.ah$a("invalid TraceId:" + callback.HaptikSDK$a());
            return false;
        } else if (!toString(callback)) {
            shouldBeKeptAsChild shouldbekeptaschild2 = values;
            shouldbekeptaschild2.ah$a("invalid TraceDuration:" + callback.HaptikSDK$b());
            return false;
        } else if (!callback.getSignupData()) {
            values.ah$a("clientStartTimeUs is null.");
            return false;
        } else {
            for (SortedList.Callback callback2 : callback.HaptikSDK$e()) {
                if (!values(callback2, i + 1)) {
                    return false;
                }
            }
            return valueOf(callback.ah$b());
        }
    }

    private boolean values(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    private boolean toString(SortedList.Callback callback) {
        return callback != null && callback.HaptikSDK$b() > 0;
    }

    private boolean valueOf(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            values.ah$a("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            values.ah$a("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    private boolean valueOf(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String ah$a = dispatchAddFinished.ah$a(entry);
            if (ah$a != null) {
                values.ah$a(ah$a);
                return false;
            }
        }
        return true;
    }
}
