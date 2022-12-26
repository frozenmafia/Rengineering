package o;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* loaded from: classes5.dex */
public final class setPreferences {
    private final String toString;

    public setPreferences(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.toString = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    private static String toString(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int ag$a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", toString(this.toString, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }

    public final int ah$a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", toString(this.toString, str, objArr));
        }
        return 0;
    }

    public final int valueOf(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", toString(this.toString, str, objArr));
        }
        return 0;
    }

    public final int valueOf(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", toString(this.toString, str, objArr), th);
        }
        return 0;
    }

    public final int values(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", toString(this.toString, str, objArr));
        }
        return 0;
    }
}
