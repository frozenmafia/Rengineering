package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import o.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class computeScrollDuration {
    private static WeakReference<computeScrollDuration> valueOf;
    private final Executor ag$a;
    private final SharedPreferences toString;
    private RecyclerView.ViewHolder values;

    private computeScrollDuration(SharedPreferences sharedPreferences, Executor executor) {
        this.ag$a = executor;
        this.toString = sharedPreferences;
    }

    private final void ah$a() {
        synchronized (this) {
            this.values = RecyclerView.ViewHolder.ah$a(this.toString, "topic_operation_queue", ",", this.ag$a);
        }
    }

    public static computeScrollDuration values(Context context, Executor executor) {
        computeScrollDuration computescrollduration;
        synchronized (computeScrollDuration.class) {
            WeakReference<computeScrollDuration> weakReference = valueOf;
            computescrollduration = weakReference != null ? weakReference.get() : null;
            if (computescrollduration == null) {
                computescrollduration = new computeScrollDuration(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                computescrollduration.ah$a();
                valueOf = new WeakReference<>(computescrollduration);
            }
        }
        return computescrollduration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final addChangePayload ag$a() {
        addChangePayload values;
        synchronized (this) {
            values = addChangePayload.values(this.values.values());
        }
        return values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean valueOf(addChangePayload addchangepayload) {
        boolean ag$a;
        synchronized (this) {
            ag$a = this.values.ag$a(addchangepayload.valueOf());
        }
        return ag$a;
    }
}
