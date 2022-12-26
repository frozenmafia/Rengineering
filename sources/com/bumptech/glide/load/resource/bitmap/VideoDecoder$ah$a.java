package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
/* loaded from: classes3.dex */
final class VideoDecoder$ah$a implements VideoDecoder.toString<AssetFileDescriptor> {
    private VideoDecoder$ah$a() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.toString
    /* renamed from: values */
    public void ag$a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
