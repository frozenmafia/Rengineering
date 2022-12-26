package o;

import java.util.Objects;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getNextColorIndex<T> extends SupportSQLiteQuery<T> {
    final T[] ah$a;

    public getNextColorIndex(T[] tArr) {
        this.ah$a = tArr;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        toString tostring = new toString(factory, this.ah$a);
        factory.onSubscribe(tostring);
        if (tostring.valueOf) {
            return;
        }
        tostring.values();
    }

    /* loaded from: classes5.dex */
    static final class toString<T> extends setAnimationListener<T> {
        final SupportSQLiteOpenHelper.Factory<? super T> ag$a;
        final T[] ah$a;
        int toString;
        boolean valueOf;
        volatile boolean values;

        toString(SupportSQLiteOpenHelper.Factory<? super T> factory, T[] tArr) {
            this.ag$a = factory;
            this.ah$a = tArr;
        }

        @Override // o.e
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.valueOf = true;
                return 1;
            }
            return 0;
        }

        @Override // o.elevationSupported
        public T poll() {
            int i = this.toString;
            T[] tArr = this.ah$a;
            if (i != tArr.length) {
                this.toString = i + 1;
                return (T) Objects.requireNonNull(tArr[i], "The array element is null");
            }
            return null;
        }

        @Override // o.elevationSupported
        public boolean isEmpty() {
            return this.toString == this.ah$a.length;
        }

        @Override // o.elevationSupported
        public void clear() {
            this.toString = this.ah$a.length;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.values = true;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.values;
        }

        void values() {
            T[] tArr = this.ah$a;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    SupportSQLiteOpenHelper.Factory<? super T> factory = this.ag$a;
                    factory.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.ag$a.onNext(t);
            }
            if (isDisposed()) {
                return;
            }
            this.ag$a.onComplete();
        }
    }
}
