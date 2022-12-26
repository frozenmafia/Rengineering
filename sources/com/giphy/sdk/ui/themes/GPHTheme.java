package com.giphy.sdk.ui.themes;

import android.content.Context;
import android.content.res.Resources;
import com.sendbird.android.constant.StringSet;
import kotlin.NoWhenBranchMatchedException;
import o.AudioFocusRequestCompat;
import o.getFocusChangeHandler;
import o.getFocusGain;
import o.runAnimators;
import o.willPauseWhenDucked;
/* loaded from: classes4.dex */
public enum GPHTheme {
    Automatic("automatic"),
    Light("light"),
    Dark("dark"),
    Custom(StringSet.custom);

    GPHTheme(String str) {
    }

    public final AudioFocusRequestCompat.Api26Impl getThemeResources$giphy_ui_2_1_17_release(Context context) {
        Integer num;
        if (context != null) {
            Resources resources = context.getResources();
            runAnimators.ah$a(resources, "context.resources");
            num = Integer.valueOf(resources.getConfiguration().uiMode & 48);
        } else {
            num = null;
        }
        int i = willPauseWhenDucked.values[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return getFocusChangeHandler.toString;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return AudioFocusRequestCompat.values;
            }
            return getFocusGain.toString;
        } else if (num != null && num.intValue() == 16) {
            return getFocusGain.toString;
        } else {
            if (num != null && num.intValue() == 32) {
                return AudioFocusRequestCompat.values;
            }
            if (num != null && num.intValue() == 0) {
                return getFocusGain.toString;
            }
            return getFocusGain.toString;
        }
    }
}
