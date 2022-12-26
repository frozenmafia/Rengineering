package o;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public class isForwardFling implements getOrientationHelper, PagerSnapHelper {
    private final int HaptikSDK$a;
    private final RecyclerView ag$a;
    private final TimeUnit ah$a;
    private final Object toString = new Object();
    private boolean valueOf = false;
    private CountDownLatch values;

    public isForwardFling(RecyclerView recyclerView, int i, TimeUnit timeUnit) {
        this.ag$a = recyclerView;
        this.HaptikSDK$a = i;
        this.ah$a = timeUnit;
    }

    @Override // o.PagerSnapHelper
    public void ag$a(String str, Bundle bundle) {
        createScroller createscroller;
        createScroller createscroller2;
        createScroller createscroller3;
        createScroller createscroller4;
        createScroller createscroller5;
        synchronized (this.toString) {
            createscroller = createScroller.valueOf;
            createscroller.valueOf("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.values = new CountDownLatch(1);
            this.valueOf = false;
            this.ag$a.ag$a(str, bundle);
            createscroller2 = createScroller.valueOf;
            createscroller2.valueOf("Awaiting app exception callback from Analytics...");
            try {
                if (!this.values.await(this.HaptikSDK$a, this.ah$a)) {
                    createscroller4 = createScroller.valueOf;
                    createscroller4.values("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                } else {
                    this.valueOf = true;
                    createscroller5 = createScroller.valueOf;
                    createscroller5.valueOf("App exception callback received from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                createscroller3 = createScroller.valueOf;
                createscroller3.toString("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.values = null;
        }
    }

    @Override // o.getOrientationHelper
    public void valueOf(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.values;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
