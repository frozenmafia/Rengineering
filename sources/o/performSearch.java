package o;

import android.graphics.Typeface;
/* loaded from: classes4.dex */
public abstract class performSearch {
    protected boolean extraCallback = true;
    protected float onRelationshipValidationResult = 5.0f;
    protected float ICustomTabsCallback$Default = 5.0f;
    protected Typeface onPostMessage = null;
    protected float ak$a = getServiceComponentByAction.valueOf(10.0f);
    protected int extraCallbackWithResult = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;

    public float ak$b() {
        return this.onRelationshipValidationResult;
    }

    public float onPostMessage() {
        return this.ICustomTabsCallback$Default;
    }

    public void HaptikSDK$b(float f) {
        this.ICustomTabsCallback$Default = getServiceComponentByAction.valueOf(f);
    }

    public Typeface extraCallbackWithResult() {
        return this.onPostMessage;
    }

    public void values(Typeface typeface) {
        this.onPostMessage = typeface;
    }

    public void HaptikSDK$a(float f) {
        if (f > 24.0f) {
            f = 24.0f;
        }
        if (f < 6.0f) {
            f = 6.0f;
        }
        this.ak$a = getServiceComponentByAction.valueOf(f);
    }

    public float ICustomTabsCallback() {
        return this.ak$a;
    }

    public void values(int i) {
        this.extraCallbackWithResult = i;
    }

    public int extraCallback() {
        return this.extraCallbackWithResult;
    }

    public void HaptikSDK$c(boolean z) {
        this.extraCallback = z;
    }

    public boolean ICustomTabsCallback$Default() {
        return this.extraCallback;
    }
}
