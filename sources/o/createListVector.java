package o;

import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import o.createListVector;
/* loaded from: classes7.dex */
public abstract class createListVector<T, U extends createListVector<T, U>> {
    protected Thread ag$a;
    protected long ah$a;
    protected boolean valueOf;
    protected final List<T> HaptikSDK$c = new VolatileSizeArrayList();
    protected final List<Throwable> values = new VolatileSizeArrayList();
    protected final CountDownLatch toString = new CountDownLatch(1);
}
