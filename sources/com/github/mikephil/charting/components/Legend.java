package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
import o.getServiceComponentByAction;
import o.performSearch;
import o.setCancelButtonIntent;
/* loaded from: classes4.dex */
public class Legend extends performSearch {
    private MediaBrowserServiceCompat.AnonymousClass1[] getSignupData;
    private MediaBrowserServiceCompat.AnonymousClass1[] invoke = new MediaBrowserServiceCompat.AnonymousClass1[0];
    private boolean ak = false;
    private LegendHorizontalAlignment aj$a = LegendHorizontalAlignment.LEFT;
    private LegendVerticalAlignment ICustomTabsCallback = LegendVerticalAlignment.BOTTOM;
    private LegendOrientation onXdkEvent = LegendOrientation.HORIZONTAL;
    private boolean HaptikSDK$b = false;
    private LegendDirection HaptikSDK$c = LegendDirection.LEFT_TO_RIGHT;
    private LegendForm a = LegendForm.SQUARE;
    private float HaptikSDK$e = 8.0f;
    private float HaptikSDK$d = 3.0f;
    private DashPathEffect getInitSettings = null;
    private float onMessageChannelReady = 6.0f;
    private float getDefaultImpl = 0.0f;
    private float HaptikWebView = 5.0f;
    private float ak$b = 3.0f;
    private float isLogoutPending = 0.95f;
    public float ah$a = 0.0f;
    public float valueOf = 0.0f;
    public float ag$a = 0.0f;
    public float toString = 0.0f;
    private boolean onNavigationEvent = false;
    private List<setCancelButtonIntent> ah$b = new ArrayList(16);
    private List<Boolean> values = new ArrayList(16);
    private List<setCancelButtonIntent> HaptikSDK$a = new ArrayList(16);

    /* loaded from: classes4.dex */
    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    /* loaded from: classes4.dex */
    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    /* loaded from: classes4.dex */
    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    /* loaded from: classes4.dex */
    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    /* loaded from: classes4.dex */
    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.ak$a = getServiceComponentByAction.valueOf(10.0f);
        this.onRelationshipValidationResult = getServiceComponentByAction.valueOf(5.0f);
        this.ICustomTabsCallback$Default = getServiceComponentByAction.valueOf(3.0f);
    }

    public void values(List<MediaBrowserServiceCompat.AnonymousClass1> list) {
        this.invoke = (MediaBrowserServiceCompat.AnonymousClass1[]) list.toArray(new MediaBrowserServiceCompat.AnonymousClass1[list.size()]);
    }

    public MediaBrowserServiceCompat.AnonymousClass1[] HaptikSDK$c() {
        return this.invoke;
    }

    public float values(Paint paint) {
        MediaBrowserServiceCompat.AnonymousClass1[] anonymousClass1Arr;
        float valueOf = getServiceComponentByAction.valueOf(this.HaptikWebView);
        float f = 0.0f;
        float f2 = 0.0f;
        for (MediaBrowserServiceCompat.AnonymousClass1 anonymousClass1 : this.invoke) {
            float valueOf2 = getServiceComponentByAction.valueOf(Float.isNaN(anonymousClass1.ah$a) ? this.HaptikSDK$e : anonymousClass1.ah$a);
            if (valueOf2 > f2) {
                f2 = valueOf2;
            }
            String str = anonymousClass1.HaptikSDK$b;
            if (str != null) {
                float ag$a = getServiceComponentByAction.ag$a(paint, str);
                if (ag$a > f) {
                    f = ag$a;
                }
            }
        }
        return f + f2 + valueOf;
    }

    public float toString(Paint paint) {
        float f = 0.0f;
        for (MediaBrowserServiceCompat.AnonymousClass1 anonymousClass1 : this.invoke) {
            String str = anonymousClass1.HaptikSDK$b;
            if (str != null) {
                float ah$a = getServiceComponentByAction.ah$a(paint, str);
                if (ah$a > f) {
                    f = ah$a;
                }
            }
        }
        return f;
    }

    public MediaBrowserServiceCompat.AnonymousClass1[] HaptikSDK$a() {
        return this.getSignupData;
    }

    public void ag$a(MediaBrowserServiceCompat.AnonymousClass1[] anonymousClass1Arr) {
        this.invoke = anonymousClass1Arr;
        this.ak = true;
    }

    public boolean ak$a() {
        return this.ak;
    }

    public LegendHorizontalAlignment getInitSettings() {
        return this.aj$a;
    }

    public void ag$a(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.aj$a = legendHorizontalAlignment;
    }

    public LegendVerticalAlignment isLogoutPending() {
        return this.ICustomTabsCallback;
    }

    public void valueOf(LegendVerticalAlignment legendVerticalAlignment) {
        this.ICustomTabsCallback = legendVerticalAlignment;
    }

    public LegendOrientation HaptikSDK$d() {
        return this.onXdkEvent;
    }

    public void ag$a(LegendOrientation legendOrientation) {
        this.onXdkEvent = legendOrientation;
    }

    public boolean a() {
        return this.HaptikSDK$b;
    }

    public void ah$a(boolean z) {
        this.HaptikSDK$b = z;
    }

    public LegendDirection ag$a() {
        return this.HaptikSDK$c;
    }

    public void valueOf(LegendDirection legendDirection) {
        this.HaptikSDK$c = legendDirection;
    }

    public LegendForm ah$b() {
        return this.a;
    }

    public void toString(LegendForm legendForm) {
        this.a = legendForm;
    }

    public void ah$a(float f) {
        this.HaptikSDK$e = f;
    }

    public float getSignupData() {
        return this.HaptikSDK$e;
    }

    public float HaptikSDK$b() {
        return this.HaptikSDK$d;
    }

    public DashPathEffect invoke() {
        return this.getInitSettings;
    }

    public float aj$a() {
        return this.onMessageChannelReady;
    }

    public void values(float f) {
        this.onMessageChannelReady = f;
    }

    public float onXdkEvent() {
        return this.getDefaultImpl;
    }

    public void ag$a(float f) {
        this.getDefaultImpl = f;
    }

    public float HaptikWebView() {
        return this.HaptikWebView;
    }

    public void valueOf(float f) {
        this.HaptikWebView = f;
    }

    public float ak() {
        return this.ak$b;
    }

    public void toString(boolean z) {
        this.onNavigationEvent = z;
    }

    public float HaptikSDK$e() {
        return this.isLogoutPending;
    }

    public void toString(float f) {
        this.isLogoutPending = f;
    }

    public List<setCancelButtonIntent> ah$a() {
        return this.ah$b;
    }

    public List<Boolean> values() {
        return this.values;
    }

    public List<setCancelButtonIntent> valueOf() {
        return this.HaptikSDK$a;
    }

    public void ag$a(Paint paint, MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback) {
        float values;
        float values2;
        float ah$a;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float valueOf = getServiceComponentByAction.valueOf(this.HaptikSDK$e);
        float valueOf2 = getServiceComponentByAction.valueOf(this.ak$b);
        float valueOf3 = getServiceComponentByAction.valueOf(this.HaptikWebView);
        float valueOf4 = getServiceComponentByAction.valueOf(this.onMessageChannelReady);
        float valueOf5 = getServiceComponentByAction.valueOf(this.getDefaultImpl);
        boolean z = this.onNavigationEvent;
        MediaBrowserServiceCompat.AnonymousClass1[] anonymousClass1Arr = this.invoke;
        int length = anonymousClass1Arr.length;
        this.toString = values(paint);
        this.ag$a = toString(paint);
        int i = AnonymousClass2.toString[this.onXdkEvent.ordinal()];
        if (i == 1) {
            values = getServiceComponentByAction.values(paint, getServiceComponentByAction.HaptikSDK$b);
            float f6 = 0.0f;
            float f7 = 0.0f;
            boolean z2 = false;
            float f8 = 0.0f;
            for (int i2 = 0; i2 < length; i2++) {
                MediaBrowserServiceCompat.AnonymousClass1 anonymousClass1 = anonymousClass1Arr[i2];
                boolean z3 = anonymousClass1.ag$a != LegendForm.NONE;
                float valueOf6 = Float.isNaN(anonymousClass1.ah$a) ? valueOf : getServiceComponentByAction.valueOf(anonymousClass1.ah$a);
                String str = anonymousClass1.HaptikSDK$b;
                if (!z2) {
                    f7 = 0.0f;
                }
                if (z3) {
                    if (z2) {
                        f7 += valueOf2;
                    }
                    f7 += valueOf6;
                }
                if (str != null) {
                    if (z3 && !z2) {
                        f7 += valueOf3;
                    } else if (z2) {
                        f6 += values + valueOf5;
                        f8 = Math.max(f8, f7);
                        f7 = 0.0f;
                        z2 = false;
                    }
                    float ag$a = getServiceComponentByAction.ag$a(paint, str);
                    if (i2 < length - 1) {
                        f6 += values + valueOf5;
                    }
                    f7 += ag$a;
                } else {
                    f7 += valueOf6;
                    if (i2 < length - 1) {
                        f7 += valueOf2;
                    }
                    z2 = true;
                }
                f8 = Math.max(f8, f7);
            }
            this.ah$a = f8;
            this.valueOf = f6;
        } else if (i == 2) {
            values2 = getServiceComponentByAction.values(paint, getServiceComponentByAction.HaptikSDK$b);
            ah$a = getServiceComponentByAction.ah$a(paint, getServiceComponentByAction.HaptikSDK$b);
            float HaptikSDK$d = mediaButtonConnectionCallback.HaptikSDK$d();
            float f9 = this.isLogoutPending;
            this.values.clear();
            this.ah$b.clear();
            this.HaptikSDK$a.clear();
            int i3 = 0;
            float f10 = 0.0f;
            float f11 = 0.0f;
            int i4 = -1;
            float f12 = 0.0f;
            while (i3 < length) {
                MediaBrowserServiceCompat.AnonymousClass1 anonymousClass12 = anonymousClass1Arr[i3];
                float f13 = valueOf;
                float f14 = valueOf4;
                boolean z4 = anonymousClass12.ag$a != LegendForm.NONE;
                float valueOf7 = Float.isNaN(anonymousClass12.ah$a) ? f13 : getServiceComponentByAction.valueOf(anonymousClass12.ah$a);
                String str2 = anonymousClass12.HaptikSDK$b;
                MediaBrowserServiceCompat.AnonymousClass1[] anonymousClass1Arr2 = anonymousClass1Arr;
                float f15 = valueOf5;
                this.values.add(false);
                int i5 = i4;
                float f16 = i5 == -1 ? 0.0f : f10 + valueOf2;
                if (str2 != null) {
                    f = valueOf2;
                    f2 = ah$a;
                    this.ah$b.add(getServiceComponentByAction.valueOf(paint, str2));
                    f3 = f16 + (z4 ? valueOf3 + valueOf7 : 0.0f) + this.ah$b.get(i3).valueOf;
                } else {
                    f = valueOf2;
                    f2 = ah$a;
                    float f17 = valueOf7;
                    this.ah$b.add(setCancelButtonIntent.ah$a(0.0f, 0.0f));
                    f3 = f16 + (z4 ? f17 : 0.0f);
                    if (i5 == -1) {
                        i5 = i3;
                    }
                }
                if (str2 != null || i3 == length - 1) {
                    float f18 = f12;
                    int i6 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
                    float f19 = i6 == 0 ? 0.0f : f14;
                    if (!z || i6 == 0 || (HaptikSDK$d * f9) - f18 >= f19 + f3) {
                        f4 = f11;
                        f5 = f18 + f19 + f3;
                    } else {
                        this.HaptikSDK$a.add(setCancelButtonIntent.ah$a(f18, values2));
                        float max = Math.max(f11, f18);
                        this.values.set(i5 > -1 ? i5 : i3, true);
                        f5 = f3;
                        f4 = max;
                    }
                    if (i3 == length - 1) {
                        this.HaptikSDK$a.add(setCancelButtonIntent.ah$a(f5, values2));
                        f4 = Math.max(f4, f5);
                    }
                    f11 = f4;
                    f12 = f5;
                }
                if (str2 != null) {
                    i5 = -1;
                }
                i3++;
                valueOf2 = f;
                ah$a = f2;
                valueOf = f13;
                valueOf4 = f14;
                i4 = i5;
                f10 = f3;
                anonymousClass1Arr = anonymousClass1Arr2;
                valueOf5 = f15;
            }
            float f20 = valueOf5;
            float f21 = ah$a;
            this.ah$a = f11;
            this.valueOf = (values2 * this.HaptikSDK$a.size()) + ((f21 + f20) * (this.HaptikSDK$a.size() == 0 ? 0 : this.HaptikSDK$a.size() - 1));
        }
        this.valueOf += this.ICustomTabsCallback$Default;
        this.ah$a += this.onRelationshipValidationResult;
    }

    /* renamed from: com.github.mikephil.charting.components.Legend$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[LegendOrientation.values().length];
            toString = iArr;
            try {
                iArr[LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
