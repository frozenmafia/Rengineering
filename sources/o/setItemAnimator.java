package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.setEdgeEffectFactory;
/* loaded from: classes5.dex */
public class setItemAnimator<T> implements Iterable<T> {
    private final setEdgeEffectFactory<T, Void> ah$a;

    public setItemAnimator(List<T> list, Comparator<T> comparator) {
        this.ah$a = setEdgeEffectFactory.valueOf.valueOf(list, Collections.emptyMap(), setEdgeEffectFactory.valueOf.valueOf(), comparator);
    }

    private setItemAnimator(setEdgeEffectFactory<T, Void> setedgeeffectfactory) {
        this.ah$a = setedgeeffectfactory;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setItemAnimator) {
            return this.ah$a.equals(((setItemAnimator) obj).ah$a);
        }
        return false;
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public setItemAnimator<T> ag$a(T t) {
        setEdgeEffectFactory<T, Void> values = this.ah$a.values((setEdgeEffectFactory<T, Void>) t);
        return values == this.ah$a ? this : new setItemAnimator<>(values);
    }

    public setItemAnimator<T> toString(T t) {
        return new setItemAnimator<>(this.ah$a.values(t, null));
    }

    public T ah$a() {
        return this.ah$a.ah$a();
    }

    public T ag$a() {
        return this.ah$a.ag$a();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new setItemAnimator$ah$a(this.ah$a.iterator());
    }

    public Iterator<T> values() {
        return new setItemAnimator$ah$a(this.ah$a.HaptikSDK$a());
    }

    public T values(T t) {
        return this.ah$a.valueOf(t);
    }
}
