package o;

import android.content.Context;
/* loaded from: classes4.dex */
public class drainQueue {
    private EmptyActivityLifecycleCallbacks toString;
    private final Context values;

    public drainQueue(Context context) {
        this.values = context;
    }

    public EmptyActivityLifecycleCallbacks valueOf() {
        EmptyActivityLifecycleCallbacks emptyActivityLifecycleCallbacks;
        synchronized (this) {
            if (this.toString == null) {
                this.toString = new EmptyActivityLifecycleCallbacks(this.values);
            }
            emptyActivityLifecycleCallbacks = this.toString;
        }
        return emptyActivityLifecycleCallbacks;
    }
}
