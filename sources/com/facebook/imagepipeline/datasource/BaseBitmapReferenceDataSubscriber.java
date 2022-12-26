package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import o.FragmentActivity;
import o.FragmentAnim;
/* loaded from: classes6.dex */
public abstract class BaseBitmapReferenceDataSubscriber extends FragmentAnim.EndViewTransitionAnimation<FragmentActivity.AnonymousClass1<CloseableImage>> {
    protected abstract void onNewResultImpl(FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1);

    @Override // o.FragmentAnim.EndViewTransitionAnimation
    public void onNewResultImpl(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<CloseableImage>> animationOrAnimator) {
        if (animationOrAnimator.isFinished()) {
            FragmentActivity.AnonymousClass1<CloseableImage> result = animationOrAnimator.getResult();
            FragmentActivity.AnonymousClass1<Bitmap> anonymousClass1 = null;
            if (result != null && (result.HaptikSDK$c() instanceof CloseableStaticBitmap)) {
                anonymousClass1 = ((CloseableStaticBitmap) result.HaptikSDK$c()).cloneUnderlyingBitmapReference();
            }
            try {
                onNewResultImpl(anonymousClass1);
            } finally {
                FragmentActivity.AnonymousClass1.valueOf(anonymousClass1);
                FragmentActivity.AnonymousClass1.valueOf(result);
            }
        }
    }
}
