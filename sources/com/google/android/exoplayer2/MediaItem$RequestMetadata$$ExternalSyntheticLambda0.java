package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
/* loaded from: classes4.dex */
public final /* synthetic */ class MediaItem$RequestMetadata$$ExternalSyntheticLambda0 implements Bundleable.Creator {
    public static final /* synthetic */ MediaItem$RequestMetadata$$ExternalSyntheticLambda0 INSTANCE = new MediaItem$RequestMetadata$$ExternalSyntheticLambda0();

    private /* synthetic */ MediaItem$RequestMetadata$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable fromBundle(Bundle bundle) {
        MediaItem.RequestMetadata build;
        build = new MediaItem.RequestMetadata.Builder().setMediaUri((Uri) bundle.getParcelable(MediaItem.RequestMetadata.keyForField(0))).setSearchQuery(bundle.getString(MediaItem.RequestMetadata.keyForField(1))).setExtras(bundle.getBundle(MediaItem.RequestMetadata.keyForField(2))).build();
        return build;
    }
}
