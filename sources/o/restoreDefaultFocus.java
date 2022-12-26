package o;

import android.os.StrictMode;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class restoreDefaultFocus implements Thread.UncaughtExceptionHandler {
    private final setImportantForAccessibility ah$a;
    private final getPivotX values;
    private final registerForLayoutCallback toString = new registerForLayoutCallback();
    private final Thread.UncaughtExceptionHandler ag$a = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: Access modifiers changed from: package-private */
    public restoreDefaultFocus(getPivotX getpivotx, setImportantForAccessibility setimportantforaccessibility) {
        this.values = getpivotx;
        this.ah$a = setimportantforaccessibility;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf() {
        Thread.setDefaultUncaughtExceptionHandler(this.ag$a);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        if (!this.values.ah$b().valueOf(th)) {
            boolean valueOf = this.toString.valueOf(th);
            setOnApplyWindowInsetsListener setonapplywindowinsetslistener = new setOnApplyWindowInsetsListener();
            if (valueOf) {
                String registerforlayoutcallback = this.toString.toString(th.getMessage());
                setOnApplyWindowInsetsListener setonapplywindowinsetslistener2 = new setOnApplyWindowInsetsListener();
                setonapplywindowinsetslistener2.ag$a("StrictMode", "Violation", registerforlayoutcallback);
                str = registerforlayoutcallback;
                setonapplywindowinsetslistener = setonapplywindowinsetslistener2;
            } else {
                str = null;
            }
            String str2 = valueOf ? "strictMode" : "unhandledException";
            if (valueOf) {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                this.values.toString(th, setonapplywindowinsetslistener, str2, str);
                StrictMode.setThreadPolicy(threadPolicy);
            } else {
                this.values.toString(th, setonapplywindowinsetslistener, str2, null);
            }
            ah$a(thread, th);
            return;
        }
        ah$a(thread, th);
    }

    private void ah$a(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.ag$a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        System.err.printf("Exception in thread \"%s\" ", thread.getName());
        this.ah$a.toString("Exception", th);
    }
}
