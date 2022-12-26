package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.PeriodicWorkRequest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit timeUnit) {
        runAnimators.ag$a(timeUnit, "repeatIntervalTimeUnit");
        runAnimators.values(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, j, timeUnit);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration) {
        runAnimators.ag$a(duration, "repeatInterval");
        runAnimators.values(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, duration);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        runAnimators.ag$a(timeUnit, "repeatIntervalTimeUnit");
        runAnimators.ag$a(timeUnit2, "flexTimeIntervalUnit");
        runAnimators.values(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, j, timeUnit, j2, timeUnit2);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration, Duration duration2) {
        runAnimators.ag$a(duration, "repeatInterval");
        runAnimators.ag$a(duration2, "flexTimeInterval");
        runAnimators.values(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, duration, duration2);
    }
}
