package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class getRootStableInsets {
    private final List<toString<?>> valueOf = new ArrayList();

    public <T> ViewGroupKt<T> values(Class<T> cls) {
        synchronized (this) {
            for (toString<?> tostring : this.valueOf) {
                if (tostring.ag$a(cls)) {
                    return (ViewGroupKt<T>) tostring.valueOf;
                }
            }
            return null;
        }
    }

    public <T> void valueOf(Class<T> cls, ViewGroupKt<T> viewGroupKt) {
        synchronized (this) {
            this.valueOf.add(new toString<>(cls, viewGroupKt));
        }
    }

    /* loaded from: classes3.dex */
    static final class toString<T> {
        final ViewGroupKt<T> valueOf;
        private final Class<T> values;

        toString(Class<T> cls, ViewGroupKt<T> viewGroupKt) {
            this.values = cls;
            this.valueOf = viewGroupKt;
        }

        boolean ag$a(Class<?> cls) {
            return this.values.isAssignableFrom(cls);
        }
    }
}
