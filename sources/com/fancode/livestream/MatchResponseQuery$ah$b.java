package com.fancode.livestream;

import com.apollographql.apollo.api.ResponseField;
import com.fancode.livestream.MatchResponseQuery$ah$b$ag$a;
import java.util.Collections;
import o.OnBackPressedDispatcher;
import o.OnBackPressedDispatcherKt;
import o.addCallback;
import o.hasEnabledCallbacks;
import o.removeCancellable;
/* loaded from: classes4.dex */
public class MatchResponseQuery$ah$b {
    static final ResponseField[] ag$a;
    private volatile transient String ah$a;
    private final MatchResponseQuery$ah$b$ag$a invoke;
    final String toString;
    private volatile transient int valueOf;
    private volatile transient boolean values;

    static {
        ResponseField HaptikSDK$b;
        ResponseField HaptikSDK$b2;
        HaptikSDK$b = ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, Collections.emptyList());
        HaptikSDK$b2 = ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, Collections.emptyList());
        ag$a = new ResponseField[]{HaptikSDK$b, HaptikSDK$b2};
    }

    public MatchResponseQuery$ah$b(String str, MatchResponseQuery$ah$b$ag$a matchResponseQuery$ah$b$ag$a) {
        this.toString = (String) OnBackPressedDispatcherKt.values(str, "__typename == null");
        this.invoke = (MatchResponseQuery$ah$b$ag$a) OnBackPressedDispatcherKt.values(matchResponseQuery$ah$b$ag$a, "fragments == null");
    }

    public addCallback ah$a() {
        return new addCallback() { // from class: com.fancode.livestream.MatchResponseQuery$ah$b.1
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                hasenabledcallbacks.values(MatchResponseQuery$ah$b.ag$a[0], MatchResponseQuery$ah$b.this.toString);
                MatchResponseQuery$ah$b.this.invoke.ah$a().marshal(hasenabledcallbacks);
            }
        };
    }

    public String toString() {
        if (this.ah$a == null) {
            this.ah$a = "ExtraData1{__typename=" + this.toString + ", fragments=" + this.invoke + "}";
        }
        return this.ah$a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MatchResponseQuery$ah$b) {
            MatchResponseQuery$ah$b matchResponseQuery$ah$b = (MatchResponseQuery$ah$b) obj;
            return this.toString.equals(matchResponseQuery$ah$b.toString) && this.invoke.equals(matchResponseQuery$ah$b.invoke);
        }
        return false;
    }

    public int hashCode() {
        if (!this.values) {
            this.valueOf = ((this.toString.hashCode() ^ 1000003) * 1000003) ^ this.invoke.hashCode();
            this.values = true;
        }
        return this.valueOf;
    }

    /* loaded from: classes4.dex */
    public static final class valueOf implements OnBackPressedDispatcher<MatchResponseQuery$ah$b> {
        final MatchResponseQuery$ah$b$ag$a.values values = new MatchResponseQuery$ah$b$ag$a.values();

        @Override // o.OnBackPressedDispatcher
        /* renamed from: toString */
        public MatchResponseQuery$ah$b map(removeCancellable removecancellable) {
            return new MatchResponseQuery$ah$b(removecancellable.ag$a(MatchResponseQuery$ah$b.ag$a[0]), this.values.map(removecancellable));
        }
    }
}
