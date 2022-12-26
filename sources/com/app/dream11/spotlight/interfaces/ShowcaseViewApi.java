package com.app.dream11.spotlight.interfaces;

import android.widget.RelativeLayout;
/* loaded from: classes3.dex */
public interface ShowcaseViewApi {
    void hide(boolean z);

    boolean isShowing();

    void setBlocksTouches(boolean z);

    void setButtonPosition(RelativeLayout.LayoutParams layoutParams);

    void setContentText(CharSequence charSequence, boolean z);

    void setContentTitle(CharSequence charSequence, boolean z);

    void setHideOnTouchOutside(boolean z);

    void setStyle(int i);

    void show();
}
