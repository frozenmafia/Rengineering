package o;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class createUnintializedVector implements dataStart, Constants {
    List<dataStart> ah$a;
    volatile boolean values;

    @Override // o.dataStart
    public void dispose() {
        if (this.values) {
            return;
        }
        synchronized (this) {
            if (this.values) {
                return;
            }
            this.values = true;
            List<dataStart> list = this.ah$a;
            this.ah$a = null;
            toString(list);
        }
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.values;
    }

    @Override // o.Constants
    public boolean ah$a(dataStart datastart) {
        Objects.requireNonNull(datastart, "d is null");
        if (!this.values) {
            synchronized (this) {
                if (!this.values) {
                    List list = this.ah$a;
                    if (list == null) {
                        list = new LinkedList();
                        this.ah$a = list;
                    }
                    list.add(datastart);
                    return true;
                }
            }
        }
        datastart.dispose();
        return false;
    }

    @Override // o.Constants
    public boolean ag$a(dataStart datastart) {
        if (valueOf(datastart)) {
            datastart.dispose();
            return true;
        }
        return false;
    }

    @Override // o.Constants
    public boolean valueOf(dataStart datastart) {
        Objects.requireNonNull(datastart, "Disposable item is null");
        if (this.values) {
            return false;
        }
        synchronized (this) {
            if (this.values) {
                return false;
            }
            List<dataStart> list = this.ah$a;
            if (list != null && list.remove(datastart)) {
                return true;
            }
            return false;
        }
    }

    void toString(List<dataStart> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (dataStart datastart : list) {
            try {
                datastart.dispose();
            } catch (Throwable th) {
                FlatBufferBuilder.ah$a(th);
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
