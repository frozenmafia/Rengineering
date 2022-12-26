package o;

import android.util.Log;
/* loaded from: classes5.dex */
public class createScroller {
    static final createScroller valueOf = new createScroller("FirebaseCrashlytics");
    private final String ag$a;
    private int values = 4;

    public createScroller(String str) {
        this.ag$a = str;
    }

    private boolean toString(int i) {
        return this.values <= i || Log.isLoggable(this.ag$a, i);
    }

    public void toString(String str, Throwable th) {
        if (toString(3)) {
            Log.d(this.ag$a, str, th);
        }
    }

    public void valueOf(String str, Throwable th) {
        if (toString(2)) {
            Log.v(this.ag$a, str, th);
        }
    }

    public void values(String str, Throwable th) {
        if (toString(4)) {
            Log.i(this.ag$a, str, th);
        }
    }

    public void ah$a(String str, Throwable th) {
        if (toString(5)) {
            Log.w(this.ag$a, str, th);
        }
    }

    public void ag$a(String str, Throwable th) {
        if (toString(6)) {
            Log.e(this.ag$a, str, th);
        }
    }

    public void ah$a(String str) {
        toString(str, null);
    }

    public void valueOf(String str) {
        valueOf(str, null);
    }

    public void ag$a(String str) {
        values(str, null);
    }

    public void values(String str) {
        ah$a(str, null);
    }

    public void toString(String str) {
        ag$a(str, null);
    }
}
