package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
/* loaded from: classes4.dex */
public final /* synthetic */ class MediaCodecUtil$$ExternalSyntheticLambda1 implements MediaCodecUtil.ScoreProvider {
    public static final /* synthetic */ MediaCodecUtil$$ExternalSyntheticLambda1 INSTANCE = new MediaCodecUtil$$ExternalSyntheticLambda1();

    private /* synthetic */ MediaCodecUtil$$ExternalSyntheticLambda1() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        return MediaCodecUtil.lambda$applyWorkarounds$1((MediaCodecInfo) obj);
    }
}
