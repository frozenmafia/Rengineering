package com.sendbird.android;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LoggerV2 {
    private static final ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<>();
    private static final String defaultTag = "Sendbird";
    private static LogLevel level;
    private static final Collection<LogWriter> logWriters;

    LoggerV2() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        logWriters = arrayList;
        level = LogLevel.WARN;
        arrayList.add(new ConsoleLogWriter());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLogLevel(LogLevel logLevel) {
        level = logLevel;
    }

    static void v(String str) {
        vt((String) null, (Throwable) null, str);
    }

    static void v(Throwable th) {
        vt((String) null, th, (String) null);
    }

    static void v(Throwable th, String str) {
        vt((String) null, th, str);
    }

    static void v(String str, Object... objArr) {
        vt(null, null, str, objArr);
    }

    static void v(Throwable th, String str, Object... objArr) {
        vt(null, th, str, objArr);
    }

    static void vt(String str, String str2) {
        vt(str, (Throwable) null, str2);
    }

    static void vt(String str, Throwable th, String str2) {
        printLog(LogLevel.VERBOSE, str, str2, th);
    }

    static void vt(String str, String str2, Object... objArr) {
        vt(str, null, str2, objArr);
    }

    static void vt(String str, Throwable th, String str2, Object... objArr) {
        printLog(LogLevel.VERBOSE, str, String.format(str2, objArr), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(String str) {
        dt((String) null, (Throwable) null, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Throwable th) {
        dt((String) null, th, (String) null);
    }

    static void d(Throwable th, String str) {
        dt((String) null, th, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(String str, Object... objArr) {
        dt(null, null, str, objArr);
    }

    static void d(Throwable th, String str, Object... objArr) {
        dt(null, th, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void dt(String str, String str2) {
        dt(str, (Throwable) null, str2);
    }

    static void dt(String str, Throwable th, String str2) {
        printLog(LogLevel.DEBUG, str, str2, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void dt(String str, String str2, Object... objArr) {
        dt(str, null, str2, objArr);
    }

    static void dt(String str, Throwable th, String str2, Object... objArr) {
        printLog(LogLevel.DEBUG, str, String.format(str2, objArr), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(String str) {
        it((String) null, (Throwable) null, str);
    }

    static void i(Throwable th) {
        it((String) null, th, (String) null);
    }

    static void i(Throwable th, String str) {
        it((String) null, th, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(String str, Object... objArr) {
        it(null, null, str, objArr);
    }

    static void i(Throwable th, String str, Object... objArr) {
        it(null, th, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void it(String str, String str2) {
        it(str, (Throwable) null, str2);
    }

    static void it(String str, Throwable th, String str2) {
        printLog(LogLevel.INFO, str, str2, th);
    }

    static void it(String str, String str2, Object... objArr) {
        it(str, null, str2, objArr);
    }

    static void it(String str, Throwable th, String str2, Object... objArr) {
        printLog(LogLevel.INFO, str, String.format(str2, objArr), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(String str) {
        wt((String) null, (Throwable) null, str);
    }

    static void w(Throwable th) {
        wt((String) null, th, (String) null);
    }

    static void w(Throwable th, String str) {
        wt((String) null, th, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(String str, Object... objArr) {
        wt(null, null, str, objArr);
    }

    static void w(Throwable th, String str, Object... objArr) {
        wt(null, th, str, objArr);
    }

    static void wt(String str, String str2) {
        wt(str, (Throwable) null, str2);
    }

    static void wt(String str, Throwable th, String str2) {
        printLog(LogLevel.WARN, str, str2, th);
    }

    static void wt(String str, String str2, Object... objArr) {
        wt(str, null, str2, objArr);
    }

    static void wt(String str, Throwable th, String str2, Object... objArr) {
        printLog(LogLevel.WARN, str, String.format(str2, objArr), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String str) {
        et((String) null, (Throwable) null, str);
    }

    static void e(Throwable th) {
        et((String) null, th, (String) null);
    }

    static void e(Throwable th, String str) {
        et((String) null, th, str);
    }

    static void e(String str, Object... objArr) {
        et(null, null, str, objArr);
    }

    static void e(Throwable th, String str, Object... objArr) {
        et(null, th, str, objArr);
    }

    static void et(String str, String str2) {
        et(str, (Throwable) null, str2);
    }

    static void et(String str, Throwable th, String str2) {
        printLog(LogLevel.ERROR, str, str2, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void et(String str, String str2, Object... objArr) {
        et(str, null, str2, objArr);
    }

    static void et(String str, Throwable th, String str2, Object... objArr) {
        printLog(LogLevel.ERROR, str, String.format(str2, objArr), th);
    }

    private static void printLog(LogLevel logLevel, String str, String str2, Throwable th) {
        if (level.order > logLevel.order) {
            return;
        }
        String str3 = str == null ? "Sendbird" : "Sendbird:" + str;
        for (LogWriter logWriter : logWriters) {
            logWriter.print(logLevel, str3, String.format("%s\n%s", getMessageWithStackTrace(str2), Log.getStackTraceString(th)));
        }
    }

    private static String getMessageWithStackTrace(String str) {
        String stackTrace = getStackTrace();
        Object[] objArr = new Object[2];
        if (stackTrace == null) {
            stackTrace = "";
        }
        objArr[0] = stackTrace;
        objArr[1] = str;
        return String.format("%s %s", objArr);
    }

    private static String getStackTrace() {
        return getStackTrace(Thread.currentThread().getStackTrace());
    }

    private static String getStackTrace(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        int length = stackTraceElementArr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            if (z || className.startsWith(LoggerV2.class.getCanonicalName())) {
                if (!className.startsWith(LoggerV2.class.getCanonicalName())) {
                    break;
                }
                z = true;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return null;
        }
        String[] split = stackTraceElement.getClassName().split("\\.");
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        ThreadLocal<SimpleDateFormat> threadLocal = dateFormatThreadLocal;
        if (threadLocal.get() == null) {
            threadLocal.set(new SimpleDateFormat("HH:mm:ss.SSS", Locale.US));
        }
        return String.format(Locale.US, "[%s %s:%s():%d]", threadLocal.get().format(Long.valueOf(System.currentTimeMillis())), split[split.length - 1], methodName, Integer.valueOf(lineNumber));
    }
}
