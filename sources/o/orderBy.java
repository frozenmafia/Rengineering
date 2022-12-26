package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Objects;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes.dex */
public final class orderBy implements FrameworkSQLiteDatabase.AnonymousClass2, InitializationProvider {
    getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> ag$a;
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
            getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> getprogressviewstartoffset = this.ag$a;
            this.ag$a = null;
            toString(getprogressviewstartoffset);
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.valueOf;
    }

    @Override // o.InitializationProvider
    public boolean values(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        Objects.requireNonNull(anonymousClass2, "disposable is null");
        if (!this.valueOf) {
            synchronized (this) {
                if (!this.valueOf) {
                    getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> getprogressviewstartoffset = this.ag$a;
                    if (getprogressviewstartoffset == null) {
                        getprogressviewstartoffset = new getProgressViewStartOffset<>();
                        this.ag$a = getprogressviewstartoffset;
                    }
                    getprogressviewstartoffset.ag$a(anonymousClass2);
                    return true;
                }
            }
        }
        anonymousClass2.dispose();
        return false;
    }

    public boolean valueOf(FrameworkSQLiteDatabase.AnonymousClass2... anonymousClass2Arr) {
        Objects.requireNonNull(anonymousClass2Arr, "disposables is null");
        if (!this.valueOf) {
            synchronized (this) {
                if (!this.valueOf) {
                    getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> getprogressviewstartoffset = this.ag$a;
                    if (getprogressviewstartoffset == null) {
                        getprogressviewstartoffset = new getProgressViewStartOffset<>(anonymousClass2Arr.length + 1);
                        this.ag$a = getprogressviewstartoffset;
                    }
                    for (FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 : anonymousClass2Arr) {
                        Objects.requireNonNull(anonymousClass2, "A Disposable in the disposables array is null");
                        getprogressviewstartoffset.ag$a(anonymousClass2);
                    }
                    return true;
                }
            }
        }
        for (FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass22 : anonymousClass2Arr) {
            anonymousClass22.dispose();
        }
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
        Objects.requireNonNull(anonymousClass2, "disposables is null");
        if (this.valueOf) {
            return false;
        }
        synchronized (this) {
            if (this.valueOf) {
                return false;
            }
            getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> getprogressviewstartoffset = this.ag$a;
            if (getprogressviewstartoffset != null && getprogressviewstartoffset.values((getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2>) anonymousClass2)) {
                return true;
            }
            return false;
        }
    }

    public void ah$a() {
        if (this.valueOf) {
            return;
        }
        synchronized (this) {
            if (this.valueOf) {
                return;
            }
            getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> getprogressviewstartoffset = this.ag$a;
            this.ag$a = null;
            toString(getprogressviewstartoffset);
        }
    }

    public int ag$a() {
        if (this.valueOf) {
            return 0;
        }
        synchronized (this) {
            if (this.valueOf) {
                return 0;
            }
            getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> getprogressviewstartoffset = this.ag$a;
            return getprogressviewstartoffset != null ? getprogressviewstartoffset.valueOf() : 0;
        }
    }

    void toString(getProgressViewStartOffset<FrameworkSQLiteDatabase.AnonymousClass2> getprogressviewstartoffset) {
        Object[] ag$a;
        if (getprogressviewstartoffset == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : getprogressviewstartoffset.ag$a()) {
            if (obj instanceof FrameworkSQLiteDatabase.AnonymousClass2) {
                try {
                    ((FrameworkSQLiteDatabase.AnonymousClass2) obj).dispose();
                } catch (Throwable th) {
                    FrameworkSQLiteDatabase.values(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
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
