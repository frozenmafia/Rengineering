package com.fancode.livestream;

import com.apollographql.apollo.api.ResponseField;
import java.util.Collections;
import o.OnBackPressedDispatcher;
import o.OnBackPressedDispatcherKt;
import o.addCallback;
import o.hasEnabledCallbacks;
import o.removeCancellable;
/* loaded from: classes4.dex */
public class MatchResponseQuery$ag$a {
    static final ResponseField[] valueOf;
    private volatile transient boolean HaptikSDK$a;
    private volatile transient String HaptikSDK$b;
    final String ag$a;
    final String ah$a;
    private volatile transient int toString;
    final String values;

    static {
        ResponseField HaptikSDK$b;
        ResponseField HaptikSDK$b2;
        ResponseField HaptikSDK$b3;
        HaptikSDK$b = ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, Collections.emptyList());
        HaptikSDK$b2 = ResponseField.values.HaptikSDK$b("src", "src", null, false, Collections.emptyList());
        HaptikSDK$b3 = ResponseField.values.HaptikSDK$b("type", "type", null, true, Collections.emptyList());
        valueOf = new ResponseField[]{HaptikSDK$b, HaptikSDK$b2, HaptikSDK$b3};
    }

    public MatchResponseQuery$ag$a(String str, String str2, String str3) {
        this.ag$a = (String) OnBackPressedDispatcherKt.values(str, "__typename == null");
        this.values = (String) OnBackPressedDispatcherKt.values(str2, "src == null");
        this.ah$a = str3;
    }

    public String ag$a() {
        return this.values;
    }

    public addCallback values() {
        return new addCallback() { // from class: com.fancode.livestream.MatchResponseQuery$ag$a.1
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                hasenabledcallbacks.values(MatchResponseQuery$ag$a.valueOf[0], MatchResponseQuery$ag$a.this.ag$a);
                hasenabledcallbacks.values(MatchResponseQuery$ag$a.valueOf[1], MatchResponseQuery$ag$a.this.values);
                hasenabledcallbacks.values(MatchResponseQuery$ag$a.valueOf[2], MatchResponseQuery$ag$a.this.ah$a);
            }
        };
    }

    public String toString() {
        if (this.HaptikSDK$b == null) {
            this.HaptikSDK$b = "BgImage{__typename=" + this.ag$a + ", src=" + this.values + ", type=" + this.ah$a + "}";
        }
        return this.HaptikSDK$b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MatchResponseQuery$ag$a) {
            MatchResponseQuery$ag$a matchResponseQuery$ag$a = (MatchResponseQuery$ag$a) obj;
            if (this.ag$a.equals(matchResponseQuery$ag$a.ag$a) && this.values.equals(matchResponseQuery$ag$a.values)) {
                String str = this.ah$a;
                String str2 = matchResponseQuery$ag$a.ah$a;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (!this.HaptikSDK$a) {
            int hashCode = this.ag$a.hashCode();
            int hashCode2 = this.values.hashCode();
            String str = this.ah$a;
            this.toString = ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode());
            this.HaptikSDK$a = true;
        }
        return this.toString;
    }

    /* loaded from: classes4.dex */
    public static final class values implements OnBackPressedDispatcher<MatchResponseQuery$ag$a> {
        @Override // o.OnBackPressedDispatcher
        /* renamed from: ag$a */
        public MatchResponseQuery$ag$a map(removeCancellable removecancellable) {
            return new MatchResponseQuery$ag$a(removecancellable.ag$a(MatchResponseQuery$ag$a.valueOf[0]), removecancellable.ag$a(MatchResponseQuery$ag$a.valueOf[1]), removecancellable.ag$a(MatchResponseQuery$ag$a.valueOf[2]));
        }
    }
}
