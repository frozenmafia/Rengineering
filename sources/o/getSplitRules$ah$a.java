package o;

import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Route;
/* loaded from: classes5.dex */
public final class getSplitRules$ah$a {
    private int ag$a;
    private final List<Route> values;

    public getSplitRules$ah$a(List<Route> list) {
        runAnimators.ag$a(list, "routes");
        this.values = list;
    }

    public final List<Route> values() {
        return this.values;
    }

    public final boolean valueOf() {
        return this.ag$a < this.values.size();
    }

    public final Route ag$a() {
        if (!valueOf()) {
            throw new NoSuchElementException();
        }
        List<Route> list = this.values;
        int i = this.ag$a;
        this.ag$a = i + 1;
        return list.get(i);
    }
}
