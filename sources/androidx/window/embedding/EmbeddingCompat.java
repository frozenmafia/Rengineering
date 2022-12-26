package androidx.window.embedding;

import android.util.Log;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    private final EmbeddingAdapter adapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    public EmbeddingCompat(ActivityEmbeddingComponent activityEmbeddingComponent, EmbeddingAdapter embeddingAdapter) {
        runAnimators.ag$a(activityEmbeddingComponent, "embeddingExtension");
        runAnimators.ag$a(embeddingAdapter, "adapter");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
    }

    public EmbeddingCompat() {
        this(Companion.embeddingComponent(), new EmbeddingAdapter());
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(Set<? extends EmbeddingRule> set) {
        runAnimators.ag$a(set, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(set));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        runAnimators.ag$a(embeddingCallbackInterface, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new EmbeddingTranslatingCallback(embeddingCallbackInterface, this.adapter));
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final Integer getExtensionApiLevel() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                Log.d(EmbeddingCompat.TAG, "Embedding extension version not found");
                return null;
            } catch (UnsupportedOperationException unused2) {
                Log.d(EmbeddingCompat.TAG, "Stub Extension");
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            try {
            } catch (NoClassDefFoundError unused) {
                Log.d(EmbeddingCompat.TAG, "Embedding extension version not found");
            } catch (UnsupportedOperationException unused2) {
                Log.d(EmbeddingCompat.TAG, "Stub Extension");
            }
            return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            if (isEmbeddingAvailable()) {
                ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                return activityEmbeddingComponent == null ? new EmptyEmbeddingComponent() : activityEmbeddingComponent;
            }
            return new EmptyEmbeddingComponent();
        }
    }
}
