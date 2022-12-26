package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = ExtractorsFactory$$ExternalSyntheticLambda0.INSTANCE;

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);

    /* renamed from: com.google.android.exoplayer2.extractor.ExtractorsFactory$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        static {
            ExtractorsFactory extractorsFactory = ExtractorsFactory.EMPTY;
        }

        public static /* synthetic */ Extractor[] lambda$static$0() {
            return new Extractor[0];
        }
    }
}
