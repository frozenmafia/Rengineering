package o;

import android.graphics.Bitmap;
import android.text.Layout;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes3.dex */
public final class isCompatTintEnabled$ah$a {
    private float HaptikSDK$a;
    private float HaptikSDK$b;
    private float HaptikSDK$c;
    private int HaptikSDK$d;
    private int HaptikSDK$e;
    private float HaptikWebView;
    private int ag$a;
    private float ah$a;
    private int ah$b;
    private int aj$a;
    private CharSequence getInitSettings;
    private Layout.Alignment getSignupData;
    private Layout.Alignment invoke;
    private boolean onXdkEvent;
    private int toString;
    private float valueOf;
    private Bitmap values;

    public isCompatTintEnabled$ah$a() {
        this.getInitSettings = null;
        this.values = null;
        this.getSignupData = null;
        this.invoke = null;
        this.valueOf = -3.4028235E38f;
        this.ag$a = Integer.MIN_VALUE;
        this.toString = Integer.MIN_VALUE;
        this.HaptikSDK$b = -3.4028235E38f;
        this.ah$b = Integer.MIN_VALUE;
        this.HaptikSDK$e = Integer.MIN_VALUE;
        this.HaptikWebView = -3.4028235E38f;
        this.HaptikSDK$c = -3.4028235E38f;
        this.ah$a = -3.4028235E38f;
        this.onXdkEvent = false;
        this.aj$a = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.HaptikSDK$d = Integer.MIN_VALUE;
    }

    private isCompatTintEnabled$ah$a(isCompatTintEnabled iscompattintenabled) {
        this.getInitSettings = iscompattintenabled.HaptikSDK$d;
        this.values = iscompattintenabled.ag$a;
        this.getSignupData = iscompattintenabled.HaptikSDK$e;
        this.invoke = iscompattintenabled.ah$b;
        this.valueOf = iscompattintenabled.valueOf;
        this.ag$a = iscompattintenabled.HaptikSDK$b;
        this.toString = iscompattintenabled.HaptikSDK$a;
        this.HaptikSDK$b = iscompattintenabled.HaptikSDK$c;
        this.ah$b = iscompattintenabled.invoke;
        this.HaptikSDK$e = iscompattintenabled.a;
        this.HaptikWebView = iscompattintenabled.getInitSettings;
        this.HaptikSDK$c = iscompattintenabled.HaptikWebView;
        this.ah$a = iscompattintenabled.toString;
        this.onXdkEvent = iscompattintenabled.isLogoutPending;
        this.aj$a = iscompattintenabled.aj$a;
        this.HaptikSDK$d = iscompattintenabled.onXdkEvent;
        this.HaptikSDK$a = iscompattintenabled.getSignupData;
    }

    public isCompatTintEnabled$ah$a ah$a(CharSequence charSequence) {
        this.getInitSettings = charSequence;
        return this;
    }

    @Pure
    public CharSequence ah$b() {
        return this.getInitSettings;
    }

    public isCompatTintEnabled$ah$a values(Bitmap bitmap) {
        this.values = bitmap;
        return this;
    }

    public isCompatTintEnabled$ah$a toString(Layout.Alignment alignment) {
        this.getSignupData = alignment;
        return this;
    }

    public isCompatTintEnabled$ah$a values(Layout.Alignment alignment) {
        this.invoke = alignment;
        return this;
    }

    public isCompatTintEnabled$ah$a toString(float f, int i) {
        this.valueOf = f;
        this.ag$a = i;
        return this;
    }

    public isCompatTintEnabled$ah$a valueOf(int i) {
        this.toString = i;
        return this;
    }

    @Pure
    public int valueOf() {
        return this.toString;
    }

    public isCompatTintEnabled$ah$a toString(float f) {
        this.HaptikSDK$b = f;
        return this;
    }

    public isCompatTintEnabled$ah$a toString(int i) {
        this.ah$b = i;
        return this;
    }

    @Pure
    public int ag$a() {
        return this.ah$b;
    }

    public isCompatTintEnabled$ah$a values(float f, int i) {
        this.HaptikWebView = f;
        this.HaptikSDK$e = i;
        return this;
    }

    public isCompatTintEnabled$ah$a ag$a(float f) {
        this.HaptikSDK$c = f;
        return this;
    }

    public isCompatTintEnabled$ah$a ah$a(float f) {
        this.ah$a = f;
        return this;
    }

    public isCompatTintEnabled$ah$a ah$a(int i) {
        this.aj$a = i;
        this.onXdkEvent = true;
        return this;
    }

    public isCompatTintEnabled$ah$a ah$a() {
        this.onXdkEvent = false;
        return this;
    }

    public isCompatTintEnabled$ah$a values(int i) {
        this.HaptikSDK$d = i;
        return this;
    }

    public isCompatTintEnabled$ah$a values(float f) {
        this.HaptikSDK$a = f;
        return this;
    }

    public isCompatTintEnabled values() {
        return new isCompatTintEnabled(this.getInitSettings, this.getSignupData, this.invoke, this.values, this.valueOf, this.ag$a, this.toString, this.HaptikSDK$b, this.ah$b, this.HaptikSDK$e, this.HaptikWebView, this.HaptikSDK$c, this.ah$a, this.onXdkEvent, this.aj$a, this.HaptikSDK$d, this.HaptikSDK$a);
    }
}
