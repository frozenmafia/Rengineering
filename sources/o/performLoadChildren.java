package o;

import com.github.mikephil.charting.data.BarEntry;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public class performLoadChildren extends onUnsubscribe<MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5> {
    protected int HaptikSDK$a;
    protected boolean HaptikSDK$c;
    protected boolean HaptikWebView;
    protected int ah$b;
    protected float invoke;

    public performLoadChildren(int i, int i2, boolean z) {
        super(i);
        this.ah$b = 0;
        this.HaptikSDK$a = 1;
        this.HaptikSDK$c = false;
        this.HaptikWebView = false;
        this.invoke = 1.0f;
        this.HaptikSDK$a = i2;
        this.HaptikSDK$c = z;
    }

    public void toString(float f) {
        this.invoke = f;
    }

    public void valueOf(int i) {
        this.ah$b = i;
    }

    public void toString(boolean z) {
        this.HaptikWebView = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ah$a(float f, float f2, float f3, float f4) {
        float[] fArr = this.ag$a;
        int i = this.values;
        this.values = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.ag$a;
        int i2 = this.values;
        this.values = i2 + 1;
        fArr2[i2] = f2;
        float[] fArr3 = this.ag$a;
        int i3 = this.values;
        this.values = i3 + 1;
        fArr3[i3] = f3;
        float[] fArr4 = this.ag$a;
        int i4 = this.values;
        this.values = i4 + 1;
        fArr4[i4] = f4;
    }

    public void toString(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5 anonymousClass5) {
        float f;
        float f2;
        float abs;
        float abs2;
        float f3;
        float defaultImpl = anonymousClass5.setDefaultImpl();
        float f4 = this.ah$a;
        float f5 = this.invoke / 2.0f;
        for (int i = 0; i < defaultImpl * f4; i++) {
            BarEntry barEntry = (BarEntry) anonymousClass5.HaptikSDK$d(i);
            if (barEntry != null) {
                float HaptikWebView = barEntry.HaptikWebView();
                float ah$b = barEntry.ah$b();
                float[] HaptikSDK$b = barEntry.HaptikSDK$b();
                float f6 = 0.0f;
                if (!this.HaptikSDK$c || HaptikSDK$b == null) {
                    if (this.HaptikWebView) {
                        f = 0.0f;
                        f2 = ah$b >= 0.0f ? ah$b : 0.0f;
                        if (ah$b > 0.0f) {
                            ah$b = 0.0f;
                        }
                    } else {
                        f = 0.0f;
                        float f7 = ah$b >= 0.0f ? ah$b : 0.0f;
                        if (ah$b > 0.0f) {
                            ah$b = 0.0f;
                        }
                        float f8 = ah$b;
                        ah$b = f7;
                        f2 = f8;
                    }
                    if (ah$b > f) {
                        ah$b *= this.HaptikSDK$b;
                    } else {
                        f2 *= this.HaptikSDK$b;
                    }
                    ah$a(HaptikWebView - f5, ah$b, HaptikWebView + f5, f2);
                } else {
                    float f9 = -barEntry.valueOf();
                    int i2 = 0;
                    float f10 = 0.0f;
                    while (i2 < HaptikSDK$b.length) {
                        float f11 = HaptikSDK$b[i2];
                        int i3 = (f11 > f6 ? 1 : (f11 == f6 ? 0 : -1));
                        if (i3 == 0 && (f10 == f6 || f9 == f6)) {
                            abs = f11;
                            abs2 = f9;
                            f9 = abs;
                        } else if (i3 >= 0) {
                            abs = f11 + f10;
                            abs2 = f9;
                            f9 = f10;
                            f10 = abs;
                        } else {
                            abs = Math.abs(f11) + f9;
                            abs2 = Math.abs(f11) + f9;
                        }
                        if (this.HaptikWebView) {
                            f3 = f9 >= abs ? f9 : abs;
                            if (f9 > abs) {
                                f9 = abs;
                            }
                        } else {
                            float f12 = f9 >= abs ? f9 : abs;
                            if (f9 > abs) {
                                f9 = abs;
                            }
                            float f13 = f12;
                            f3 = f9;
                            f9 = f13;
                        }
                        ah$a(HaptikWebView - f5, f9 * this.HaptikSDK$b, HaptikWebView + f5, f3 * this.HaptikSDK$b);
                        i2++;
                        f9 = abs2;
                        f6 = 0.0f;
                    }
                }
            }
        }
        ag$a();
    }
}
