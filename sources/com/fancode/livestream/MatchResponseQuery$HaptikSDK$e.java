package com.fancode.livestream;

import com.apollographql.apollo.api.ResponseField;
import java.util.Collections;
import o.OnBackPressedDispatcherKt;
import o.addCallback;
import o.hasEnabledCallbacks;
/* loaded from: classes4.dex */
public class MatchResponseQuery$HaptikSDK$e {
    static final ResponseField[] ag$a;
    private volatile transient boolean HaptikSDK$b;
    private volatile transient String HaptikSDK$c;
    final String ah$a;
    private volatile transient int toString;
    final String valueOf;
    final String values;

    static {
        ResponseField HaptikSDK$b;
        ResponseField HaptikSDK$b2;
        ResponseField HaptikSDK$b3;
        HaptikSDK$b = ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, Collections.emptyList());
        HaptikSDK$b2 = ResponseField.values.HaptikSDK$b("src", "src", null, false, Collections.emptyList());
        HaptikSDK$b3 = ResponseField.values.HaptikSDK$b("type", "type", null, true, Collections.emptyList());
        ag$a = new ResponseField[]{HaptikSDK$b, HaptikSDK$b2, HaptikSDK$b3};
    }

    public MatchResponseQuery$HaptikSDK$e(String str, String str2, String str3) {
        this.values = (String) OnBackPressedDispatcherKt.values(str, "__typename == null");
        this.ah$a = (String) OnBackPressedDispatcherKt.values(str2, "src == null");
        this.valueOf = str3;
    }

    public addCallback values() {
        return new addCallback() { // from class: com.fancode.livestream.MatchResponseQuery$HaptikSDK$e.1
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                hasenabledcallbacks.values(MatchResponseQuery$HaptikSDK$e.ag$a[0], MatchResponseQuery$HaptikSDK$e.this.values);
                hasenabledcallbacks.values(MatchResponseQuery$HaptikSDK$e.ag$a[1], MatchResponseQuery$HaptikSDK$e.this.ah$a);
                hasenabledcallbacks.values(MatchResponseQuery$HaptikSDK$e.ag$a[2], MatchResponseQuery$HaptikSDK$e.this.valueOf);
            }
        };
    }

    public String toString() {
        if (this.HaptikSDK$c == null) {
            this.HaptikSDK$c = "Logo{__typename=" + this.values + ", src=" + this.ah$a + ", type=" + this.valueOf + "}";
        }
        return this.HaptikSDK$c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MatchResponseQuery$HaptikSDK$e) {
            MatchResponseQuery$HaptikSDK$e matchResponseQuery$HaptikSDK$e = (MatchResponseQuery$HaptikSDK$e) obj;
            if (this.values.equals(matchResponseQuery$HaptikSDK$e.values) && this.ah$a.equals(matchResponseQuery$HaptikSDK$e.ah$a)) {
                String str = this.valueOf;
                String str2 = matchResponseQuery$HaptikSDK$e.valueOf;
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
        if (!this.HaptikSDK$b) {
            int hashCode = this.values.hashCode();
            int hashCode2 = this.ah$a.hashCode();
            String str = this.valueOf;
            this.toString = ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode());
            this.HaptikSDK$b = true;
        }
        return this.toString;
    }
}
