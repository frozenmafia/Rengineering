package o;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class growByteBuffer implements dataStart, Constants {
    volatile boolean ag$a;
    MetadataList<dataStart> values;

    @Override // o.dataStart
    public void dispose() {
        if (this.ag$a) {
            return;
        }
        synchronized (this) {
            if (this.ag$a) {
                return;
            }
            this.ag$a = true;
            MetadataList<dataStart> metadataList = this.values;
            this.values = null;
            valueOf(metadataList);
        }
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.ag$a;
    }

    @Override // o.Constants
    public boolean ah$a(dataStart datastart) {
        Objects.requireNonNull(datastart, "disposable is null");
        if (!this.ag$a) {
            synchronized (this) {
                if (!this.ag$a) {
                    MetadataList<dataStart> metadataList = this.values;
                    if (metadataList == null) {
                        metadataList = new MetadataList<>();
                        this.values = metadataList;
                    }
                    metadataList.ag$a(datastart);
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
        Objects.requireNonNull(datastart, "disposable is null");
        if (this.ag$a) {
            return false;
        }
        synchronized (this) {
            if (this.ag$a) {
                return false;
            }
            MetadataList<dataStart> metadataList = this.values;
            if (metadataList != null && metadataList.ah$a(datastart)) {
                return true;
            }
            return false;
        }
    }

    public int ah$a() {
        if (this.ag$a) {
            return 0;
        }
        synchronized (this) {
            if (this.ag$a) {
                return 0;
            }
            MetadataList<dataStart> metadataList = this.values;
            return metadataList != null ? metadataList.ag$a() : 0;
        }
    }

    void valueOf(MetadataList<dataStart> metadataList) {
        Object[] valueOf;
        if (metadataList == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : metadataList.valueOf()) {
            if (obj instanceof dataStart) {
                try {
                    ((dataStart) obj).dispose();
                } catch (Throwable th) {
                    FlatBufferBuilder.ah$a(th);
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
