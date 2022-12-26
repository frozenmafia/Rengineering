package o;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.Styleable;
/* loaded from: classes5.dex */
final class setCurrentItem extends dispatchOnPageSelected {
    public static final setCurrentItem ah$a = new setCurrentItem();
    private static final ReentrantReadWriteLock values = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, Styleable.ChangeBounds<Throwable, Throwable>> ag$a = new WeakHashMap<>();

    private setCurrentItem() {
    }

    @Override // o.dispatchOnPageSelected
    public Styleable.ChangeBounds<Throwable, Throwable> ah$a(Class<? extends Throwable> cls) {
        Styleable.ChangeBounds<Throwable, Throwable> ah$a2;
        ReentrantReadWriteLock reentrantReadWriteLock = values;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Styleable.ChangeBounds<Throwable, Throwable> changeBounds = ag$a.get(cls);
            if (changeBounds != null) {
                return changeBounds;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, Styleable.ChangeBounds<Throwable, Throwable>> weakHashMap = ag$a;
                Styleable.ChangeBounds<Throwable, Throwable> changeBounds2 = weakHashMap.get(cls);
                if (changeBounds2 != null) {
                    return changeBounds2;
                }
                ah$a2 = infoForCurrentScrollPosition.ah$a(cls);
                weakHashMap.put(cls, ah$a2);
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return ah$a2;
            } finally {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
