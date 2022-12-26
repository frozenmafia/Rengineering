package o;

import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class addToData<T> {
    private final T valueOf;

    private addToData() {
        this.valueOf = null;
    }

    private addToData(T t) {
        Objects.requireNonNull(t, "value for optional is empty.");
        this.valueOf = t;
    }

    public static <T> addToData<T> ag$a() {
        return new addToData<>();
    }

    public static <T> addToData<T> ag$a(T t) {
        return new addToData<>(t);
    }

    public static <T> addToData<T> toString(T t) {
        return t == null ? ag$a() : ag$a(t);
    }

    public T values() {
        T t = this.valueOf;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean ah$a() {
        return this.valueOf != null;
    }
}
