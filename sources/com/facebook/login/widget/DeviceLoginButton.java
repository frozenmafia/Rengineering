package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.LoginBehavior;
import o.isStateAtLeast;
import o.setExitAnimationOrder;
import o.setSpecialEffectsControllerFactory;
/* loaded from: classes6.dex */
public class DeviceLoginButton extends LoginButton {
    private Uri toString;

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceLoginButton(Context context) {
        super(context);
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.toString = uri;
    }

    public Uri HaptikSDK$c() {
        return this.toString;
    }

    @Override // com.facebook.login.widget.LoginButton
    protected LoginButton$ag$a HaptikSDK$a() {
        return new values();
    }

    /* loaded from: classes6.dex */
    class values extends LoginButton$ag$a {
        private values() {
            super(DeviceLoginButton.this);
        }

        @Override // com.facebook.login.widget.LoginButton$ag$a
        protected setSpecialEffectsControllerFactory valueOf() {
            if (isStateAtLeast.values(this)) {
                return null;
            }
            try {
                setExitAnimationOrder values = setExitAnimationOrder.values();
                values.ah$a(DeviceLoginButton.this.getSignupData());
                values.ah$a(LoginBehavior.DEVICE_AUTH);
                values.valueOf(DeviceLoginButton.this.HaptikSDK$c());
                return values;
            } catch (Throwable th) {
                isStateAtLeast.values(th, this);
                return null;
            }
        }
    }
}
