package o;

import com.google.common.base.JdkPattern;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public final class preProcess {
    private static final java.util.logging.Logger ah$a = java.util.logging.Logger.getLogger(preProcess.class.getName());
    private static final obtainUpdateOp values = ag$a();

    public static String ag$a(String str) {
        return str == null ? "" : str;
    }

    private preProcess() {
    }

    public static long valueOf() {
        return System.nanoTime();
    }

    public static boolean ah$a(String str) {
        return str == null || str.isEmpty();
    }

    public static String values(String str) {
        if (ah$a(str)) {
            return null;
        }
        return str;
    }

    public static findPositionOffset toString(String str) {
        markViewHoldersUpdated.toString(str);
        return values.values(str);
    }

    public static boolean values() {
        return values.values();
    }

    private static obtainUpdateOp ag$a() {
        return new toString();
    }

    /* loaded from: classes5.dex */
    public static final class toString implements obtainUpdateOp {
        @Override // o.obtainUpdateOp
        public boolean values() {
            return true;
        }

        private toString() {
        }

        @Override // o.obtainUpdateOp
        public findPositionOffset values(String str) {
            return new JdkPattern(Pattern.compile(str));
        }
    }
}
