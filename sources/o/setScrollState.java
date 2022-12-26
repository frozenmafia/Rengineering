package o;

import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public class setScrollState {
    private final List<String> ah$a;
    private final List<List<String>> toString;

    public setScrollState(List<List<String>> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.toString = list;
        this.ah$a = list2;
    }

    public List<List<String>> ag$a() {
        return Collections.unmodifiableList(this.toString);
    }

    public List<String> ah$a() {
        return Collections.unmodifiableList(this.ah$a);
    }
}
