package o;

import java.util.logging.Level;
import java.util.logging.LogRecord;
/* loaded from: classes5.dex */
public final class wildcardMatch {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int ag$a(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
