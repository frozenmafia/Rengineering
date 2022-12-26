package o;

import java.io.IOException;
import o.ComponentActivity;
/* loaded from: classes4.dex */
public final class LifecycleKt implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> ag$a;
    private volatile transient boolean ah$a;
    private final String toString;
    private final String valueOf;
    private volatile transient int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleKt(String str, String str2, ComponentActivity.AnonymousClass5<String> anonymousClass5) {
        this.valueOf = str;
        this.toString = str2;
        this.ag$a = anonymousClass5;
    }

    public static LifecycleKt$ag$a ag$a() {
        return new LifecycleKt$ag$a();
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        return new remove() { // from class: o.LifecycleKt.4
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) throws IOException {
                onBackPressedCallback.ah$a("url", LifecycleKt.this.valueOf);
                onBackPressedCallback.ah$a("responseHeaders", LifecycleKt.this.toString);
                if (LifecycleKt.this.ag$a.valueOf) {
                    onBackPressedCallback.ah$a("responseCode", (String) LifecycleKt.this.ag$a.values);
                }
            }
        };
    }

    public int hashCode() {
        if (!this.ah$a) {
            int hashCode = this.valueOf.hashCode();
            this.values = ((((hashCode ^ 1000003) * 1000003) ^ this.toString.hashCode()) * 1000003) ^ this.ag$a.hashCode();
            this.ah$a = true;
        }
        return this.values;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleKt) {
            LifecycleKt lifecycleKt = (LifecycleKt) obj;
            return this.valueOf.equals(lifecycleKt.valueOf) && this.toString.equals(lifecycleKt.toString) && this.ag$a.equals(lifecycleKt.ag$a);
        }
        return false;
    }
}
