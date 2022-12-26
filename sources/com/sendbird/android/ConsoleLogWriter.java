package com.sendbird.android;

import android.util.Log;
import java.util.Locale;
/* loaded from: classes5.dex */
final class ConsoleLogWriter implements LogWriter {
    private static final int LOG_SEGMENT_SIZE = 2000;

    @Override // com.sendbird.android.LogWriter
    public int print(LogLevel logLevel, String str, String str2) {
        int i = 0;
        if (logLevel == null || str == null || str2 == null) {
            throw new NullPointerException(String.format("one of level(%s), tag(%s), msg(%s) is null.", logLevel, str, str2));
        }
        int i2 = 0;
        int i3 = 0;
        while (i < str2.length()) {
            int min = Math.min(str2.length() - i, 2000);
            i2 += printLogPartially(logLevel, str, str2, i, min, i3);
            i3++;
            i += min;
        }
        return i2;
    }

    private static int printLogPartially(LogLevel logLevel, String str, String str2, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        if (i3 > 0) {
            sb.append(String.format(Locale.US, "Cont(%d) ", Integer.valueOf(i3)));
        }
        sb.append(str2.substring(i, i2 + i));
        if (LogLevel.VERBOSE == logLevel) {
            return Log.v(str, sb.toString());
        }
        if (LogLevel.DEBUG == logLevel) {
            return Log.d(str, sb.toString());
        }
        if (LogLevel.INFO == logLevel) {
            return Log.i(str, sb.toString());
        }
        if (LogLevel.WARN == logLevel) {
            return Log.w(str, sb.toString());
        }
        if (LogLevel.ERROR == logLevel) {
            return Log.e(str, sb.toString());
        }
        throw new IllegalArgumentException(String.format("unexpected level %s in print.", logLevel));
    }
}
