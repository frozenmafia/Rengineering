package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.Map;
/* loaded from: classes4.dex */
public final /* synthetic */ class FragmentedMp4Extractor$$ExternalSyntheticLambda0 implements ExtractorsFactory {
    public static final /* synthetic */ FragmentedMp4Extractor$$ExternalSyntheticLambda0 INSTANCE = new FragmentedMp4Extractor$$ExternalSyntheticLambda0();

    private /* synthetic */ FragmentedMp4Extractor$$ExternalSyntheticLambda0() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        return FragmentedMp4Extractor.lambda$static$0();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        Extractor[] createExtractors;
        createExtractors = createExtractors();
        return createExtractors;
    }
}
