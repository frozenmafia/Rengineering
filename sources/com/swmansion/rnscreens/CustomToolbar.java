package com.swmansion.rnscreens;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import easypay.manager.Constants;
import o.runAnimators;
/* loaded from: classes5.dex */
public class CustomToolbar extends Toolbar {
    private final ScreenStackHeaderConfig ag$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(Context context, ScreenStackHeaderConfig screenStackHeaderConfig) {
        super(context);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(screenStackHeaderConfig, Constants.EASY_PAY_CONFIG_PREF_KEY);
        this.ag$a = screenStackHeaderConfig;
    }

    public final ScreenStackHeaderConfig ah$a() {
        return this.ag$a;
    }
}
