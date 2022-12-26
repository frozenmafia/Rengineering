package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import o.FragmentActivity;
import o.FragmentAnim;
/* loaded from: classes4.dex */
public abstract class BaseBitmapDataSubscriber extends FragmentAnim.EndViewTransitionAnimation<FragmentActivity.AnonymousClass1<CloseableImage>> {
    protected abstract void onNewResultImpl(Bitmap bitmap);

    @Override // o.FragmentAnim.EndViewTransitionAnimation
    public void onNewResultImpl(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<CloseableImage>> animationOrAnimator) {
        if (animationOrAnimator.isFinished()) {
            FragmentActivity.AnonymousClass1<CloseableImage> result = animationOrAnimator.getResult();
            Bitmap bitmap = null;
            if (result != null && (result.HaptikSDK$c() instanceof CloseableBitmap)) {
                bitmap = ((CloseableBitmap) result.HaptikSDK$c()).getUnderlyingBitmap();
            }
            try {
                onNewResultImpl(bitmap);
            } finally {
                FragmentActivity.AnonymousClass1.valueOf(result);
            }
        }
    }
}
