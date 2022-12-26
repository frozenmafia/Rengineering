package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public final class findFirstVisibleItemPosition extends ThreadPoolExecutor {
    public findFirstVisibleItemPosition(FirebaseAnalytics firebaseAnalytics, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
