package o;

import javax.inject.Provider;
/* loaded from: classes7.dex */
public final class EditTextPreferenceDialogFragment<T> implements Provider<T> {
    private static final Object valueOf = new Object();
    private volatile Object toString = valueOf;
    private volatile Provider<T> values;

    private EditTextPreferenceDialogFragment(Provider<T> provider) {
        this.values = provider;
    }

    @Override // javax.inject.Provider
    public T ah$a() {
        T t = (T) this.toString;
        Object obj = valueOf;
        if (t == obj) {
            synchronized (this) {
                t = this.toString;
                if (t == obj) {
                    t = this.values.ah$a();
                    this.toString = ah$a(this.toString, t);
                    this.values = null;
                }
            }
        }
        return t;
    }

    public static Object ah$a(Object obj, Object obj2) {
        if (!((obj == valueOf || (obj instanceof scheduleShowSoftInputInner)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <P extends Provider<T>, T> Provider<T> toString(P p) {
        p.getClass();
        return p instanceof EditTextPreferenceDialogFragment ? p : new EditTextPreferenceDialogFragment(p);
    }
}
