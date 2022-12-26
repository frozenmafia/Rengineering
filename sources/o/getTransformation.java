package o;

import java.lang.Comparable;
import java.util.List;
import o.Compatibility;
/* loaded from: classes2.dex */
public final class getTransformation<K extends Comparable<? super K>, V extends Comparable<? super V>> {
    private final androidx.databinding.ObservableList<Compatibility.Api18Impl<K, V>> ah$a = new androidx.databinding.ObservableArrayList();

    public final boolean ag$a() {
        for (Compatibility.Api18Impl<K, V> api18Impl : this.ah$a) {
            if (!api18Impl.ag$a()) {
                return false;
            }
        }
        return true;
    }

    public final androidx.databinding.ObservableList<Compatibility.Api18Impl<K, V>> ah$a() {
        return this.ah$a;
    }

    public final int invoke() {
        int i = 0;
        for (Compatibility.Api18Impl<K, V> api18Impl : this.ah$a) {
            i += api18Impl.ah$a().size();
        }
        return i;
    }

    public final int valueOf() {
        return this.ah$a.size();
    }

    public final void values() {
        this.ah$a.clear();
    }

    public final V HaptikSDK$c() {
        List ah$a;
        Compatibility.Api18Impl api18Impl = (Compatibility.Api18Impl) reserveEndViewTransition.getSignupData((List<? extends Object>) this.ah$a);
        if (api18Impl == null || (ah$a = api18Impl.ah$a()) == null) {
            return null;
        }
        return (V) reserveEndViewTransition.getSignupData((List<? extends Object>) ah$a);
    }

    public final int ah$a(Compatibility.Api18Impl<K, V> api18Impl) {
        runAnimators.ag$a(api18Impl, "section");
        if (this.ah$a.isEmpty()) {
            return -1;
        }
        int i = 0;
        if (this.ah$a.get(0).compareTo(api18Impl) > 0) {
            return 0;
        }
        int size = this.ah$a.size();
        while (i < size - 1) {
            int i2 = i + 1;
            if (this.ah$a.get(i).compareTo(api18Impl) < 0 && this.ah$a.get(i2).compareTo(api18Impl) > 0) {
                return i2;
            }
            i = i2;
        }
        return this.ah$a.size();
    }

    private final void values(Compatibility.Api18Impl<K, V> api18Impl) {
        synchronized (this) {
            int ah$a = ah$a((Compatibility.Api18Impl) api18Impl);
            if (ah$a == -1) {
                this.ah$a.add(api18Impl);
            } else {
                this.ah$a.add(ah$a, api18Impl);
                setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            }
        }
    }

    public final void valueOf(Compatibility.Api18Impl<K, V> api18Impl, V v) {
        runAnimators.ag$a(api18Impl, "section");
        runAnimators.ag$a(v, "item");
        api18Impl.values((Compatibility.Api18Impl<K, V>) v);
        if (api18Impl.ag$a()) {
            this.ah$a.remove(api18Impl);
        }
    }

    public final Compatibility.Api18Impl<K, V> valueOf(K k) {
        runAnimators.ag$a(k, "sectionKey");
        for (Compatibility.Api18Impl<K, V> api18Impl : this.ah$a) {
            if (runAnimators.values(api18Impl.values(), k)) {
                return api18Impl;
            }
        }
        return null;
    }

    public final Compatibility.Api18Impl<K, V> ah$a(K k) {
        runAnimators.ag$a(k, "sectionKey");
        for (Compatibility.Api18Impl<K, V> api18Impl : this.ah$a) {
            if (api18Impl.values().equals(k)) {
                runAnimators.ah$a(api18Impl, "it");
                return api18Impl;
            }
        }
        Compatibility.Api18Impl<K, V> api18Impl2 = new Compatibility.Api18Impl<>(k);
        values(api18Impl2);
        return api18Impl2;
    }
}
