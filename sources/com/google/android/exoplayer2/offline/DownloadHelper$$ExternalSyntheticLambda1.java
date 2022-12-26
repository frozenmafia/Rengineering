package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
/* loaded from: classes7.dex */
public final /* synthetic */ class DownloadHelper$$ExternalSyntheticLambda1 implements MetadataOutput {
    public static final /* synthetic */ DownloadHelper$$ExternalSyntheticLambda1 INSTANCE = new DownloadHelper$$ExternalSyntheticLambda1();

    private /* synthetic */ DownloadHelper$$ExternalSyntheticLambda1() {
    }

    @Override // com.google.android.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        DownloadHelper.lambda$getRendererCapabilities$1(metadata);
    }
}
