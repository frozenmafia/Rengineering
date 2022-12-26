package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import o.runAnimators;
/* loaded from: classes6.dex */
final class EmptyEmbeddingComponent implements ActivityEmbeddingComponent {
    public void setEmbeddingRules(Set<androidx.window.extensions.embedding.EmbeddingRule> set) {
        runAnimators.ag$a(set, "splitRules");
    }

    public void setSplitInfoCallback(Consumer<List<androidx.window.extensions.embedding.SplitInfo>> consumer) {
        runAnimators.ag$a(consumer, "consumer");
    }
}
