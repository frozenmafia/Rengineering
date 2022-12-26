package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class WindowStrictModeException$ah$a extends Thread {
    private WindowStrictModeException$ah$a() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                java.lang.ref.Reference<? extends Object> remove = WindowStrictModeException.ag$a.remove();
                if (remove instanceof WindowStrictModeException$ag$a) {
                    ((WindowStrictModeException$ag$a) remove).valueOf();
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
