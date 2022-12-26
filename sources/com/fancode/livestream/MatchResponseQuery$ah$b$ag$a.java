package com.fancode.livestream;

import com.apollographql.apollo.api.ResponseField;
import java.util.Arrays;
import o.LifecycleCoroutineScopeImpl$register$1;
import o.OnBackPressedDispatcher;
import o.addCallback;
import o.hasEnabledCallbacks;
import o.removeCancellable;
/* loaded from: classes4.dex */
public class MatchResponseQuery$ah$b$ag$a {
    private volatile transient boolean ag$a;
    final LifecycleCoroutineScopeImpl$register$1 toString;
    private volatile transient String valueOf;
    private volatile transient int values;

    public MatchResponseQuery$ah$b$ag$a(LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1) {
        this.toString = lifecycleCoroutineScopeImpl$register$1;
    }

    public addCallback ah$a() {
        return new addCallback() { // from class: com.fancode.livestream.MatchResponseQuery$ah$b$ag$a.1
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = MatchResponseQuery$ah$b$ag$a.this.toString;
                if (lifecycleCoroutineScopeImpl$register$1 != null) {
                    hasenabledcallbacks.toString(lifecycleCoroutineScopeImpl$register$1.ah$a());
                }
            }
        };
    }

    public String toString() {
        if (this.valueOf == null) {
            this.valueOf = "Fragments{googleDai=" + this.toString + "}";
        }
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MatchResponseQuery$ah$b$ag$a) {
            LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = this.toString;
            LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$12 = ((MatchResponseQuery$ah$b$ag$a) obj).toString;
            return lifecycleCoroutineScopeImpl$register$1 == null ? lifecycleCoroutineScopeImpl$register$12 == null : lifecycleCoroutineScopeImpl$register$1.equals(lifecycleCoroutineScopeImpl$register$12);
        }
        return false;
    }

    public int hashCode() {
        if (!this.ag$a) {
            LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = this.toString;
            this.values = (lifecycleCoroutineScopeImpl$register$1 == null ? 0 : lifecycleCoroutineScopeImpl$register$1.hashCode()) ^ 1000003;
            this.ag$a = true;
        }
        return this.values;
    }

    /* loaded from: classes4.dex */
    public static final class values implements OnBackPressedDispatcher<MatchResponseQuery$ah$b$ag$a> {
        static final ResponseField[] values;
        final LifecycleCoroutineScopeImpl$register$1.valueOf ag$a = new LifecycleCoroutineScopeImpl$register$1.valueOf();

        static {
            ResponseField tostring;
            tostring = ResponseField.values.toString("__typename", "__typename", Arrays.asList(ResponseField.values.valueOf(new String[]{"Dai"})));
            values = new ResponseField[]{tostring};
        }

        @Override // o.OnBackPressedDispatcher
        /* renamed from: ag$a */
        public MatchResponseQuery$ah$b$ag$a map(removeCancellable removecancellable) {
            return new MatchResponseQuery$ah$b$ag$a((LifecycleCoroutineScopeImpl$register$1) removecancellable.ag$a(values[0], new removeCancellable.toString<LifecycleCoroutineScopeImpl$register$1>() { // from class: com.fancode.livestream.MatchResponseQuery.ah.b.ag.a.values.5
                @Override // o.removeCancellable.toString
                /* renamed from: toString */
                public LifecycleCoroutineScopeImpl$register$1 values(removeCancellable removecancellable2) {
                    return values.this.ag$a.map(removecancellable2);
                }
            }));
        }
    }
}
