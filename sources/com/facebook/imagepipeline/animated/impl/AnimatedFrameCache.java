package com.facebook.imagepipeline.animated.impl;

import android.net.Uri;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.Fragment;
import o.FragmentActivity;
import o.requireActivity;
/* loaded from: classes4.dex */
public class AnimatedFrameCache {
    private final CountingMemoryCache<requireActivity, CloseableImage> mBackingCache;
    private final requireActivity mImageCacheKey;
    private final LinkedHashSet<requireActivity> mFreeItemsPool = new LinkedHashSet<>();
    private final CountingMemoryCache.EntryStateObserver<requireActivity> mEntryStateObserver = new CountingMemoryCache.EntryStateObserver<requireActivity>() { // from class: com.facebook.imagepipeline.animated.impl.AnimatedFrameCache.1
        @Override // com.facebook.imagepipeline.cache.CountingMemoryCache.EntryStateObserver
        public void onExclusivityChanged(requireActivity requireactivity, boolean z) {
            AnimatedFrameCache.this.onReusabilityChange(requireactivity, z);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class FrameKey implements requireActivity {
        private final int mFrameIndex;
        private final requireActivity mImageCacheKey;

        @Override // o.requireActivity
        public String getUriString() {
            return null;
        }

        @Override // o.requireActivity
        public boolean isResourceIdForDebugging() {
            return false;
        }

        public FrameKey(requireActivity requireactivity, int i) {
            this.mImageCacheKey = requireactivity;
            this.mFrameIndex = i;
        }

        public String toString() {
            return Fragment.AnonymousClass7.valueOf(this).ah$a("imageCacheKey", this.mImageCacheKey).toString("frameIndex", this.mFrameIndex).toString();
        }

        @Override // o.requireActivity
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FrameKey) {
                FrameKey frameKey = (FrameKey) obj;
                return this.mFrameIndex == frameKey.mFrameIndex && this.mImageCacheKey.equals(frameKey.mImageCacheKey);
            }
            return false;
        }

        @Override // o.requireActivity
        public int hashCode() {
            return (this.mImageCacheKey.hashCode() * 1013) + this.mFrameIndex;
        }

        @Override // o.requireActivity
        public boolean containsUri(Uri uri) {
            return this.mImageCacheKey.containsUri(uri);
        }
    }

    public AnimatedFrameCache(requireActivity requireactivity, CountingMemoryCache<requireActivity, CloseableImage> countingMemoryCache) {
        this.mImageCacheKey = requireactivity;
        this.mBackingCache = countingMemoryCache;
    }

    public void onReusabilityChange(requireActivity requireactivity, boolean z) {
        synchronized (this) {
            if (z) {
                this.mFreeItemsPool.add(requireactivity);
            } else {
                this.mFreeItemsPool.remove(requireactivity);
            }
        }
    }

    public FragmentActivity.AnonymousClass1<CloseableImage> cache(int i, FragmentActivity.AnonymousClass1<CloseableImage> anonymousClass1) {
        return this.mBackingCache.cache(keyFor(i), anonymousClass1, this.mEntryStateObserver);
    }

    public FragmentActivity.AnonymousClass1<CloseableImage> get(int i) {
        return this.mBackingCache.get(keyFor(i));
    }

    public boolean contains(int i) {
        return this.mBackingCache.contains((CountingMemoryCache<requireActivity, CloseableImage>) keyFor(i));
    }

    public FragmentActivity.AnonymousClass1<CloseableImage> getForReuse() {
        FragmentActivity.AnonymousClass1<CloseableImage> reuse;
        do {
            requireActivity popFirstFreeItemKey = popFirstFreeItemKey();
            if (popFirstFreeItemKey == null) {
                return null;
            }
            reuse = this.mBackingCache.reuse(popFirstFreeItemKey);
        } while (reuse == null);
        return reuse;
    }

    private requireActivity popFirstFreeItemKey() {
        requireActivity requireactivity;
        synchronized (this) {
            Iterator<requireActivity> it = this.mFreeItemsPool.iterator();
            if (it.hasNext()) {
                requireactivity = it.next();
                it.remove();
            } else {
                requireactivity = null;
            }
        }
        return requireactivity;
    }

    private FrameKey keyFor(int i) {
        return new FrameKey(this.mImageCacheKey, i);
    }
}
