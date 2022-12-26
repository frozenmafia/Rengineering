package com.facebook.systrace;

import android.os.Trace;
/* loaded from: classes.dex */
public class Systrace {
    public static void ag$a(long j, String str, int i) {
    }

    public static void ag$a(long j, String str, int i, long j2) {
    }

    public static void ag$a(long j, String str, EventScope eventScope) {
    }

    public static void ah$a(long j, String str, int i) {
    }

    public static void ah$a(long j, String str, int i, long j2) {
    }

    public static void ah$a(TraceListener traceListener) {
    }

    public static void toString(long j, String str, int i) {
    }

    public static void toString(TraceListener traceListener) {
    }

    public static boolean toString(long j) {
        return false;
    }

    public static void valueOf(long j, String str, int i) {
    }

    public static void values(long j, String str, int i) {
    }

    /* loaded from: classes4.dex */
    public enum EventScope {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        
        private final char mCode;

        EventScope(char c) {
            this.mCode = c;
        }

        public char getCode() {
            return this.mCode;
        }
    }

    public static void ah$a(long j, String str) {
        Trace.beginSection(str);
    }

    public static void valueOf(long j) {
        Trace.endSection();
    }
}
