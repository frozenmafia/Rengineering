package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.ArrayList;
import java.util.List;
import o.FragmentActivity;
import o.FragmentAnim;
/* loaded from: classes6.dex */
public abstract class BaseListBitmapDataSubscriber extends FragmentAnim.EndViewTransitionAnimation<List<FragmentActivity.AnonymousClass1<CloseableImage>>> {
    protected abstract void onNewResultListImpl(List<Bitmap> list);

    @Override // o.FragmentAnim.EndViewTransitionAnimation
    public void onNewResultImpl(FragmentAnim.AnimationOrAnimator<List<FragmentActivity.AnonymousClass1<CloseableImage>>> animationOrAnimator) {
        if (animationOrAnimator.isFinished()) {
            List<FragmentActivity.AnonymousClass1<CloseableImage>> result = animationOrAnimator.getResult();
            if (result == null) {
                onNewResultListImpl(null);
                return;
            }
            try {
                ArrayList arrayList = new ArrayList(result.size());
                for (FragmentActivity.AnonymousClass1<CloseableImage> anonymousClass1 : result) {
                    if (anonymousClass1 != null && (anonymousClass1.HaptikSDK$c() instanceof CloseableBitmap)) {
                        arrayList.add(((CloseableBitmap) anonymousClass1.HaptikSDK$c()).getUnderlyingBitmap());
                    } else {
                        arrayList.add(null);
                    }
                }
                onNewResultListImpl(arrayList);
            } finally {
                for (FragmentActivity.AnonymousClass1<CloseableImage> next : result) {
                    FragmentActivity.AnonymousClass1.valueOf(next);
                }
            }
        }
    }
}
