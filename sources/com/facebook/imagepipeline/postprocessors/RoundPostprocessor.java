package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.filter.InPlaceRoundFilter;
import com.facebook.imagepipeline.filter.XferRoundFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import o.requireActivity;
import o.requireView;
/* loaded from: classes6.dex */
public class RoundPostprocessor extends BasePostprocessor {
    private static final boolean ENABLE_ANTI_ALIASING = true;
    private static final boolean canUseXferRoundFilter = XferRoundFilter.canUseXferRoundFilter();
    private requireActivity mCacheKey;
    private final boolean mEnableAntiAliasing;

    public RoundPostprocessor() {
        this(true);
    }

    public RoundPostprocessor(boolean z) {
        this.mEnableAntiAliasing = z;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap, Bitmap bitmap2) {
        bitmap.getClass();
        bitmap2.getClass();
        if (canUseXferRoundFilter) {
            XferRoundFilter.xferRoundBitmap(bitmap, bitmap2, this.mEnableAntiAliasing);
        } else {
            super.process(bitmap, bitmap2);
        }
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        InPlaceRoundFilter.roundBitmapInPlace(bitmap);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public requireActivity getPostprocessorCacheKey() {
        if (this.mCacheKey == null) {
            if (canUseXferRoundFilter) {
                this.mCacheKey = new requireView("XferRoundFilter");
            } else {
                this.mCacheKey = new requireView("InPlaceRoundFilter");
            }
        }
        return this.mCacheKey;
    }
}
