package com.facebook.imagepipeline.image;

import com.facebook.imagepipeline.producers.ProducerContext;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public abstract class CloseableImage implements Closeable, ImageInfo {
    private static final String TAG = "CloseableImage";
    private static final Set<String> mImageExtrasList = new HashSet(Arrays.asList(ProducerContext.ExtraKeys.ENCODED_SIZE, ProducerContext.ExtraKeys.ENCODED_WIDTH, ProducerContext.ExtraKeys.ENCODED_HEIGHT, ProducerContext.ExtraKeys.SOURCE_URI, ProducerContext.ExtraKeys.IMAGE_FORMAT, "bitmap_config", "is_rounded"));
    private Map<String, Object> mExtras = new HashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract int getSizeInBytes();

    public abstract boolean isClosed();

    public boolean isStateful() {
        return false;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public QualityInfo getQualityInfo() {
        return ImmutableQualityInfo.FULL_QUALITY;
    }

    @Override // com.facebook.imagepipeline.image.HasImageMetadata
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    public void setImageExtras(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (String str : mImageExtrasList) {
            Object obj = map.get(str);
            if (obj != null) {
                this.mExtras.put(str, obj);
            }
        }
    }

    public void setImageExtra(String str, Object obj) {
        if (mImageExtrasList.contains(str)) {
            this.mExtras.put(str, obj);
        }
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        FragmentActivity.ah$a(TAG, "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
