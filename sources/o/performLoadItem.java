package o;

import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.components.LimitLine;
import java.util.ArrayList;
import java.util.List;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public abstract class performLoadItem extends performSearch {
    protected List<LimitLine> aj$a;
    public int ak;
    public int invoke;
    protected MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 values;
    private int asBinder = -7829368;
    private float asInterface = 1.0f;
    private int onNavigationEvent = -7829368;
    private float ICustomTabsCallback$Stub = 1.0f;
    public float[] getSignupData = new float[0];
    public float[] HaptikSDK$c = new float[0];
    private int setDefaultImpl = 6;
    protected float onXdkEvent = 1.0f;
    protected boolean a = false;
    protected boolean isLogoutPending = false;
    protected boolean getInitSettings = true;
    protected boolean HaptikSDK$a = true;
    protected boolean HaptikSDK$e = true;
    protected boolean valueOf = false;
    private DashPathEffect onMessageChannelReady = null;
    private DashPathEffect getDefaultImpl = null;
    protected boolean HaptikWebView = false;
    protected boolean HaptikSDK$d = true;
    protected float ak$b = 0.0f;
    protected float ICustomTabsCallback = 0.0f;
    protected boolean ah$b = false;
    protected boolean HaptikSDK$b = false;
    public float ag$a = 0.0f;
    public float toString = 0.0f;
    public float ah$a = 0.0f;

    public performLoadItem() {
        this.ak$a = getServiceComponentByAction.valueOf(10.0f);
        this.onRelationshipValidationResult = getServiceComponentByAction.valueOf(5.0f);
        this.ICustomTabsCallback$Default = getServiceComponentByAction.valueOf(5.0f);
        this.aj$a = new ArrayList();
    }

    public void ah$a(boolean z) {
        this.getInitSettings = z;
    }

    public boolean isLogoutPending() {
        return this.getInitSettings;
    }

    public void ag$a(boolean z) {
        this.HaptikSDK$a = z;
    }

    public boolean HaptikSDK$d() {
        return this.HaptikSDK$a;
    }

    public void toString(boolean z) {
        this.valueOf = z;
    }

    public boolean getInitSettings() {
        return this.valueOf && this.ak > 0;
    }

    public void toString(int i) {
        this.asBinder = i;
    }

    public int HaptikSDK$b() {
        return this.asBinder;
    }

    public void valueOf(float f) {
        this.ICustomTabsCallback$Stub = getServiceComponentByAction.valueOf(f);
    }

    public float values() {
        return this.ICustomTabsCallback$Stub;
    }

    public void ag$a(float f) {
        this.asInterface = getServiceComponentByAction.valueOf(f);
    }

    public float HaptikSDK$a() {
        return this.asInterface;
    }

    public void ah$a(int i) {
        this.onNavigationEvent = i;
    }

    public int ag$a() {
        return this.onNavigationEvent;
    }

    public void valueOf(boolean z) {
        this.HaptikSDK$e = z;
    }

    public boolean onXdkEvent() {
        return this.HaptikSDK$e;
    }

    public void valueOf(int i) {
        if (i > 25) {
            i = 25;
        }
        if (i < 2) {
            i = 2;
        }
        this.setDefaultImpl = i;
        this.isLogoutPending = false;
    }

    public void values(int i, boolean z) {
        valueOf(i);
        this.isLogoutPending = z;
    }

    public boolean ak() {
        return this.isLogoutPending;
    }

    public int HaptikSDK$c() {
        return this.setDefaultImpl;
    }

    public boolean a() {
        return this.a;
    }

    public void HaptikSDK$b(boolean z) {
        this.a = z;
    }

    public float valueOf() {
        return this.onXdkEvent;
    }

    public void ah$a(float f) {
        this.onXdkEvent = f;
        this.a = true;
    }

    public void toString(LimitLine limitLine) {
        this.aj$a.add(limitLine);
        if (this.aj$a.size() > 6) {
            Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        }
    }

    public void ak$a() {
        this.aj$a.clear();
    }

    public List<LimitLine> ah$b() {
        return this.aj$a;
    }

    public void values(boolean z) {
        this.HaptikWebView = z;
    }

    public boolean aj$a() {
        return this.HaptikWebView;
    }

    public boolean HaptikWebView() {
        return this.HaptikSDK$d;
    }

    public String getSignupData() {
        String str = "";
        for (int i = 0; i < this.getSignupData.length; i++) {
            String ag$a = ag$a(i);
            if (ag$a != null && str.length() < ag$a.length()) {
                str = ag$a;
            }
        }
        return str;
    }

    public String ag$a(int i) {
        return (i < 0 || i >= this.getSignupData.length) ? "" : HaptikSDK$e().ah$a(this.getSignupData[i], this);
    }

    public void valueOf(MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 anonymousClass1) {
        if (anonymousClass1 == null) {
            this.values = new MediaBrowserServiceCompat.MediaBrowserServiceImplApi23(this.invoke);
        } else {
            this.values = anonymousClass1;
        }
    }

    public MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 HaptikSDK$e() {
        MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 anonymousClass1 = this.values;
        if (anonymousClass1 == null || ((anonymousClass1 instanceof MediaBrowserServiceCompat.MediaBrowserServiceImplApi23) && ((MediaBrowserServiceCompat.MediaBrowserServiceImplApi23) anonymousClass1).ah$a() != this.invoke)) {
            this.values = new MediaBrowserServiceCompat.MediaBrowserServiceImplApi23(this.invoke);
        }
        return this.values;
    }

    public void values(float f, float f2, float f3) {
        this.getDefaultImpl = new DashPathEffect(new float[]{f, f2}, f3);
    }

    public DashPathEffect invoke() {
        return this.getDefaultImpl;
    }

    public DashPathEffect ah$a() {
        return this.onMessageChannelReady;
    }

    public void toString(float f) {
        this.ah$b = true;
        this.toString = f;
        this.ah$a = Math.abs(this.ag$a - f);
    }

    public void values(float f) {
        this.HaptikSDK$b = true;
        this.ag$a = f;
        this.ah$a = Math.abs(f - this.toString);
    }

    public void values(float f, float f2) {
        float f3 = this.ah$b ? this.toString : f - this.ak$b;
        float f4 = this.HaptikSDK$b ? this.ag$a : f2 + this.ICustomTabsCallback;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.toString = f3;
        this.ag$a = f4;
        this.ah$a = Math.abs(f4 - f3);
    }

    public void ah$b(float f) {
        this.ak$b = f;
    }

    public void HaptikSDK$c(float f) {
        this.ICustomTabsCallback = f;
    }
}
