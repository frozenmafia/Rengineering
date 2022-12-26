package o;

import android.util.Log;
/* loaded from: classes5.dex */
class stopIgnoring {
    private static stopIgnoring toString;

    public static stopIgnoring values() {
        stopIgnoring stopignoring;
        synchronized (stopIgnoring.class) {
            if (toString == null) {
                toString = new stopIgnoring();
            }
            stopignoring = toString;
        }
        return stopignoring;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(String str) {
        Log.w("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(String str) {
        Log.e("FirebasePerformance", str);
    }

    private stopIgnoring() {
    }
}
