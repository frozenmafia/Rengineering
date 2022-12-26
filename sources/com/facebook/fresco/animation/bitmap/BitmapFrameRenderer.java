package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.Rect;
/* loaded from: classes4.dex */
public interface BitmapFrameRenderer {
    int getIntrinsicHeight();

    int getIntrinsicWidth();

    boolean renderFrame(int i, Bitmap bitmap);

    void setBounds(Rect rect);
}
