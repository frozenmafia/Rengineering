package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes5.dex */
public final class isEagerlyInitialized implements FrameworkSQLiteDatabase.AnonymousClass2, InitializationProvider {
    List<FrameworkSQLiteDatabase.AnonymousClass2> ah$a;
    volatile boolean valueOf;

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        if (this.valueOf) {
            return;
        }
        synchronized (this) {
            if (this.valueOf) {
                return;
            }
            this.valueOf = true;
            List<FrameworkSQLiteDatabase.AnonymousClass2> list = this.ah$a;
            this.ah$a = null;
            ah$a(list);
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.valueOf;
    }

    @Override // o.InitializationProvider
    public boolean values(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        Objects.requireNonNull(anonymousClass2, "d is null");
        if (!this.valueOf) {
            synchronized (this) {
                if (!this.valueOf) {
                    List list = this.ah$a;
                    if (list == null) {
                        list = new LinkedList();
                        this.ah$a = list;
                    }
                    list.add(anonymousClass2);
                    return true;
                }
            }
        }
        anonymousClass2.dispose();
        return false;
    }

    @Override // o.InitializationProvider
    public boolean valueOf(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (ah$a(anonymousClass2)) {
            anonymousClass2.dispose();
            return true;
        }
        return false;
    }

    @Override // o.InitializationProvider
    public boolean ah$a(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        Objects.requireNonNull(anonymousClass2, "Disposable item is null");
        if (this.valueOf) {
            return false;
        }
        synchronized (this) {
            if (this.valueOf) {
                return false;
            }
            List<FrameworkSQLiteDatabase.AnonymousClass2> list = this.ah$a;
            if (list != null && list.remove(anonymousClass2)) {
                return true;
            }
            return false;
        }
    }

    void ah$a(List<FrameworkSQLiteDatabase.AnonymousClass2> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 : list) {
            try {
                anonymousClass2.dispose();
            } catch (Throwable th) {
                FrameworkSQLiteDatabase.values(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw ExceptionHelper.valueOf((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }
}
