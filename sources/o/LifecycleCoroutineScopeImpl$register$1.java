package o;

import com.apollographql.apollo.api.ResponseField;
import com.fancode.livestream.type.DAISDKType;
import java.util.Collections;
/* loaded from: classes4.dex */
public class LifecycleCoroutineScopeImpl$register$1 {
    static final ResponseField[] valueOf;
    private volatile transient boolean HaptikSDK$a;
    final String HaptikSDK$b;
    final String ag$a;
    final String ah$a;
    private volatile transient String ah$b;
    private volatile transient int invoke;
    final DAISDKType toString;
    final String values;

    static {
        ResponseField HaptikSDK$b;
        ResponseField HaptikSDK$b2;
        ResponseField HaptikSDK$b3;
        ResponseField HaptikSDK$b4;
        ResponseField HaptikSDK$b5;
        HaptikSDK$b = ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, Collections.emptyList());
        HaptikSDK$b2 = ResponseField.values.HaptikSDK$b("ssaiUrl", "ssaiUrl", null, true, Collections.emptyList());
        HaptikSDK$b3 = ResponseField.values.HaptikSDK$b("queryParams", "queryParams", null, true, Collections.emptyList());
        HaptikSDK$b4 = ResponseField.values.HaptikSDK$b("assetKey", "assetKey", null, true, Collections.emptyList());
        HaptikSDK$b5 = ResponseField.values.HaptikSDK$b("sdkType", "sdkType", null, true, Collections.emptyList());
        valueOf = new ResponseField[]{HaptikSDK$b, HaptikSDK$b2, HaptikSDK$b3, HaptikSDK$b4, HaptikSDK$b5};
    }

    public LifecycleCoroutineScopeImpl$register$1(String str, String str2, String str3, String str4, DAISDKType dAISDKType) {
        this.values = (String) OnBackPressedDispatcherKt.values(str, "__typename == null");
        this.HaptikSDK$b = str2;
        this.ah$a = str3;
        this.ag$a = str4;
        this.toString = dAISDKType;
    }

    public String HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public String valueOf() {
        return this.ah$a;
    }

    public String ag$a() {
        return this.ag$a;
    }

    public DAISDKType values() {
        return this.toString;
    }

    public addCallback ah$a() {
        return new addCallback() { // from class: o.LifecycleCoroutineScopeImpl$register$1.3
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                hasenabledcallbacks.values(LifecycleCoroutineScopeImpl$register$1.valueOf[0], LifecycleCoroutineScopeImpl$register$1.this.values);
                hasenabledcallbacks.values(LifecycleCoroutineScopeImpl$register$1.valueOf[1], LifecycleCoroutineScopeImpl$register$1.this.HaptikSDK$b);
                hasenabledcallbacks.values(LifecycleCoroutineScopeImpl$register$1.valueOf[2], LifecycleCoroutineScopeImpl$register$1.this.ah$a);
                hasenabledcallbacks.values(LifecycleCoroutineScopeImpl$register$1.valueOf[3], LifecycleCoroutineScopeImpl$register$1.this.ag$a);
                hasenabledcallbacks.values(LifecycleCoroutineScopeImpl$register$1.valueOf[4], LifecycleCoroutineScopeImpl$register$1.this.toString != null ? LifecycleCoroutineScopeImpl$register$1.this.toString.rawValue() : null);
            }
        };
    }

    public String toString() {
        if (this.ah$b == null) {
            this.ah$b = "GoogleDai{__typename=" + this.values + ", ssaiUrl=" + this.HaptikSDK$b + ", queryParams=" + this.ah$a + ", assetKey=" + this.ag$a + ", sdkType=" + this.toString + "}";
        }
        return this.ah$b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCoroutineScopeImpl$register$1) {
            LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = (LifecycleCoroutineScopeImpl$register$1) obj;
            if (this.values.equals(lifecycleCoroutineScopeImpl$register$1.values) && ((str = this.HaptikSDK$b) != null ? str.equals(lifecycleCoroutineScopeImpl$register$1.HaptikSDK$b) : lifecycleCoroutineScopeImpl$register$1.HaptikSDK$b == null) && ((str2 = this.ah$a) != null ? str2.equals(lifecycleCoroutineScopeImpl$register$1.ah$a) : lifecycleCoroutineScopeImpl$register$1.ah$a == null) && ((str3 = this.ag$a) != null ? str3.equals(lifecycleCoroutineScopeImpl$register$1.ag$a) : lifecycleCoroutineScopeImpl$register$1.ag$a == null)) {
                DAISDKType dAISDKType = this.toString;
                DAISDKType dAISDKType2 = lifecycleCoroutineScopeImpl$register$1.toString;
                if (dAISDKType == null) {
                    if (dAISDKType2 == null) {
                        return true;
                    }
                } else if (dAISDKType.equals(dAISDKType2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (!this.HaptikSDK$a) {
            int hashCode = this.values.hashCode();
            String str = this.HaptikSDK$b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.ah$a;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.ag$a;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            DAISDKType dAISDKType = this.toString;
            this.invoke = ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (dAISDKType != null ? dAISDKType.hashCode() : 0);
            this.HaptikSDK$a = true;
        }
        return this.invoke;
    }

    /* loaded from: classes4.dex */
    public static final class valueOf implements OnBackPressedDispatcher<LifecycleCoroutineScopeImpl$register$1> {
        @Override // o.OnBackPressedDispatcher
        /* renamed from: values */
        public LifecycleCoroutineScopeImpl$register$1 map(removeCancellable removecancellable) {
            String ag$a = removecancellable.ag$a(LifecycleCoroutineScopeImpl$register$1.valueOf[0]);
            String ag$a2 = removecancellable.ag$a(LifecycleCoroutineScopeImpl$register$1.valueOf[1]);
            String ag$a3 = removecancellable.ag$a(LifecycleCoroutineScopeImpl$register$1.valueOf[2]);
            String ag$a4 = removecancellable.ag$a(LifecycleCoroutineScopeImpl$register$1.valueOf[3]);
            String ag$a5 = removecancellable.ag$a(LifecycleCoroutineScopeImpl$register$1.valueOf[4]);
            return new LifecycleCoroutineScopeImpl$register$1(ag$a, ag$a2, ag$a3, ag$a4, ag$a5 != null ? DAISDKType.safeValueOf(ag$a5) : null);
        }
    }
}
