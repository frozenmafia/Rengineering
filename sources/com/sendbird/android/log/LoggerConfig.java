package com.sendbird.android.log;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class LoggerConfig {
    static final int ASSERT = 7;
    static final int DEBUG = 3;
    static final int DEV = 0;
    static final int ERROR = 6;
    static final int INFO = 4;
    static final int VERBOSE = 2;
    static final int WARN = 5;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
    private Tag defaultTag;
    private Set<String> ignoreStackSet;
    private int printLoggerLevel;
    private String stackPrefix;

    LoggerConfig() {
    }

    private String getTraceInfo() {
        return getTraceInfo(Thread.currentThread().getStackTrace());
    }

    private String getTraceInfo(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        String canonicalName = getClass().getCanonicalName();
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
            if (className.equalsIgnoreCase(canonicalName)) {
                z = true;
            }
            if (z && !className.startsWith(canonicalName) && !this.ignoreStackSet.contains(className)) {
                break;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return null;
        }
        String[] split = stackTraceElement.getClassName().split("\\.");
        return String.format(Locale.US, "[%s %s:%s():%d]", this.dateFormat.format(Long.valueOf(System.currentTimeMillis())), split[split.length - 1], stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Tag getDefaultTag() {
        return this.defaultTag;
    }

    private String getMessageWithTrace(String str) {
        String traceInfo = getTraceInfo();
        Object[] objArr = new Object[2];
        if (traceInfo == null) {
            traceInfo = "";
        }
        objArr[0] = traceInfo;
        objArr[1] = str;
        return String.format("%s %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPrintLoggable(int i) {
        return i >= this.printLoggerLevel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class Builder {
        private String stackPrefix;
        private int printLoggerLevel = 0;
        private Tag defaultTag = Tag.DEFAULT;
        private Set<String> ignoreStackSet = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setDefaultTag(Tag tag) {
            this.defaultTag = tag;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setPrintLoggerLevel(int i) {
            this.printLoggerLevel = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setIgnoreSet(Set<String> set) {
            if (set == null) {
                return this;
            }
            this.ignoreStackSet = set;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setStackPrefix(String str) {
            this.stackPrefix = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public LoggerConfig build() {
            LoggerConfig loggerConfig = new LoggerConfig();
            loggerConfig.defaultTag = this.defaultTag;
            loggerConfig.printLoggerLevel = this.printLoggerLevel;
            loggerConfig.stackPrefix = this.stackPrefix;
            loggerConfig.ignoreStackSet = this.ignoreStackSet;
            return loggerConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getMessage(boolean z, String str) {
        return z ? getMessageWithTrace(str) : str;
    }
}
