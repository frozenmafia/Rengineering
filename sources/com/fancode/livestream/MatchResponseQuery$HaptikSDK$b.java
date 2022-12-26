package com.fancode.livestream;

import com.apollographql.apollo.api.ResponseField;
import com.fancode.livestream.type.VideoSessionErrors;
import java.util.Collections;
import o.OnBackPressedDispatcher;
import o.OnBackPressedDispatcherKt;
import o.addCallback;
import o.hasEnabledCallbacks;
import o.removeCancellable;
/* loaded from: classes4.dex */
public class MatchResponseQuery$HaptikSDK$b {
    static final ResponseField[] values;
    public final VideoSessionErrors ag$a;
    public final String ah$a;
    private volatile transient boolean ah$b;
    private volatile transient String invoke;
    private volatile transient int toString;
    final String valueOf;

    static {
        ResponseField HaptikSDK$b;
        ResponseField HaptikSDK$b2;
        ResponseField HaptikSDK$b3;
        HaptikSDK$b = ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, Collections.emptyList());
        HaptikSDK$b2 = ResponseField.values.HaptikSDK$b("maxSessionLimit", "maxSessionLimit", null, false, Collections.emptyList());
        HaptikSDK$b3 = ResponseField.values.HaptikSDK$b("sessionError", "sessionError", null, false, Collections.emptyList());
        values = new ResponseField[]{HaptikSDK$b, HaptikSDK$b2, HaptikSDK$b3};
    }

    public MatchResponseQuery$HaptikSDK$b(String str, String str2, VideoSessionErrors videoSessionErrors) {
        this.valueOf = (String) OnBackPressedDispatcherKt.values(str, "__typename == null");
        this.ah$a = (String) OnBackPressedDispatcherKt.values(str2, "maxSessionLimit == null");
        this.ag$a = (VideoSessionErrors) OnBackPressedDispatcherKt.values(videoSessionErrors, "sessionError == null");
    }

    public addCallback ag$a() {
        return new addCallback() { // from class: com.fancode.livestream.MatchResponseQuery$HaptikSDK$b.4
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                hasenabledcallbacks.values(MatchResponseQuery$HaptikSDK$b.values[0], MatchResponseQuery$HaptikSDK$b.this.valueOf);
                hasenabledcallbacks.values(MatchResponseQuery$HaptikSDK$b.values[1], MatchResponseQuery$HaptikSDK$b.this.ah$a);
                hasenabledcallbacks.values(MatchResponseQuery$HaptikSDK$b.values[2], MatchResponseQuery$HaptikSDK$b.this.ag$a.rawValue());
            }
        };
    }

    public String toString() {
        if (this.invoke == null) {
            this.invoke = "Error{__typename=" + this.valueOf + ", maxSessionLimit=" + this.ah$a + ", sessionError=" + this.ag$a + "}";
        }
        return this.invoke;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MatchResponseQuery$HaptikSDK$b) {
            MatchResponseQuery$HaptikSDK$b matchResponseQuery$HaptikSDK$b = (MatchResponseQuery$HaptikSDK$b) obj;
            return this.valueOf.equals(matchResponseQuery$HaptikSDK$b.valueOf) && this.ah$a.equals(matchResponseQuery$HaptikSDK$b.ah$a) && this.ag$a.equals(matchResponseQuery$HaptikSDK$b.ag$a);
        }
        return false;
    }

    public int hashCode() {
        if (!this.ah$b) {
            int hashCode = this.valueOf.hashCode();
            this.toString = ((((hashCode ^ 1000003) * 1000003) ^ this.ah$a.hashCode()) * 1000003) ^ this.ag$a.hashCode();
            this.ah$b = true;
        }
        return this.toString;
    }

    /* loaded from: classes4.dex */
    public static final class values implements OnBackPressedDispatcher<MatchResponseQuery$HaptikSDK$b> {
        @Override // o.OnBackPressedDispatcher
        /* renamed from: ag$a */
        public MatchResponseQuery$HaptikSDK$b map(removeCancellable removecancellable) {
            String ag$a = removecancellable.ag$a(MatchResponseQuery$HaptikSDK$b.values[0]);
            String ag$a2 = removecancellable.ag$a(MatchResponseQuery$HaptikSDK$b.values[1]);
            String ag$a3 = removecancellable.ag$a(MatchResponseQuery$HaptikSDK$b.values[2]);
            return new MatchResponseQuery$HaptikSDK$b(ag$a, ag$a2, ag$a3 != null ? VideoSessionErrors.safeValueOf(ag$a3) : null);
        }
    }
}
