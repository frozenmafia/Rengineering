package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.ActivityResultLauncher;
import o.IntentSenderRequest;
import o.R;
import o.onStateChanged;
/* loaded from: classes.dex */
public interface ApolloInterceptor {

    /* loaded from: classes.dex */
    public enum FetchSourceType {
        CACHE,
        NETWORK
    }

    void ag$a(toString tostring, ActivityResultLauncher activityResultLauncher, Executor executor, ApolloInterceptor$ah$a apolloInterceptor$ah$a);

    void values();

    /* loaded from: classes.dex */
    public static final class toString {
        public final IntentSenderRequest.AnonymousClass1 HaptikSDK$a;
        public final boolean HaptikSDK$b;
        public final boolean HaptikSDK$c;
        public final onStateChanged ag$a;
        public final Optional<onStateChanged.values> ah$a;
        public final UUID ah$b = UUID.randomUUID();
        public final R.dimen toString;
        public final boolean valueOf;
        public final boolean values;

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString(onStateChanged onstatechanged, R.dimen dimenVar, IntentSenderRequest.AnonymousClass1 anonymousClass1, Optional<onStateChanged.values> optional, boolean z, boolean z2, boolean z3, boolean z4) {
            this.ag$a = onstatechanged;
            this.toString = dimenVar;
            this.HaptikSDK$a = anonymousClass1;
            this.ah$a = optional;
            this.valueOf = z;
            this.HaptikSDK$c = z2;
            this.HaptikSDK$b = z3;
            this.values = z4;
        }

        public ApolloInterceptor$toString$ag$a values() {
            return new ApolloInterceptor$toString$ag$a(this.ag$a).toString(this.toString).ah$a(this.HaptikSDK$a).valueOf(this.valueOf).ah$a(this.ah$a.orNull()).ah$a(this.HaptikSDK$c).values(this.HaptikSDK$b).toString(this.values);
        }

        public static ApolloInterceptor$toString$ag$a valueOf(onStateChanged onstatechanged) {
            return new ApolloInterceptor$toString$ag$a(onstatechanged);
        }
    }
}
