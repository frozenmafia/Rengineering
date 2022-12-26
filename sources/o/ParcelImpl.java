package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ParcelImpl implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater valueOf = AtomicIntegerFieldUpdater.newUpdater(ParcelImpl.class, "_state");
    private volatile /* synthetic */ int _state = 0;
    private final Thread ag$a = Thread.currentThread();
    private final getPathName ah$a;
    private getStrokeLineCap toString;

    /* renamed from: o.ParcelImpl$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends parseInterpolatorFromTypeArray {
        public static final AnonymousClass1 toString = new AnonymousClass1();

        @Override // o.parseInterpolatorFromTypeArray
        public boolean isDispatchNeeded(PropertyValuesHolderUtils propertyValuesHolderUtils) {
            return false;
        }

        @Override // o.parseInterpolatorFromTypeArray
        public String toString() {
            return "Dispatchers.Unconfined";
        }

        private AnonymousClass1() {
        }

        @Override // o.parseInterpolatorFromTypeArray
        public parseInterpolatorFromTypeArray limitedParallelism(int i) {
            throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
        }

        @Override // o.parseInterpolatorFromTypeArray
        public void dispatch(PropertyValuesHolderUtils propertyValuesHolderUtils, Runnable runnable) {
            getVersionedParcelableList getversionedparcelablelist = (getVersionedParcelableList) propertyValuesHolderUtils.get(getVersionedParcelableList.values);
            if (getversionedparcelablelist != null) {
                getversionedparcelablelist.valueOf = true;
                return;
            }
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    public ParcelImpl(getPathName getpathname) {
        this.ah$a = getpathname;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        valueOf(th);
        return setAnimationMatrix.ag$a;
    }

    public final void valueOf() {
        int i;
        this.toString = this.ah$a.toString(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                values(i);
                throw new KotlinNothingValueException();
            }
        } while (!valueOf.compareAndSet(this, i, 0));
    }

    private final Void values(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final void ah$a() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        values(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (valueOf.compareAndSet(this, i, 1)) {
                getStrokeLineCap getstrokelinecap = this.toString;
                if (getstrokelinecap != null) {
                    getstrokelinecap.u_();
                    return;
                }
                return;
            }
        }
    }

    public void valueOf(Throwable th) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                values(i);
                throw new KotlinNothingValueException();
            }
        } while (!valueOf.compareAndSet(this, i, 2));
        this.ag$a.interrupt();
        this._state = 3;
    }
}
