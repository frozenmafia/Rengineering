package o;

import java.util.List;
import java.util.Map;
import java.util.Set;
import o.ComponentActivity;
/* loaded from: classes.dex */
public final class saveState$ah$a<T> {
    private final onStateChanged<?, ?, ?> HaptikSDK$a;
    private boolean HaptikSDK$c;
    private List<ComponentActivity.AnonymousClass2.AnonymousClass1> ag$a;
    private T ah$a;
    private onLaunch toString;
    private Map<String, ? extends Object> valueOf;
    private Set<String> values;

    public saveState$ah$a(onStateChanged<?, ?, ?> onstatechanged) {
        runAnimators.valueOf(onstatechanged, "operation");
        this.HaptikSDK$a = onstatechanged;
        this.toString = onLaunch.toString;
    }

    public final onStateChanged<?, ?, ?> HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public final T valueOf() {
        return this.ah$a;
    }

    public final List<ComponentActivity.AnonymousClass2.AnonymousClass1> values() {
        return this.ag$a;
    }

    public final Set<String> ah$a() {
        return this.values;
    }

    public final boolean HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final Map<String, Object> invoke() {
        return this.valueOf;
    }

    public final onLaunch HaptikSDK$c() {
        return this.toString;
    }

    public final saveState$ah$a<T> values(T t) {
        saveState$ah$a<T> savestate_ah_a = this;
        savestate_ah_a.ah$a = t;
        return savestate_ah_a;
    }

    public final saveState$ah$a<T> valueOf(List<ComponentActivity.AnonymousClass2.AnonymousClass1> list) {
        saveState$ah$a<T> savestate_ah_a = this;
        savestate_ah_a.ag$a = list;
        return savestate_ah_a;
    }

    public final saveState$ah$a<T> ag$a(Set<String> set) {
        saveState$ah$a<T> savestate_ah_a = this;
        savestate_ah_a.values = set;
        return savestate_ah_a;
    }

    public final saveState$ah$a<T> ag$a(boolean z) {
        saveState$ah$a<T> savestate_ah_a = this;
        savestate_ah_a.HaptikSDK$c = z;
        return savestate_ah_a;
    }

    public final saveState$ah$a<T> ag$a(Map<String, ? extends Object> map) {
        saveState$ah$a<T> savestate_ah_a = this;
        savestate_ah_a.valueOf = map;
        return savestate_ah_a;
    }

    public final saveState$ah$a<T> toString(onLaunch onlaunch) {
        runAnimators.valueOf(onlaunch, "executionContext");
        saveState$ah$a<T> savestate_ah_a = this;
        savestate_ah_a.toString = onlaunch;
        return savestate_ah_a;
    }

    public final saveState<T> ag$a() {
        return new saveState<>(this);
    }
}
