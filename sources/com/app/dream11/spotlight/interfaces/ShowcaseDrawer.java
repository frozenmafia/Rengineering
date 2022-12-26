package com.app.dream11.spotlight.interfaces;

import android.graphics.Bitmap;
import android.graphics.Canvas;
/* loaded from: classes3.dex */
public interface ShowcaseDrawer {
    void drawShowcase(Bitmap bitmap, float f, float f2, float f3);

    void drawToCanvas(Canvas canvas, Bitmap bitmap);

    void erase(Bitmap bitmap);

    float getBlockedRadius();

    int getShowcaseHeight();

    int getShowcaseWidth();

    void setBackgroundColour(int i);

    void setShowcaseColour(int i);
}
