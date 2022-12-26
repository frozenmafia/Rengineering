package o;

import java.util.concurrent.Executor;
import o.EditTextPreferenceDialogFragmentCompat;
/* loaded from: classes7.dex */
class updateEntries implements Executor {
    private final Executor valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public updateEntries(Executor executor) {
        this.valueOf = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.valueOf.execute(new valueOf(runnable));
    }

    /* loaded from: classes7.dex */
    static class valueOf implements Runnable {
        private final Runnable valueOf;

        valueOf(Runnable runnable) {
            this.valueOf = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.valueOf.run();
            } catch (Exception e) {
                EditTextPreferenceDialogFragmentCompat.AnonymousClass1.ag$a("Executor", "Background execution failure.", e);
            }
        }
    }
}
