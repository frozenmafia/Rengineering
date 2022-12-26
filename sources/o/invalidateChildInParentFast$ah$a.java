package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Transition;
/* loaded from: classes7.dex */
public final class invalidateChildInParentFast$ah$a implements Iterator<E>, Transition.ArrayListManager {
    private Iterator<? extends E> ah$a;
    private final Iterator<T> toString;
    final /* synthetic */ invalidateChildInParentFast<T, R, E> valueOf;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public invalidateChildInParentFast$ah$a(invalidateChildInParentFast<T, R, E> invalidatechildinparentfast) {
        invalidateChildInParent invalidatechildinparent;
        this.valueOf = invalidatechildinparentfast;
        invalidatechildinparent = ((invalidateChildInParentFast) invalidatechildinparentfast).values;
        this.toString = invalidatechildinparent.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public E next() {
        if (!values()) {
            throw new NoSuchElementException();
        }
        Iterator<? extends E> it = this.ah$a;
        runAnimators.toString(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return values();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean values() {
        /*
            r5 = this;
            java.util.Iterator<? extends E> r0 = r5.ah$a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L14
            r0 = 0
            r5.ah$a = r0
        L14:
            java.util.Iterator<? extends E> r0 = r5.ah$a
            if (r0 != 0) goto L45
            java.util.Iterator<T> r0 = r5.toString
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            return r2
        L21:
            java.util.Iterator<T> r0 = r5.toString
            java.lang.Object r0 = r0.next()
            o.invalidateChildInParentFast<T, R, E> r3 = r5.valueOf
            o.Styleable$ChangeBounds r3 = o.invalidateChildInParentFast.toString(r3)
            o.invalidateChildInParentFast<T, R, E> r4 = r5.valueOf
            o.Styleable$ChangeBounds r4 = o.invalidateChildInParentFast.valueOf(r4)
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L14
            r5.ah$a = r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invalidateChildInParentFast$ah$a.values():boolean");
    }
}
