package o;

import com.appsamurai.storyly.exoplayer2.decoder.DecoderException;
import com.appsamurai.storyly.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.C;
import java.util.ArrayDeque;
import o.SplashScreenViewProvider;
import o.SplashScreenViewProvider.ViewImpl31;
/* loaded from: classes3.dex */
public abstract class SplashScreenViewProvider$ViewImpl$_splashScreenView$2<I extends DecoderInputBuffer, O extends SplashScreenViewProvider.ViewImpl31, E extends DecoderException> implements SplashScreenViewProvider.ViewImpl<I, O, E> {
    private E HaptikSDK$b;
    private boolean HaptikSDK$c;
    private boolean HaptikSDK$e;
    private final I[] ag$a;
    private final O[] ah$a;
    private int getSignupData;
    private I invoke;
    private int toString;
    private final Thread valueOf;
    private int values;
    private final Object HaptikSDK$a = new Object();
    private final ArrayDeque<I> ah$b = new ArrayDeque<>();
    private final ArrayDeque<O> HaptikWebView = new ArrayDeque<>();

    protected abstract O ag$a();

    protected abstract E ah$a(I i, O o2, boolean z);

    protected abstract E ah$a(Throwable th);

    protected abstract I ah$a();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.SplashScreenViewProvider.ViewImpl
    public /* bridge */ /* synthetic */ void values(Object obj) throws DecoderException {
        values((SplashScreenViewProvider$ViewImpl$_splashScreenView$2<I, O, E>) ((DecoderInputBuffer) obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SplashScreenViewProvider$ViewImpl$_splashScreenView$2(I[] iArr, O[] oArr) {
        this.ag$a = iArr;
        this.toString = iArr.length;
        for (int i = 0; i < this.toString; i++) {
            this.ag$a[i] = ah$a();
        }
        this.ah$a = oArr;
        this.values = oArr.length;
        for (int i2 = 0; i2 < this.values; i2++) {
            this.ah$a[i2] = ag$a();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: o.SplashScreenViewProvider$ViewImpl$_splashScreenView$2.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SplashScreenViewProvider$ViewImpl$_splashScreenView$2.this.getInitSettings();
            }
        };
        this.valueOf = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ah$a(int i) {
        FingerprintManagerCompat.ah$a(this.toString == this.ag$a.length);
        for (I i2 : this.ag$a) {
            i2.toString(i);
        }
    }

    @Override // o.SplashScreenViewProvider.ViewImpl
    /* renamed from: HaptikSDK$c */
    public final I values() throws DecoderException {
        I i;
        synchronized (this.HaptikSDK$a) {
            getSignupData();
            FingerprintManagerCompat.ah$a(this.invoke == null);
            int i2 = this.toString;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.ag$a;
                int i3 = i2 - 1;
                this.toString = i3;
                i = iArr[i3];
            }
            this.invoke = i;
        }
        return i;
    }

    public final void values(I i) throws DecoderException {
        synchronized (this.HaptikSDK$a) {
            getSignupData();
            FingerprintManagerCompat.toString(i == this.invoke);
            this.ah$b.addLast(i);
            HaptikSDK$e();
            this.invoke = null;
        }
    }

    @Override // o.SplashScreenViewProvider.ViewImpl
    /* renamed from: HaptikSDK$a */
    public final O valueOf() throws DecoderException {
        synchronized (this.HaptikSDK$a) {
            getSignupData();
            if (this.HaptikWebView.isEmpty()) {
                return null;
            }
            return this.HaptikWebView.removeFirst();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(O o2) {
        synchronized (this.HaptikSDK$a) {
            valueOf((SplashScreenViewProvider$ViewImpl$_splashScreenView$2<I, O, E>) o2);
            HaptikSDK$e();
        }
    }

    @Override // o.SplashScreenViewProvider.ViewImpl
    public final void HaptikSDK$b() {
        synchronized (this.HaptikSDK$a) {
            this.HaptikSDK$c = true;
            this.getSignupData = 0;
            I i = this.invoke;
            if (i != null) {
                ag$a(i);
                this.invoke = null;
            }
            while (!this.ah$b.isEmpty()) {
                ag$a(this.ah$b.removeFirst());
            }
            while (!this.HaptikWebView.isEmpty()) {
                this.HaptikWebView.removeFirst().valueOf();
            }
        }
    }

    @Override // o.SplashScreenViewProvider.ViewImpl
    public void ah$b() {
        synchronized (this.HaptikSDK$a) {
            this.HaptikSDK$e = true;
            this.HaptikSDK$a.notify();
        }
        try {
            this.valueOf.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void getSignupData() throws DecoderException {
        E e = this.HaptikSDK$b;
        if (e != null) {
            throw e;
        }
    }

    private void HaptikSDK$e() {
        if (invoke()) {
            this.HaptikSDK$a.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getInitSettings() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (HaptikWebView());
    }

    private boolean HaptikWebView() throws InterruptedException {
        E ah$a;
        synchronized (this.HaptikSDK$a) {
            while (!this.HaptikSDK$e && !invoke()) {
                this.HaptikSDK$a.wait();
            }
            if (this.HaptikSDK$e) {
                return false;
            }
            I removeFirst = this.ah$b.removeFirst();
            O[] oArr = this.ah$a;
            int i = this.values - 1;
            this.values = i;
            O o2 = oArr[i];
            boolean z = this.HaptikSDK$c;
            this.HaptikSDK$c = false;
            if (removeFirst.invoke()) {
                o2.ah$a(4);
            } else {
                if (removeFirst.HaptikSDK$b()) {
                    o2.ah$a(Integer.MIN_VALUE);
                }
                if (removeFirst.HaptikSDK$c()) {
                    o2.ah$a(C.BUFFER_FLAG_FIRST_SAMPLE);
                }
                try {
                    ah$a = ah$a(removeFirst, o2, z);
                } catch (OutOfMemoryError e) {
                    ah$a = ah$a(e);
                } catch (RuntimeException e2) {
                    ah$a = ah$a(e2);
                }
                if (ah$a != null) {
                    synchronized (this.HaptikSDK$a) {
                        this.HaptikSDK$b = ah$a;
                    }
                    return false;
                }
            }
            synchronized (this.HaptikSDK$a) {
                if (this.HaptikSDK$c) {
                    o2.valueOf();
                } else if (o2.HaptikSDK$b()) {
                    this.getSignupData++;
                    o2.valueOf();
                } else {
                    o2.ah$a = this.getSignupData;
                    this.getSignupData = 0;
                    this.HaptikWebView.addLast(o2);
                }
                ag$a(removeFirst);
            }
            return true;
        }
    }

    private boolean invoke() {
        return !this.ah$b.isEmpty() && this.values > 0;
    }

    private void ag$a(I i) {
        i.values();
        I[] iArr = this.ag$a;
        int i2 = this.toString;
        this.toString = i2 + 1;
        iArr[i2] = i;
    }

    private void valueOf(O o2) {
        o2.values();
        O[] oArr = this.ah$a;
        int i = this.values;
        this.values = i + 1;
        oArr[i] = o2;
    }
}
