package com.facebook.imagepipeline.postprocessors;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.filter.IterativeBoxBlurFilter;
import com.facebook.imagepipeline.filter.RenderScriptBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import o.Fragment;
import o.requireActivity;
import o.requireView;
/* loaded from: classes6.dex */
public class BlurPostProcessor extends BasePostprocessor {
    private static final int DEFAULT_ITERATIONS = 3;
    private static final boolean canUseRenderScript = RenderScriptBlurFilter.canUseRenderScript();
    private final int mBlurRadius;
    private requireActivity mCacheKey;
    private final Context mContext;
    private final int mIterations;

    public BlurPostProcessor(int i, Context context, int i2) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0 && i <= 25));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i2 > 0));
        context.getClass();
        this.mIterations = i2;
        this.mBlurRadius = i;
        this.mContext = context;
    }

    public BlurPostProcessor(int i, Context context) {
        this(i, context, 3);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap, Bitmap bitmap2) {
        if (canUseRenderScript) {
            RenderScriptBlurFilter.blurBitmap(bitmap, bitmap2, this.mContext, this.mBlurRadius);
        } else {
            super.process(bitmap, bitmap2);
        }
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        IterativeBoxBlurFilter.boxBlurBitmapInPlace(bitmap, this.mIterations, this.mBlurRadius);
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public requireActivity getPostprocessorCacheKey() {
        String format;
        if (this.mCacheKey == null) {
            if (canUseRenderScript) {
                format = String.format(null, "IntrinsicBlur;%d", Integer.valueOf(this.mBlurRadius));
            } else {
                format = String.format(null, "IterativeBoxBlur;%d;%d", Integer.valueOf(this.mIterations), Integer.valueOf(this.mBlurRadius));
            }
            this.mCacheKey = new requireView(format);
        }
        return this.mCacheKey;
    }
}
