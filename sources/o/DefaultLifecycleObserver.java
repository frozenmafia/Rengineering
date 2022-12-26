package o;

import android.content.Context;
/* loaded from: classes.dex */
public final class DefaultLifecycleObserver {
    public static final DefaultLifecycleObserver$ag$a ag$a = new DefaultLifecycleObserver$ag$a(null);
    private static final DefaultLifecycleObserver ah$a = new DefaultLifecycleObserver();
    private Context toString;
    private String valueOf = "FCAndroidSDK";
    private dispatchAndEnqueue values;

    /* renamed from: o.DefaultLifecycleObserver$-CC */
    /* loaded from: classes4.dex */
    public class CC {
        public static int ag$a = 403;
    }

    private DefaultLifecycleObserver() {
    }

    public final void valueOf(Context context) {
        runAnimators.ag$a(context, "context");
        this.toString = context;
        this.values = new dispatchAndEnqueue(context);
    }

    public final void ag$a(getCoroutineContext getcoroutinecontext) {
        runAnimators.ag$a(getcoroutinecontext, "auth");
        dispatchAndEnqueue dispatchandenqueue = this.values;
        if (dispatchandenqueue != null) {
            dispatchandenqueue.values(getcoroutinecontext);
        }
    }

    public final String ag$a() {
        dispatchAndEnqueue dispatchandenqueue = this.values;
        if (dispatchandenqueue != null) {
            runAnimators.toString(dispatchandenqueue);
            return dispatchandenqueue.ag$a();
        }
        return "";
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "siteType");
        this.valueOf = str;
    }

    public final void toString(onActive onactive) {
        runAnimators.ag$a(onactive, "userInfo");
        dispatchAndEnqueue dispatchandenqueue = this.values;
        if (dispatchandenqueue != null) {
            dispatchandenqueue.valueOf(onactive);
        }
    }
}
