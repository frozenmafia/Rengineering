package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.FingerprintManagerCompat;
/* loaded from: classes3.dex */
public final class getCipher<T> {
    private final ArrayDeque<Runnable> HaptikSDK$c;
    private final toString<T> ag$a;
    private final hasEnrolledFingerprints ah$a;
    private boolean invoke;
    private final FingerprintManagerCompat.CryptoObject toString;
    private final ArrayDeque<Runnable> valueOf;
    private final CopyOnWriteArraySet<getCipher$ah$a<T>> values;

    /* loaded from: classes3.dex */
    public interface toString<T> {
        void valueOf(T t, onAuthenticationError onauthenticationerror);
    }

    public getCipher(Looper looper, hasEnrolledFingerprints hasenrolledfingerprints, toString<T> tostring) {
        this(new CopyOnWriteArraySet(), looper, hasenrolledfingerprints, tostring);
    }

    private getCipher(CopyOnWriteArraySet<getCipher$ah$a<T>> copyOnWriteArraySet, Looper looper, hasEnrolledFingerprints hasenrolledfingerprints, toString<T> tostring) {
        this.ah$a = hasenrolledfingerprints;
        this.values = copyOnWriteArraySet;
        this.ag$a = tostring;
        this.valueOf = new ArrayDeque<>();
        this.HaptikSDK$c = new ArrayDeque<>();
        this.toString = hasenrolledfingerprints.values(looper, new Handler.Callback() { // from class: o.FingerprintManagerCompat.AuthenticationResult
            {
                getCipher.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean getcipher;
                getcipher = getCipher.this.toString(message);
                return getcipher;
            }
        });
    }

    public getCipher<T> values(Looper looper, toString<T> tostring) {
        return toString(looper, this.ah$a, tostring);
    }

    public getCipher<T> toString(Looper looper, hasEnrolledFingerprints hasenrolledfingerprints, toString<T> tostring) {
        return new getCipher<>(this.values, looper, hasenrolledfingerprints, tostring);
    }

    public void ag$a(T t) {
        if (this.invoke) {
            return;
        }
        FingerprintManagerCompat.toString(t);
        this.values.add(new getCipher$ah$a<>(t));
    }

    public void toString(final int i, final getCipher$ag$a<T> getcipher_ag_a) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.values);
        this.HaptikSDK$c.add(new Runnable() { // from class: o.getMac
            @Override // java.lang.Runnable
            public final void run() {
                getCipher.ah$a(copyOnWriteArraySet, i, getcipher_ag_a);
            }
        });
    }

    public static /* synthetic */ void ah$a(CopyOnWriteArraySet copyOnWriteArraySet, int i, getCipher$ag$a getcipher_ag_a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((getCipher$ah$a) it.next()).toString(i, getcipher_ag_a);
        }
    }

    public void valueOf() {
        if (this.HaptikSDK$c.isEmpty()) {
            return;
        }
        if (!this.toString.values(0)) {
            FingerprintManagerCompat.CryptoObject cryptoObject = this.toString;
            cryptoObject.values(cryptoObject.ah$a(0));
        }
        boolean isEmpty = this.valueOf.isEmpty();
        this.valueOf.addAll(this.HaptikSDK$c);
        this.HaptikSDK$c.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.valueOf.isEmpty()) {
            this.valueOf.peekFirst().run();
            this.valueOf.removeFirst();
        }
    }

    public void ag$a(int i, getCipher$ag$a<T> getcipher_ag_a) {
        toString(i, getcipher_ag_a);
        valueOf();
    }

    public void values() {
        Iterator<getCipher$ah$a<T>> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().ah$a(this.ag$a);
        }
        this.values.clear();
        this.invoke = true;
    }

    public boolean toString(Message message) {
        Iterator<getCipher$ah$a<T>> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().values(this.ag$a);
            if (this.toString.values(0)) {
                return true;
            }
        }
        return true;
    }
}
