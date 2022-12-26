package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import o.requireActivity;
/* loaded from: classes4.dex */
public interface CacheKeyFactory {
    requireActivity getBitmapCacheKey(ImageRequest imageRequest, Object obj);

    requireActivity getEncodedCacheKey(ImageRequest imageRequest, Uri uri, Object obj);

    requireActivity getEncodedCacheKey(ImageRequest imageRequest, Object obj);

    requireActivity getPostprocessedBitmapCacheKey(ImageRequest imageRequest, Object obj);
}
