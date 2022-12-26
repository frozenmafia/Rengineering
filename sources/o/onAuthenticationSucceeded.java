package o;
/* loaded from: classes3.dex */
public class onAuthenticationSucceeded {
    private boolean ag$a;
    private final hasEnrolledFingerprints toString;

    public onAuthenticationSucceeded() {
        this(hasEnrolledFingerprints.ah$a);
    }

    public onAuthenticationSucceeded(hasEnrolledFingerprints hasenrolledfingerprints) {
        this.toString = hasenrolledfingerprints;
    }

    public boolean HaptikSDK$a() {
        synchronized (this) {
            if (this.ag$a) {
                return false;
            }
            this.ag$a = true;
            notifyAll();
            return true;
        }
    }

    public boolean ah$a() {
        boolean z;
        synchronized (this) {
            z = this.ag$a;
            this.ag$a = false;
        }
        return z;
    }

    public void ag$a() throws InterruptedException {
        synchronized (this) {
            while (!this.ag$a) {
                wait();
            }
        }
    }

    public void valueOf() {
        synchronized (this) {
            boolean z = false;
            while (!this.ag$a) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean values() {
        boolean z;
        synchronized (this) {
            z = this.ag$a;
        }
        return z;
    }
}
