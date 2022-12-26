package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import o.Fragment;
import o.requireActivity;
import o.requireView;
/* loaded from: classes4.dex */
public class IterativeBoxBlurPostProcessor extends BasePostprocessor {
    private static final int DEFAULT_ITERATIONS = 3;
    private final int mBlurRadius;
    private requireActivity mCacheKey;
    private final int mIterations;

    public IterativeBoxBlurPostProcessor(int i) {
        this(3, i);
    }

    public IterativeBoxBlurPostProcessor(int i, int i2) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i2 > 0));
        this.mIterations = i;
        this.mBlurRadius = i2;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.mIterations, this.mBlurRadius);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public requireActivity getPostprocessorCacheKey() {
        if (this.mCacheKey == null) {
            this.mCacheKey = new requireView(String.format(null, "i%dr%d", Integer.valueOf(this.mIterations), Integer.valueOf(this.mBlurRadius)));
        }
        return this.mCacheKey;
    }
}
