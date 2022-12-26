package o;

import android.os.Handler;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$ah$b;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final class onGetLayoutInflater {
    private final long HaptikSDK$a;
    private long ag$a;
    private final GraphRequest ah$a;
    private long toString;
    private long valueOf;
    private final Handler values;

    public onGetLayoutInflater(Handler handler, GraphRequest graphRequest) {
        runAnimators.ag$a(graphRequest, "request");
        this.values = handler;
        this.ah$a = graphRequest;
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        this.HaptikSDK$a = DefaultSpecialEffectsController.AnonymousClass8.onXdkEvent();
    }

    public final void ah$a(long j) {
        long j2 = this.ag$a + j;
        this.ag$a = j2;
        if (j2 >= this.valueOf + this.HaptikSDK$a || j2 >= this.toString) {
            values();
        }
    }

    public final void ag$a(long j) {
        this.toString += j;
    }

    public final void values() {
        if (this.ag$a > this.valueOf) {
            final GraphRequest.values invoke = this.ah$a.invoke();
            final long j = this.toString;
            if (j <= 0 || !(invoke instanceof GraphRequest$ah$b)) {
                return;
            }
            final long j2 = this.ag$a;
            Handler handler = this.values;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: o.onDetach
                @Override // java.lang.Runnable
                public final void run() {
                    onGetLayoutInflater.valueOf(GraphRequest.values.this, j2, j);
                }
            }))) == null) {
                ((GraphRequest$ah$b) invoke).ah$a(j2, j);
            }
            this.valueOf = this.ag$a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(GraphRequest.values valuesVar, long j, long j2) {
        ((GraphRequest$ah$b) valuesVar).ah$a(j, j2);
    }
}
