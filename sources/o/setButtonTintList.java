package o;

import java.util.concurrent.Callable;
import o.InputContentInfoCompat;
/* loaded from: classes4.dex */
public class setButtonTintList {
    private CompoundButtonCompat ah$a;
    private getCheckMarkTintMode toString;
    private startAnimating valueOf;

    public setButtonTintList(CompoundButtonCompat compoundButtonCompat, startAnimating startanimating, getCheckMarkTintMode getcheckmarktintmode) {
        this.valueOf = startanimating;
        this.toString = getcheckmarktintmode;
        this.ah$a = compoundButtonCompat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class values implements Runnable {
        private Runnable valueOf;
        private String values;

        public values(String str, Runnable runnable) {
            this.values = str;
            this.valueOf = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (setButtonTintList.this.toString != null) {
                try {
                    setButtonTintList.this.toString.valueOf(new Callable<Void>() { // from class: o.setButtonTintList.values.1
                        @Override // java.util.concurrent.Callable
                        /* renamed from: ag$a */
                        public Void call() throws Exception {
                            values.this.valueOf.run();
                            return null;
                        }
                    }, this.values);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public InputContentInfoCompat.InputContentInfoCompatImpl values(Runnable runnable, int i, String str) {
        return ah$a(new values(str, runnable), i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class valueOf implements Runnable {
        private String valueOf;
        private Runnable values;
        private InputContentInfoCompat.InputContentInfoCompatImpl ah$a = null;
        private boolean ag$a = false;

        public valueOf(String str, Runnable runnable) {
            this.valueOf = str;
            this.values = runnable;
        }

        public void ah$a(InputContentInfoCompat.InputContentInfoCompatImpl inputContentInfoCompatImpl) {
            this.ah$a = inputContentInfoCompatImpl;
        }

        public boolean valueOf() {
            return this.ag$a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (setButtonTintList.this.toString != null) {
                try {
                    setButtonTintList.this.toString.valueOf(new Callable<Void>() { // from class: o.setButtonTintList.valueOf.2
                        @Override // java.util.concurrent.Callable
                        /* renamed from: values */
                        public Void call() throws Exception {
                            if (valueOf.this.ah$a != null) {
                                valueOf.this.ah$a.values();
                                valueOf.this.ah$a = null;
                            }
                            valueOf.this.values.run();
                            valueOf.this.ag$a = true;
                            return null;
                        }
                    }, this.valueOf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public InputContentInfoCompat.InputContentInfoCompatImpl valueOf(Runnable runnable, int i, String str) {
        valueOf valueof = new valueOf(str, runnable);
        InputContentInfoCompat.InputContentInfoCompatImpl ah$a = ah$a(valueof, i, str);
        valueof.ah$a(ah$a);
        if (!valueof.valueOf() || ah$a == null) {
            return ah$a;
        }
        ah$a.values();
        return null;
    }

    public InputContentInfoCompat.InputContentInfoCompatImpl ah$a(Runnable runnable, int i, String str) {
        this.ah$a.values("createTimer(): calling TimerInterface.createTimer");
        return this.valueOf.values(runnable, i, str);
    }
}
