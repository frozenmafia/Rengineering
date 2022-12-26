package o;

import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class getLabeledBy {
    private final Map<String, setAction<? extends Object>> toString;

    public abstract List<setAction<? extends Object>> values();

    /* JADX WARN: Multi-variable type inference failed */
    public getLabeledBy(Map<String, ? extends setAction<? extends Object>> map) {
        runAnimators.ag$a(map, "keys");
        this.toString = map;
    }

    public final Map<String, setAction<? extends Object>> ag$a() {
        return this.toString;
    }

    public boolean ah$a() {
        return valueOf();
    }

    public final boolean valueOf() {
        return getRangeInfo.values(values());
    }

    public final boolean ah$b() {
        return getRangeInfo.valueOf(values());
    }
}
