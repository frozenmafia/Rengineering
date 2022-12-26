package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.WindowInsetsControllerCompat;
import o.doOnDetach;
/* loaded from: classes3.dex */
public class doOnNextLayout {
    private static final doOnDetach.values<?> ag$a = new doOnDetach.values<Object>() { // from class: o.doOnNextLayout.2
        @Override // o.doOnDetach.values
        public doOnDetach<Object> valueOf(Object obj) {
            return new values(obj);
        }

        @Override // o.doOnDetach.values
        public Class<Object> values() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map<Class<?>, doOnDetach.values<?>> values = new HashMap();

    public void values(doOnDetach.values<?> valuesVar) {
        synchronized (this) {
            this.values.put(valuesVar.values(), valuesVar);
        }
    }

    public <T> doOnDetach<T> values(T t) {
        doOnDetach<T> doondetach;
        synchronized (this) {
            WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(t);
            doOnDetach.values<?> valuesVar = this.values.get(t.getClass());
            if (valuesVar == null) {
                Iterator<doOnDetach.values<?>> it = this.values.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    doOnDetach.values<?> next = it.next();
                    if (next.values().isAssignableFrom(t.getClass())) {
                        valuesVar = next;
                        break;
                    }
                }
            }
            if (valuesVar == null) {
                valuesVar = ag$a;
            }
            doondetach = (doOnDetach<T>) valuesVar.valueOf(t);
        }
        return doondetach;
    }

    /* loaded from: classes3.dex */
    static final class values implements doOnDetach<Object> {
        private final Object values;

        @Override // o.doOnDetach
        public void values() {
        }

        values(Object obj) {
            this.values = obj;
        }

        @Override // o.doOnDetach
        public Object ag$a() {
            return this.values;
        }
    }
}
