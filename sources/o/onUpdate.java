package o;

import android.content.Context;
import com.microsoft.fraudprotection.androidsdk.AttributeType;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.IMultiInstanceInvalidationService;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class onUpdate extends onDelete {
    private final AtomicBoolean ah$b;
    private Index toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onUpdate(Context context, JSONObject jSONObject) {
        super(context, jSONObject);
        this.ah$b = new AtomicBoolean(true);
    }

    @Override // o.onDelete
    public String valueOf() {
        return AttributeType.DEVICE_SPECIFICATIONS.getType();
    }

    @Override // o.onDelete
    public void valueOf(Index index) {
        this.toString = index;
        try {
            this.valueOf = System.nanoTime();
            values();
            new matchInfo(this.ah$a, this.values, this.ag$a).ag$a();
            toString(null);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString(valueOf() + " execute error ", e);
            toString(new IMultiInstanceInvalidationCallback(e.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onDelete
    public void toString(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback) {
        if (this.ah$b.compareAndSet(true, false)) {
            long j = -1;
            if (iMultiInstanceInvalidationCallback != null) {
                this.values.ag$a(valueOf(), iMultiInstanceInvalidationCallback.ah$a());
            } else {
                j = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.valueOf);
            }
            this.toString.ah$a(this.values, j);
        }
    }

    void values() {
        try {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            newSingleThreadScheduledExecutor.schedule(new Runnable() { // from class: o.onUpdate.1
                @Override // java.lang.Runnable
                public void run() {
                    onUpdate.this.toString(null);
                }
            }, 500L, TimeUnit.MILLISECONDS);
            newSingleThreadScheduledExecutor.shutdown();
        } catch (Exception e) {
            toString(new IMultiInstanceInvalidationCallback(e.toString()));
        }
    }
}
