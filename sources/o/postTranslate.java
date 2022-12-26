package o;

import java.util.Map;
import java.util.Map.Entry;
/* loaded from: classes5.dex */
public abstract class postTranslate<E extends Map.Entry<? extends K, ? extends V>, K, V> extends Fade<E> {
    public abstract boolean values(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return toString((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return valueOf((Map.Entry) obj);
        }
        return false;
    }

    public boolean valueOf(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    public final boolean toString(E e) {
        runAnimators.ag$a(e, "element");
        return values(e);
    }
}
