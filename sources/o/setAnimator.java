package o;

import com.facebook.cache.common.CacheEventListener;
import java.io.IOException;
/* loaded from: classes4.dex */
public class setAnimator implements performStop {
    private static setAnimator ag$a;
    private static final Object toString = new Object();
    private static int values;
    private long HaptikSDK$a;
    private long HaptikSDK$b;
    private CacheEventListener.EvictionReason HaptikSDK$c;
    private String HaptikSDK$e;
    private requireActivity ah$a;
    private IOException ah$b;
    private setAnimator invoke;
    private long valueOf;

    public static setAnimator ah$a() {
        synchronized (toString) {
            setAnimator setanimator = ag$a;
            if (setanimator != null) {
                ag$a = setanimator.invoke;
                setanimator.invoke = null;
                values--;
                return setanimator;
            }
            return new setAnimator();
        }
    }

    private setAnimator() {
    }

    public setAnimator ah$a(requireActivity requireactivity) {
        this.ah$a = requireactivity;
        return this;
    }

    public setAnimator values(String str) {
        this.HaptikSDK$e = str;
        return this;
    }

    public setAnimator valueOf(long j) {
        this.HaptikSDK$b = j;
        return this;
    }

    public setAnimator toString(long j) {
        this.HaptikSDK$a = j;
        return this;
    }

    public setAnimator ag$a(long j) {
        this.valueOf = j;
        return this;
    }

    public setAnimator values(IOException iOException) {
        this.ah$b = iOException;
        return this;
    }

    public setAnimator valueOf(CacheEventListener.EvictionReason evictionReason) {
        this.HaptikSDK$c = evictionReason;
        return this;
    }

    public void valueOf() {
        synchronized (toString) {
            if (values < 5) {
                ag$a();
                values++;
                setAnimator setanimator = ag$a;
                if (setanimator != null) {
                    this.invoke = setanimator;
                }
                ag$a = this;
            }
        }
    }

    private void ag$a() {
        this.ah$a = null;
        this.HaptikSDK$e = null;
        this.HaptikSDK$b = 0L;
        this.valueOf = 0L;
        this.HaptikSDK$a = 0L;
        this.ah$b = null;
        this.HaptikSDK$c = null;
    }
}
