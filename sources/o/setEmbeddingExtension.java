package o;

import java.io.IOException;
import java.util.List;
import o.setEmbeddingExtension$ag$a;
import okhttp3.internal.http2.ErrorCode;
/* loaded from: classes5.dex */
public interface setEmbeddingExtension {
    public static final setEmbeddingExtension$ag$a valueOf = new setEmbeddingExtension$ag$a(null);
    public static final setEmbeddingExtension values = new setEmbeddingExtension$ag$a.valueOf();

    void ag$a(int i, ErrorCode errorCode);

    boolean ah$a(int i, List<setEmbeddingRules> list, boolean z);

    boolean toString(int i, parseSplitActivityRule parsesplitactivityrule, int i2, boolean z) throws IOException;

    boolean values(int i, List<setEmbeddingRules> list);
}
