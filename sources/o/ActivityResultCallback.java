package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ActivityResultCallback<E> {
    private final List<E> values = new ArrayList();

    public final void ag$a(E e) {
        this.values.add(e);
    }

    public final E ag$a() {
        if (!(!valueOf())) {
            throw new IllegalStateException("Stack is empty.".toString());
        }
        List<E> list = this.values;
        return list.remove(list.size() - 1);
    }

    public final boolean valueOf() {
        return this.values.isEmpty();
    }
}
