package o;

import com.fancode.livestream.type.DRMProvider;
import com.fancode.livestream.type.SSAIProvider;
import java.io.IOException;
import o.ComponentActivity;
/* loaded from: classes4.dex */
public final class backwardPass implements ComponentActivity.AnonymousClass6 {
    private final SSAIProvider HaptikSDK$a;
    private final ComponentActivity.AnonymousClass5<String> HaptikSDK$b;
    private final ComponentActivity.AnonymousClass5<String> HaptikSDK$c;
    private final ComponentActivity.AnonymousClass5<String> ag$a;
    private final ComponentActivity.AnonymousClass5<String> ah$a;
    private final DRMProvider invoke;
    private volatile transient boolean toString;
    private final ComponentActivity.AnonymousClass5<String> valueOf;
    private volatile transient int values;

    backwardPass(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, DRMProvider dRMProvider, SSAIProvider sSAIProvider, ComponentActivity.AnonymousClass5<String> anonymousClass55) {
        this.HaptikSDK$b = anonymousClass5;
        this.ah$a = anonymousClass52;
        this.ag$a = anonymousClass53;
        this.valueOf = anonymousClass54;
        this.invoke = dRMProvider;
        this.HaptikSDK$a = sSAIProvider;
        this.HaptikSDK$c = anonymousClass55;
    }

    public static toString values() {
        return new toString();
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        return new remove() { // from class: o.backwardPass.1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) throws IOException {
                if (backwardPass.this.HaptikSDK$b.valueOf) {
                    onBackPressedCallback.ah$a("url", (String) backwardPass.this.HaptikSDK$b.values);
                }
                if (backwardPass.this.ah$a.valueOf) {
                    onBackPressedCallback.ah$a("cslSessionId", (String) backwardPass.this.ah$a.values);
                }
                if (backwardPass.this.ag$a.valueOf) {
                    onBackPressedCallback.ah$a("daiAssetKey", (String) backwardPass.this.ag$a.values);
                }
                if (backwardPass.this.valueOf.valueOf) {
                    onBackPressedCallback.ah$a("daiQueryParams", (String) backwardPass.this.valueOf.values);
                }
                onBackPressedCallback.ah$a("drmProvider", backwardPass.this.invoke.rawValue());
                onBackPressedCallback.ah$a("ssaiProvider", backwardPass.this.HaptikSDK$a.rawValue());
                if (backwardPass.this.HaptikSDK$c.valueOf) {
                    onBackPressedCallback.ah$a("playerErrorCode", (String) backwardPass.this.HaptikSDK$c.values);
                }
            }
        };
    }

    public int hashCode() {
        if (!this.toString) {
            int hashCode = this.HaptikSDK$b.hashCode();
            int hashCode2 = this.ah$a.hashCode();
            int hashCode3 = this.ag$a.hashCode();
            int hashCode4 = this.valueOf.hashCode();
            int hashCode5 = this.invoke.hashCode();
            this.values = ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ this.HaptikSDK$a.hashCode()) * 1000003) ^ this.HaptikSDK$c.hashCode();
            this.toString = true;
        }
        return this.values;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof backwardPass) {
            backwardPass backwardpass = (backwardPass) obj;
            return this.HaptikSDK$b.equals(backwardpass.HaptikSDK$b) && this.ah$a.equals(backwardpass.ah$a) && this.ag$a.equals(backwardpass.ag$a) && this.valueOf.equals(backwardpass.valueOf) && this.invoke.equals(backwardpass.invoke) && this.HaptikSDK$a.equals(backwardpass.HaptikSDK$a) && this.HaptikSDK$c.equals(backwardpass.HaptikSDK$c);
        }
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        private SSAIProvider HaptikSDK$a;
        private ComponentActivity.AnonymousClass5<String> HaptikSDK$c;
        private ComponentActivity.AnonymousClass5<String> ag$a;
        private ComponentActivity.AnonymousClass5<String> ah$a;
        private DRMProvider toString;
        private ComponentActivity.AnonymousClass5<String> valueOf;
        private ComponentActivity.AnonymousClass5<String> values;

        toString() {
            ComponentActivity.AnonymousClass5<String> ag$a;
            ComponentActivity.AnonymousClass5<String> ag$a2;
            ComponentActivity.AnonymousClass5<String> ag$a3;
            ComponentActivity.AnonymousClass5<String> ag$a4;
            ComponentActivity.AnonymousClass5<String> ag$a5;
            ag$a = ComponentActivity.AnonymousClass5.ag$a.ag$a();
            this.HaptikSDK$c = ag$a;
            ag$a2 = ComponentActivity.AnonymousClass5.ag$a.ag$a();
            this.ah$a = ag$a2;
            ag$a3 = ComponentActivity.AnonymousClass5.ag$a.ag$a();
            this.ag$a = ag$a3;
            ag$a4 = ComponentActivity.AnonymousClass5.ag$a.ag$a();
            this.values = ag$a4;
            ag$a5 = ComponentActivity.AnonymousClass5.ag$a.ag$a();
            this.valueOf = ag$a5;
        }

        public toString ag$a(String str) {
            this.HaptikSDK$c = ComponentActivity.AnonymousClass5.toString(str);
            return this;
        }

        public toString values(String str) {
            this.ah$a = ComponentActivity.AnonymousClass5.toString(str);
            return this;
        }

        public toString ag$a(DRMProvider dRMProvider) {
            this.toString = dRMProvider;
            return this;
        }

        public toString toString(SSAIProvider sSAIProvider) {
            this.HaptikSDK$a = sSAIProvider;
            return this;
        }

        public toString valueOf(String str) {
            this.valueOf = ComponentActivity.AnonymousClass5.toString(str);
            return this;
        }

        public backwardPass ah$a() {
            OnBackPressedDispatcherKt.values(this.toString, "drmProvider == null");
            OnBackPressedDispatcherKt.values(this.HaptikSDK$a, "ssaiProvider == null");
            return new backwardPass(this.HaptikSDK$c, this.ah$a, this.ag$a, this.values, this.toString, this.HaptikSDK$a, this.valueOf);
        }
    }
}
