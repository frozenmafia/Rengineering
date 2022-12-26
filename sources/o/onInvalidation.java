package o;

import android.content.Context;
import com.microsoft.fraudprotection.androidsdk.FPRunnableType;
import o.IMultiInstanceInvalidationCallback;
import o.IMultiInstanceInvalidationService;
/* loaded from: classes5.dex */
public class onInvalidation extends IMultiInstanceInvalidationCallback.Stub {
    public onInvalidation(String str, String str2, Context context, Ignore ignore, onConflict onconflict, InvalidationTracker invalidationTracker) {
        super(FPRunnableType.CONFIG, str, str2, context, ignore, onconflict, invalidationTracker);
    }

    @Override // java.lang.Runnable
    public void run() {
        values();
    }

    private void values() {
        try {
            IMultiInstanceInvalidationService.Default.valueOf("Fetching Config....");
            this.toString.ah$a(this.invoke, this.valueOf, this.values);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception in getConfiguration: ", e);
            this.values.toString(new IMultiInstanceInvalidationCallback.Stub.Proxy<>(this.ah$a, new IMultiInstanceInvalidationCallback(e.getMessage())));
        }
    }
}
