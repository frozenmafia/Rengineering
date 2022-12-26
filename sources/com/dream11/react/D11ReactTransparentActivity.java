package com.dream11.react;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class D11ReactTransparentActivity extends D11ReactActivity {
    public static final D11ReactTransparentActivity$ag$a ag$a = new D11ReactTransparentActivity$ag$a(null);
    private final int ah$a = 1000;
    private long toString;

    @Override // com.dream11.react.D11ReactActivity
    public boolean values() {
        return false;
    }

    @Override // com.dream11.react.D11ReactActivity, com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ah$b();
        super.onCreate(null);
    }

    public final void ah$b() {
        overridePendingTransition(17432576, 17432577);
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (isFinishing()) {
            ah$b();
        }
        super.onPause();
    }

    @Override // com.facebook.react.ReactActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.toString + this.ah$a < System.currentTimeMillis()) {
            this.toString = System.currentTimeMillis();
            super.onBackPressed();
        }
    }
}
