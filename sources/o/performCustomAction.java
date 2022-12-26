package o;

import com.github.mikephil.charting.data.BarEntry;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public class performCustomAction extends performLoadChildren {
    public performCustomAction(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // o.performLoadChildren
    public void toString(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5 anonymousClass5) {
        float f;
        float abs;
        float abs2;
        float f2;
        float defaultImpl = anonymousClass5.setDefaultImpl();
        float f3 = this.ah$a;
        float f4 = this.invoke / 2.0f;
        for (int i = 0; i < defaultImpl * f3; i++) {
            BarEntry barEntry = (BarEntry) anonymousClass5.HaptikSDK$d(i);
            if (barEntry != null) {
                float HaptikWebView = barEntry.HaptikWebView();
                float ah$b = barEntry.ah$b();
                float[] HaptikSDK$b = barEntry.HaptikSDK$b();
                if (!this.HaptikSDK$c || HaptikSDK$b == null) {
                    if (this.HaptikWebView) {
                        f = ah$b >= 0.0f ? ah$b : 0.0f;
                        if (ah$b > 0.0f) {
                            ah$b = 0.0f;
                        }
                    } else {
                        float f5 = ah$b >= 0.0f ? ah$b : 0.0f;
                        if (ah$b > 0.0f) {
                            ah$b = 0.0f;
                        }
                        float f6 = ah$b;
                        ah$b = f5;
                        f = f6;
                    }
                    if (ah$b > 0.0f) {
                        ah$b *= this.HaptikSDK$b;
                    } else {
                        f *= this.HaptikSDK$b;
                    }
                    ah$a(f, HaptikWebView + f4, ah$b, HaptikWebView - f4);
                } else {
                    float f7 = -barEntry.valueOf();
                    int i2 = 0;
                    float f8 = 0.0f;
                    while (i2 < HaptikSDK$b.length) {
                        float f9 = HaptikSDK$b[i2];
                        if (f9 >= 0.0f) {
                            abs = f9 + f8;
                            abs2 = f7;
                            f7 = f8;
                            f8 = abs;
                        } else {
                            abs = Math.abs(f9) + f7;
                            abs2 = Math.abs(f9) + f7;
                        }
                        if (this.HaptikWebView) {
                            f2 = f7 >= abs ? f7 : abs;
                            if (f7 > abs) {
                                f7 = abs;
                            }
                        } else {
                            float f10 = f7 >= abs ? f7 : abs;
                            if (f7 > abs) {
                                f7 = abs;
                            }
                            float f11 = f10;
                            f2 = f7;
                            f7 = f11;
                        }
                        ah$a(f2 * this.HaptikSDK$b, HaptikWebView + f4, f7 * this.HaptikSDK$b, HaptikWebView - f4);
                        i2++;
                        f7 = abs2;
                    }
                }
            }
        }
        ag$a();
    }
}
