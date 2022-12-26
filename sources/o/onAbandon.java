package o;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes6.dex */
public final class onAbandon {
    private final onAbandon HaptikSDK$a;
    private final int HaptikSDK$b;
    private int HaptikSDK$c;
    private String[] HaptikSDK$d;
    private final AtomicReference<onAbandon$ag$a> HaptikWebView;
    private int ag$a;
    private boolean ah$a;
    private int ah$b;
    private int invoke;
    private valueOf[] toString;
    private boolean valueOf;
    private final int values;

    /* loaded from: classes6.dex */
    public static final class valueOf {
    }

    private static int values(int i) {
        return i - (i >> 2);
    }

    private onAbandon(int i) {
        this.HaptikSDK$a = null;
        this.HaptikSDK$b = i;
        this.ah$a = true;
        this.values = -1;
        this.valueOf = false;
        this.invoke = 0;
        this.HaptikWebView = new AtomicReference<>(onAbandon$ag$a.ah$a(64));
    }

    private onAbandon(onAbandon onabandon, int i, int i2, onAbandon$ag$a onabandon_ag_a) {
        this.HaptikSDK$a = onabandon;
        this.HaptikSDK$b = i2;
        this.HaptikWebView = null;
        this.values = i;
        this.ah$a = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        this.HaptikSDK$d = onabandon_ag_a.ag$a;
        this.toString = onabandon_ag_a.valueOf;
        this.ah$b = onabandon_ag_a.toString;
        this.invoke = onabandon_ag_a.values;
        int length = this.HaptikSDK$d.length;
        this.HaptikSDK$c = values(length);
        this.ag$a = length - 1;
        this.valueOf = true;
    }

    public static onAbandon values() {
        long currentTimeMillis = System.currentTimeMillis();
        return ag$a((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static onAbandon ag$a(int i) {
        return new onAbandon(i);
    }

    public onAbandon toString(int i) {
        return new onAbandon(this, i, this.HaptikSDK$b, this.HaptikWebView.get());
    }

    public void ah$a() {
        onAbandon onabandon;
        if (ag$a() && (onabandon = this.HaptikSDK$a) != null && this.ah$a) {
            onabandon.ag$a(new onAbandon$ag$a(this));
            this.valueOf = true;
        }
    }

    private void ag$a(onAbandon$ag$a onabandon_ag_a) {
        int i = onabandon_ag_a.toString;
        onAbandon$ag$a onabandon_ag_a2 = this.HaptikWebView.get();
        if (i == onabandon_ag_a2.toString) {
            return;
        }
        if (i > 12000) {
            onabandon_ag_a = onAbandon$ag$a.ah$a(64);
        }
        this.HaptikWebView.compareAndSet(onabandon_ag_a2, onabandon_ag_a);
    }

    public boolean ag$a() {
        return !this.valueOf;
    }

    public int valueOf() {
        return this.HaptikSDK$b;
    }
}
