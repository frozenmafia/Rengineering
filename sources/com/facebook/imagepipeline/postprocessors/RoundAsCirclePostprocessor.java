package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import o.requireActivity;
import o.requireView;
/* loaded from: classes6.dex */
public class RoundAsCirclePostprocessor extends BasePostprocessor {
    private static final boolean ENABLE_ANTI_ALIASING = true;
    private requireActivity mCacheKey;
    private final boolean mEnableAntiAliasing;

    public RoundAsCirclePostprocessor() {
        this(true);
    }

    public RoundAsCirclePostprocessor(boolean z) {
        this.mEnableAntiAliasing = z;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        NativeRoundingFilter.toCircleFast(bitmap, this.mEnableAntiAliasing);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public requireActivity getPostprocessorCacheKey() {
        if (this.mCacheKey == null) {
            if (this.mEnableAntiAliasing) {
                this.mCacheKey = new requireView("RoundAsCirclePostprocessor#AntiAliased");
            } else {
                this.mCacheKey = new requireView("RoundAsCirclePostprocessor");
            }
        }
        return this.mCacheKey;
    }
}
