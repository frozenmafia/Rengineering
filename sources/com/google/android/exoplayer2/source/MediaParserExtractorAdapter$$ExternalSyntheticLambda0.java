package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
/* loaded from: classes7.dex */
public final /* synthetic */ class MediaParserExtractorAdapter$$ExternalSyntheticLambda0 implements ProgressiveMediaExtractor.Factory {
    public static final /* synthetic */ MediaParserExtractorAdapter$$ExternalSyntheticLambda0 INSTANCE = new MediaParserExtractorAdapter$$ExternalSyntheticLambda0();

    private /* synthetic */ MediaParserExtractorAdapter$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return new MediaParserExtractorAdapter(playerId);
    }
}
