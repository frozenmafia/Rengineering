package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import o.recycleUpdateOp;
/* loaded from: classes4.dex */
public final class ThumbRating extends Rating {
    public static final Bundleable.Creator<ThumbRating> CREATOR = ThumbRating$$ExternalSyntheticLambda0.INSTANCE;
    private static final int FIELD_IS_THUMBS_UP = 2;
    private static final int FIELD_RATED = 1;
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;

    public ThumbRating() {
        this.rated = false;
        this.isThumbsUp = false;
    }

    public ThumbRating(boolean z) {
        this.rated = true;
        this.isThumbsUp = z;
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.rated;
    }

    public boolean isThumbsUp() {
        return this.isThumbsUp;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(Boolean.valueOf(this.rated), Boolean.valueOf(this.isThumbsUp));
    }

    public boolean equals(Object obj) {
        if (obj instanceof ThumbRating) {
            ThumbRating thumbRating = (ThumbRating) obj;
            return this.isThumbsUp == thumbRating.isThumbsUp && this.rated == thumbRating.rated;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), 3);
        bundle.putBoolean(keyForField(1), this.rated);
        bundle.putBoolean(keyForField(2), this.isThumbsUp);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThumbRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 3);
        if (bundle.getBoolean(keyForField(1), false)) {
            return new ThumbRating(bundle.getBoolean(keyForField(2), false));
        }
        return new ThumbRating();
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }
}
