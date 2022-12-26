package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class pageLeft {
    private static final int ah$a = Runtime.getRuntime().availableProcessors();

    public static final String toString(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
