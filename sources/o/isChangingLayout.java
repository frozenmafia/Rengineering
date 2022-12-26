package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Styleable;
import o.Transition;
/* loaded from: classes5.dex */
public final class isChangingLayout<T> implements invalidateChildInParent<T> {
    private final Styleable.ChangeBounds<T, Boolean> ag$a;
    private final invalidateChildInParent<T> ah$a;
    private final boolean valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    public isChangingLayout(invalidateChildInParent<? extends T> invalidatechildinparent, boolean z, Styleable.ChangeBounds<? super T, Boolean> changeBounds) {
        runAnimators.ag$a(invalidatechildinparent, com.apxor.androidsdk.core.ce.Constants.SEQUENCE_NO);
        runAnimators.ag$a(changeBounds, "predicate");
        this.ah$a = invalidatechildinparent;
        this.valueOf = z;
        this.ag$a = changeBounds;
    }

    /* loaded from: classes5.dex */
    public static final class valueOf implements Iterator<T>, Transition.ArrayListManager {
        private int ag$a = -1;
        final /* synthetic */ isChangingLayout<T> toString;
        private T valueOf;
        private final Iterator<T> values;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        valueOf(isChangingLayout<T> ischanginglayout) {
            this.toString = ischanginglayout;
            this.values = ((isChangingLayout) ischanginglayout).ah$a.iterator();
        }

        private final void ah$a() {
            while (this.values.hasNext()) {
                T next = this.values.next();
                if (((Boolean) ((isChangingLayout) this.toString).ag$a.invoke(next)).booleanValue() == ((isChangingLayout) this.toString).valueOf) {
                    this.valueOf = next;
                    this.ag$a = 1;
                    return;
                }
            }
            this.ag$a = 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.ag$a == -1) {
                ah$a();
            }
            if (this.ag$a == 0) {
                throw new NoSuchElementException();
            }
            T t = this.valueOf;
            this.valueOf = null;
            this.ag$a = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.ag$a == -1) {
                ah$a();
            }
            return this.ag$a == 1;
        }
    }

    @Override // o.invalidateChildInParent
    public Iterator<T> iterator() {
        return new valueOf(this);
    }
}
