package androidx.window.embedding;

import java.util.List;
import java.util.Set;
/* loaded from: classes6.dex */
public interface EmbeddingInterfaceCompat {

    /* loaded from: classes6.dex */
    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(List<SplitInfo> list);
    }

    void setEmbeddingCallback(EmbeddingCallbackInterface embeddingCallbackInterface);

    void setSplitRules(Set<? extends EmbeddingRule> set);
}
