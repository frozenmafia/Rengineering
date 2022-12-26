package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import o.requireActivity;
import o.requireView;
/* loaded from: classes6.dex */
public class RoundedCornersPostprocessor extends BasePostprocessor {
    private requireActivity mCacheKey;

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        int min = Math.min(bitmap.getHeight(), bitmap.getWidth());
        NativeRoundingFilter.addRoundedCorners(bitmap, min / 2, min / 3, min / 4, min / 5);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public requireActivity getPostprocessorCacheKey() {
        if (this.mCacheKey == null) {
            this.mCacheKey = new requireView("RoundedCornersPostprocessor");
        }
        return this.mCacheKey;
    }
}
