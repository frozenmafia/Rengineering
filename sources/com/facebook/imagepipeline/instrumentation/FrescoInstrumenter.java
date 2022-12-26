package com.facebook.imagepipeline.instrumentation;
/* loaded from: classes4.dex */
public final class FrescoInstrumenter {
    private static volatile Instrumenter sInstance;

    /* loaded from: classes4.dex */
    public interface Instrumenter {
        Runnable decorateRunnable(Runnable runnable, String str);

        boolean isTracing();

        void markFailure(Object obj, Throwable th);

        Object onBeforeSubmitWork(String str);

        Object onBeginWork(Object obj, String str);

        void onEndWork(Object obj);
    }

    public static void provide(Instrumenter instrumenter) {
        sInstance = instrumenter;
    }

    public static boolean isTracing() {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null) {
            return false;
        }
        return instrumenter.isTracing();
    }

    public static Object onBeforeSubmitWork(String str) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || str == null) {
            return null;
        }
        return instrumenter.onBeforeSubmitWork(str);
    }

    public static Object onBeginWork(Object obj, String str) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || obj == null) {
            return null;
        }
        return instrumenter.onBeginWork(obj, str);
    }

    public static void onEndWork(Object obj) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || obj == null) {
            return;
        }
        instrumenter.onEndWork(obj);
    }

    public static void markFailure(Object obj, Throwable th) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || obj == null) {
            return;
        }
        instrumenter.markFailure(obj, th);
    }

    public static Runnable decorateRunnable(Runnable runnable, String str) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || runnable == null) {
            return runnable;
        }
        if (str == null) {
            str = "";
        }
        return instrumenter.decorateRunnable(runnable, str);
    }
}
