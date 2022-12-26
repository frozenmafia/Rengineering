package o;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class updatePreferences$ag$a extends Drawable.ConstantState {
    public float HaptikSDK$a;
    public float HaptikSDK$b;
    public Paint.Style HaptikSDK$c;
    public int HaptikSDK$d;
    public int HaptikSDK$e;
    public int HaptikWebView;
    public ColorStateList a;
    public ColorFilter ag$a;
    public scrollToPreference ah$a;
    public Rect ah$b;
    public ColorStateList aj$a;
    public float ak;
    public boolean ak$a;
    public float extraCallback;
    public int getInitSettings;
    public areItemsTheSame getSignupData;
    public float invoke;
    public PorterDuff.Mode isLogoutPending;
    public ColorStateList onXdkEvent;
    public int toString;
    public float valueOf;
    public ColorStateList values;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    public updatePreferences$ag$a(areItemsTheSame areitemsthesame, scrollToPreference scrolltopreference) {
        this.values = null;
        this.onXdkEvent = null;
        this.aj$a = null;
        this.a = null;
        this.isLogoutPending = PorterDuff.Mode.SRC_IN;
        this.ah$b = null;
        this.invoke = 1.0f;
        this.HaptikSDK$a = 1.0f;
        this.toString = 255;
        this.HaptikSDK$b = 0.0f;
        this.valueOf = 0.0f;
        this.extraCallback = 0.0f;
        this.HaptikSDK$e = 0;
        this.HaptikSDK$d = 0;
        this.HaptikWebView = 0;
        this.getInitSettings = 0;
        this.ak$a = false;
        this.HaptikSDK$c = Paint.Style.FILL_AND_STROKE;
        this.getSignupData = areitemsthesame;
        this.ah$a = scrolltopreference;
    }

    public updatePreferences$ag$a(updatePreferences$ag$a updatepreferences_ag_a) {
        this.values = null;
        this.onXdkEvent = null;
        this.aj$a = null;
        this.a = null;
        this.isLogoutPending = PorterDuff.Mode.SRC_IN;
        this.ah$b = null;
        this.invoke = 1.0f;
        this.HaptikSDK$a = 1.0f;
        this.toString = 255;
        this.HaptikSDK$b = 0.0f;
        this.valueOf = 0.0f;
        this.extraCallback = 0.0f;
        this.HaptikSDK$e = 0;
        this.HaptikSDK$d = 0;
        this.HaptikWebView = 0;
        this.getInitSettings = 0;
        this.ak$a = false;
        this.HaptikSDK$c = Paint.Style.FILL_AND_STROKE;
        this.getSignupData = updatepreferences_ag_a.getSignupData;
        this.ah$a = updatepreferences_ag_a.ah$a;
        this.ak = updatepreferences_ag_a.ak;
        this.ag$a = updatepreferences_ag_a.ag$a;
        this.values = updatepreferences_ag_a.values;
        this.onXdkEvent = updatepreferences_ag_a.onXdkEvent;
        this.isLogoutPending = updatepreferences_ag_a.isLogoutPending;
        this.a = updatepreferences_ag_a.a;
        this.toString = updatepreferences_ag_a.toString;
        this.invoke = updatepreferences_ag_a.invoke;
        this.HaptikWebView = updatepreferences_ag_a.HaptikWebView;
        this.HaptikSDK$e = updatepreferences_ag_a.HaptikSDK$e;
        this.ak$a = updatepreferences_ag_a.ak$a;
        this.HaptikSDK$a = updatepreferences_ag_a.HaptikSDK$a;
        this.HaptikSDK$b = updatepreferences_ag_a.HaptikSDK$b;
        this.valueOf = updatepreferences_ag_a.valueOf;
        this.extraCallback = updatepreferences_ag_a.extraCallback;
        this.HaptikSDK$d = updatepreferences_ag_a.HaptikSDK$d;
        this.getInitSettings = updatepreferences_ag_a.getInitSettings;
        this.aj$a = updatepreferences_ag_a.aj$a;
        this.HaptikSDK$c = updatepreferences_ag_a.HaptikSDK$c;
        if (updatepreferences_ag_a.ah$b != null) {
            this.ah$b = new Rect(updatepreferences_ag_a.ah$b);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        updatePreferences updatepreferences = new updatePreferences(this);
        updatepreferences.HaptikSDK$d = true;
        return updatepreferences;
    }
}
