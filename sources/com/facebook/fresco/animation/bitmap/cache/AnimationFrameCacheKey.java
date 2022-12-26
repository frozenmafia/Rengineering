package com.facebook.fresco.animation.bitmap.cache;

import android.net.Uri;
import o.requireActivity;
/* loaded from: classes4.dex */
public class AnimationFrameCacheKey implements requireActivity {
    private static final String URI_PREFIX = "anim://";
    private final String mAnimationUriString;
    private final boolean mDeepEquals;

    @Override // o.requireActivity
    public boolean isResourceIdForDebugging() {
        return false;
    }

    public AnimationFrameCacheKey(int i) {
        this(i, false);
    }

    public AnimationFrameCacheKey(int i, boolean z) {
        this.mAnimationUriString = URI_PREFIX + i;
        this.mDeepEquals = z;
    }

    @Override // o.requireActivity
    public boolean containsUri(Uri uri) {
        return uri.toString().startsWith(this.mAnimationUriString);
    }

    @Override // o.requireActivity
    public String getUriString() {
        return this.mAnimationUriString;
    }

    @Override // o.requireActivity
    public boolean equals(Object obj) {
        if (this.mDeepEquals) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.mAnimationUriString.equals(((AnimationFrameCacheKey) obj).mAnimationUriString);
        }
        return super.equals(obj);
    }

    @Override // o.requireActivity
    public int hashCode() {
        if (!this.mDeepEquals) {
            return super.hashCode();
        }
        return this.mAnimationUriString.hashCode();
    }
}
