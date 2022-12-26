package o;

import com.bugsnag.android.TaskType;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes6.dex */
public class setFocusedByDefault {
    private final AtomicBoolean toString = new AtomicBoolean();
    private boolean ag$a = false;

    public boolean toString(final String str, final getPivotX getpivotx, final setSystemGestureExclusionRects setsystemgestureexclusionrects) {
        try {
            getpivotx.ag$a.values(TaskType.IO, new Runnable() { // from class: o.setFocusedByDefault.2
                @Override // java.lang.Runnable
                public void run() {
                    setFocusedByDefault.this.ah$a(str, getpivotx, setsystemgestureexclusionrects);
                }
            }).get();
            return this.ag$a;
        } catch (Throwable unused) {
            return false;
        }
    }

    void ah$a(String str, getPivotX getpivotx, setSystemGestureExclusionRects setsystemgestureexclusionrects) {
        if (this.toString.getAndSet(true)) {
            return;
        }
        try {
            System.loadLibrary(str);
            this.ag$a = true;
        } catch (UnsatisfiedLinkError e) {
            getpivotx.values(e, setsystemgestureexclusionrects);
        }
    }

    public boolean ag$a() {
        return this.ag$a;
    }
}
