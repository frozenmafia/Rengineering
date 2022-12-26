package o;

import com.fancode.livestream.type.SSAIProvider;
import java.io.IOException;
import java.util.List;
import o.ComponentActivity;
import o.OnBackPressedCallback;
/* loaded from: classes4.dex */
public final class LifecycleOwner implements ComponentActivity.AnonymousClass6 {
    private volatile transient int ag$a;
    private final ComponentActivity.AnonymousClass5<List<SSAIProvider>> ah$a;
    private volatile transient boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleOwner(ComponentActivity.AnonymousClass5<List<SSAIProvider>> anonymousClass5) {
        this.ah$a = anonymousClass5;
    }

    public static LifecycleOwner$ah$a valueOf() {
        return new LifecycleOwner$ah$a();
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        return new remove() { // from class: o.LifecycleOwner.1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) throws IOException {
                if (LifecycleOwner.this.ah$a.valueOf) {
                    onBackPressedCallback.ag$a("providers", LifecycleOwner.this.ah$a.values != 0 ? new OnBackPressedCallback.toString() { // from class: o.LifecycleOwner.1.1
                        @Override // o.OnBackPressedCallback.toString
                        public void write(OnBackPressedCallback.values valuesVar) throws IOException {
                            for (SSAIProvider sSAIProvider : (List) LifecycleOwner.this.ah$a.values) {
                                valuesVar.values(sSAIProvider != null ? sSAIProvider.rawValue() : null);
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public int hashCode() {
        if (!this.values) {
            this.ag$a = this.ah$a.hashCode() ^ 1000003;
            this.values = true;
        }
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleOwner) {
            return this.ah$a.equals(((LifecycleOwner) obj).ah$a);
        }
        return false;
    }
}
