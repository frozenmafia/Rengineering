package com.facebook.imagepipeline.drawable;

import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableImage;
/* loaded from: classes4.dex */
public interface DrawableFactory {
    Drawable createDrawable(CloseableImage closeableImage);

    boolean supportsImageType(CloseableImage closeableImage);
}
