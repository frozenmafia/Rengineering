package o;

import java.util.ArrayList;
import java.util.List;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes2.dex */
public class get<T> {
    private List<SupportSQLiteOpenHelper.Factory<? super T>> ah$a = new ArrayList();

    public void ah$a(T t) {
        synchronized (this.ah$a) {
            for (SupportSQLiteOpenHelper.Factory<? super T> factory : this.ah$a) {
                factory.onNext(t);
            }
            values();
        }
    }

    public void valueOf(Throwable th) {
        synchronized (this.ah$a) {
            for (SupportSQLiteOpenHelper.Factory<? super T> factory : this.ah$a) {
                factory.onError(th);
            }
            values();
        }
    }

    public void ah$a(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        synchronized (this.ah$a) {
            this.ah$a.add(factory);
        }
    }

    public void values() {
        synchronized (this.ah$a) {
            this.ah$a.clear();
        }
    }

    public void ag$a(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        synchronized (this.ah$a) {
            this.ah$a.remove(factory);
        }
    }
}
