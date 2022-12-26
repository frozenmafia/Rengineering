package o;

import android.util.Log;
import java.util.logging.Level;
import o.getType;
/* loaded from: classes5.dex */
public class getHINGE implements getType.window_release {
    private static final boolean values;
    private final String toString;

    static {
        boolean z;
        if (Class.forName("android.util.Log") != null) {
            z = true;
            values = z;
        }
        z = false;
        values = z;
    }

    public static boolean values() {
        return values;
    }

    public getHINGE(String str) {
        this.toString = str;
    }

    @Override // o.getType.window_release
    public void ag$a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(ah$a(level), this.toString, str);
        }
    }

    @Override // o.getType.window_release
    public void values(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int ah$a = ah$a(level);
            String str2 = this.toString;
            Log.println(ah$a, str2, str + "\n" + Log.getStackTraceString(th));
        }
    }

    private int ah$a(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        } else if (intValue < 900) {
            return 4;
        } else {
            return intValue < 1000 ? 5 : 6;
        }
    }
}
