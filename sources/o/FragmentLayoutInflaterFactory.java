package o;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Arrays;
import java.util.List;
import o.setFragmentResult;
/* loaded from: classes4.dex */
public class FragmentLayoutInflaterFactory {
    public static final setFragmentResult.valueOf ag$a = setFragmentResult.valueOf.ah$a;
    public static final setFragmentResult.valueOf valueOf = setFragmentResult.valueOf.toString;
    private float HaptikSDK$a;
    private Drawable HaptikSDK$b;
    private setFragmentResult.valueOf HaptikSDK$c;
    private setFragmentResult.valueOf HaptikSDK$d;
    private List<Drawable> HaptikSDK$e;
    private setFragmentResult.valueOf HaptikWebView;
    private Resources a;
    private PointF ah$a;
    private int ah$b;
    private setFragmentResult.valueOf aj$a;
    private Drawable ak;
    private RoundingParams ak$a;
    private Drawable getInitSettings;
    private Drawable getSignupData;
    private Drawable invoke;
    private setFragmentResult.valueOf isLogoutPending;
    private Drawable onXdkEvent;
    private ColorFilter toString;
    private Matrix values;

    /* renamed from: o.FragmentLayoutInflaterFactory$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public interface AnonymousClass1 {
        void valueOf();

        void valueOf(boolean z);
    }

    public FragmentLayoutInflaterFactory(Resources resources) {
        this.a = resources;
        extraCallback();
    }

    public static FragmentLayoutInflaterFactory values(Resources resources) {
        return new FragmentLayoutInflaterFactory(resources);
    }

    private void extraCallback() {
        this.ah$b = 300;
        this.HaptikSDK$a = 0.0f;
        this.getInitSettings = null;
        setFragmentResult.valueOf valueof = ag$a;
        this.HaptikSDK$d = valueof;
        this.onXdkEvent = null;
        this.aj$a = valueof;
        this.invoke = null;
        this.HaptikWebView = valueof;
        this.ak = null;
        this.isLogoutPending = valueof;
        this.HaptikSDK$c = valueOf;
        this.values = null;
        this.ah$a = null;
        this.toString = null;
        this.HaptikSDK$b = null;
        this.HaptikSDK$e = null;
        this.getSignupData = null;
        this.ak$a = null;
    }

    public Resources isLogoutPending() {
        return this.a;
    }

    public FragmentLayoutInflaterFactory values(int i) {
        this.ah$b = i;
        return this;
    }

    public int ah$b() {
        return this.ah$b;
    }

    public FragmentLayoutInflaterFactory ah$a(float f) {
        this.HaptikSDK$a = f;
        return this;
    }

    public float HaptikSDK$c() {
        return this.HaptikSDK$a;
    }

    public FragmentLayoutInflaterFactory values(Drawable drawable) {
        this.getInitSettings = drawable;
        return this;
    }

    public Drawable HaptikSDK$d() {
        return this.getInitSettings;
    }

    public FragmentLayoutInflaterFactory valueOf(setFragmentResult.valueOf valueof) {
        this.HaptikSDK$d = valueof;
        return this;
    }

    public setFragmentResult.valueOf HaptikSDK$e() {
        return this.HaptikSDK$d;
    }

    public FragmentLayoutInflaterFactory HaptikSDK$c(Drawable drawable) {
        this.onXdkEvent = drawable;
        return this;
    }

    public Drawable a() {
        return this.onXdkEvent;
    }

    public FragmentLayoutInflaterFactory ag$a(setFragmentResult.valueOf valueof) {
        this.aj$a = valueof;
        return this;
    }

    public setFragmentResult.valueOf ak() {
        return this.aj$a;
    }

    public FragmentLayoutInflaterFactory ah$a(Drawable drawable) {
        this.invoke = drawable;
        return this;
    }

    public Drawable HaptikSDK$a() {
        return this.invoke;
    }

    public FragmentLayoutInflaterFactory values(setFragmentResult.valueOf valueof) {
        this.HaptikWebView = valueof;
        return this;
    }

    public setFragmentResult.valueOf invoke() {
        return this.HaptikWebView;
    }

    public FragmentLayoutInflaterFactory invoke(Drawable drawable) {
        this.ak = drawable;
        return this;
    }

    public Drawable HaptikWebView() {
        return this.ak;
    }

    public FragmentLayoutInflaterFactory ah$a(setFragmentResult.valueOf valueof) {
        this.isLogoutPending = valueof;
        return this;
    }

    public setFragmentResult.valueOf aj$a() {
        return this.isLogoutPending;
    }

    public FragmentLayoutInflaterFactory toString(setFragmentResult.valueOf valueof) {
        this.HaptikSDK$c = valueof;
        this.values = null;
        return this;
    }

    public setFragmentResult.valueOf values() {
        return this.HaptikSDK$c;
    }

    public PointF ah$a() {
        return this.ah$a;
    }

    public ColorFilter ag$a() {
        return this.toString;
    }

    public FragmentLayoutInflaterFactory valueOf(Drawable drawable) {
        this.HaptikSDK$b = drawable;
        return this;
    }

    public Drawable HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public FragmentLayoutInflaterFactory ag$a(Drawable drawable) {
        if (drawable == null) {
            this.HaptikSDK$e = null;
        } else {
            this.HaptikSDK$e = Arrays.asList(drawable);
        }
        return this;
    }

    public List<Drawable> getInitSettings() {
        return this.HaptikSDK$e;
    }

    public FragmentLayoutInflaterFactory toString(Drawable drawable) {
        if (drawable == null) {
            this.getSignupData = null;
        } else {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.getSignupData = stateListDrawable;
        }
        return this;
    }

    public Drawable getSignupData() {
        return this.getSignupData;
    }

    public FragmentLayoutInflaterFactory ah$a(RoundingParams roundingParams) {
        this.ak$a = roundingParams;
        return this;
    }

    public RoundingParams onXdkEvent() {
        return this.ak$a;
    }

    private void ak$a() {
        List<Drawable> list = this.HaptikSDK$e;
        if (list != null) {
            for (Drawable drawable : list) {
                drawable.getClass();
            }
        }
    }

    public dispatchOnFragmentActivityCreated valueOf() {
        ak$a();
        return new dispatchOnFragmentActivityCreated(this);
    }
}
