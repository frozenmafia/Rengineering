package o;

import java.util.Arrays;
import o.getGeneration;
/* loaded from: classes3.dex */
public final class postAndReply implements getGeneration {
    private int ag$a;
    private int ah$a;
    private final boolean ah$b;
    private int invoke;
    private SelfDestructiveThread[] toString;
    private final int valueOf;
    private final byte[] values;

    public postAndReply(boolean z, int i) {
        this(z, i, 0);
    }

    public postAndReply(boolean z, int i, int i2) {
        FingerprintManagerCompat.toString(i > 0);
        FingerprintManagerCompat.toString(i2 >= 0);
        this.ah$b = z;
        this.valueOf = i;
        this.ag$a = i2;
        this.toString = new SelfDestructiveThread[i2 + 100];
        if (i2 > 0) {
            this.values = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.toString[i3] = new SelfDestructiveThread(this.values, i3 * i);
            }
            return;
        }
        this.values = null;
    }

    public void HaptikSDK$c() {
        synchronized (this) {
            if (this.ah$b) {
                ah$a(0);
            }
        }
    }

    public void ah$a(int i) {
        synchronized (this) {
            boolean z = i < this.invoke;
            this.invoke = i;
            if (z) {
                ah$a();
            }
        }
    }

    @Override // o.getGeneration
    public SelfDestructiveThread values() {
        SelfDestructiveThread selfDestructiveThread;
        synchronized (this) {
            this.ah$a++;
            int i = this.ag$a;
            if (i > 0) {
                SelfDestructiveThread[] selfDestructiveThreadArr = this.toString;
                int i2 = i - 1;
                this.ag$a = i2;
                selfDestructiveThread = (SelfDestructiveThread) FingerprintManagerCompat.toString(selfDestructiveThreadArr[i2]);
                this.toString[this.ag$a] = null;
            } else {
                selfDestructiveThread = new SelfDestructiveThread(new byte[this.valueOf], 0);
                int i3 = this.ah$a;
                SelfDestructiveThread[] selfDestructiveThreadArr2 = this.toString;
                if (i3 > selfDestructiveThreadArr2.length) {
                    this.toString = (SelfDestructiveThread[]) Arrays.copyOf(selfDestructiveThreadArr2, selfDestructiveThreadArr2.length * 2);
                }
            }
        }
        return selfDestructiveThread;
    }

    @Override // o.getGeneration
    public void valueOf(SelfDestructiveThread selfDestructiveThread) {
        synchronized (this) {
            SelfDestructiveThread[] selfDestructiveThreadArr = this.toString;
            int i = this.ag$a;
            this.ag$a = i + 1;
            selfDestructiveThreadArr[i] = selfDestructiveThread;
            this.ah$a--;
            notifyAll();
        }
    }

    @Override // o.getGeneration
    public void toString(getGeneration.toString tostring) {
        synchronized (this) {
            while (tostring != null) {
                SelfDestructiveThread[] selfDestructiveThreadArr = this.toString;
                int i = this.ag$a;
                this.ag$a = i + 1;
                selfDestructiveThreadArr[i] = tostring.ag$a();
                this.ah$a--;
                tostring = tostring.valueOf();
            }
            notifyAll();
        }
    }

    @Override // o.getGeneration
    public void ah$a() {
        synchronized (this) {
            int i = 0;
            int max = Math.max(0, getElevationDegrees.valueOf(this.invoke, this.valueOf) - this.ah$a);
            int i2 = this.ag$a;
            if (max >= i2) {
                return;
            }
            if (this.values != null) {
                loop0: while (true) {
                    i2--;
                    while (i <= i2) {
                        SelfDestructiveThread selfDestructiveThread = (SelfDestructiveThread) FingerprintManagerCompat.toString(this.toString[i]);
                        if (selfDestructiveThread.ah$a != this.values) {
                            SelfDestructiveThread selfDestructiveThread2 = (SelfDestructiveThread) FingerprintManagerCompat.toString(this.toString[i2]);
                            if (selfDestructiveThread2.ah$a != this.values) {
                                break;
                            }
                            SelfDestructiveThread[] selfDestructiveThreadArr = this.toString;
                            selfDestructiveThreadArr[i] = selfDestructiveThread2;
                            selfDestructiveThreadArr[i2] = selfDestructiveThread;
                            i2--;
                        }
                        i++;
                    }
                }
                max = Math.max(max, i);
                if (max >= this.ag$a) {
                    return;
                }
            }
            Arrays.fill(this.toString, max, this.ag$a, (Object) null);
            this.ag$a = max;
        }
    }

    public int valueOf() {
        int i;
        int i2;
        synchronized (this) {
            i = this.ah$a;
            i2 = this.valueOf;
        }
        return i * i2;
    }

    @Override // o.getGeneration
    public int ag$a() {
        return this.valueOf;
    }
}
