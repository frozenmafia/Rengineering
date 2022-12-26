package o;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptor$ag$a;
import com.apollographql.apollo.interceptor.ApolloInterceptor$ah$a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class ActivityResultRegistry$ag$a implements ApolloInterceptor {
    volatile boolean ah$a;

    private ActivityResultRegistry$ag$a() {
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public void ag$a(final ApolloInterceptor.toString tostring, final ActivityResultLauncher activityResultLauncher, final Executor executor, final ApolloInterceptor$ah$a apolloInterceptor$ah$a) {
        activityResultLauncher.valueOf(tostring.values().valueOf(true).ah$a(), executor, new ApolloInterceptor$ah$a() { // from class: o.ActivityResultRegistry$ag$a.3
            @Override // com.apollographql.apollo.interceptor.ApolloInterceptor$ah$a
            public void toString(ApolloInterceptor$ag$a apolloInterceptor$ag$a) {
                apolloInterceptor$ah$a.toString(apolloInterceptor$ag$a);
            }

            @Override // com.apollographql.apollo.interceptor.ApolloInterceptor$ah$a
            public void valueOf(ApolloException apolloException) {
                if (ActivityResultRegistry$ag$a.this.ah$a) {
                    return;
                }
                activityResultLauncher.valueOf(tostring.values().valueOf(false).ah$a(), executor, apolloInterceptor$ah$a);
            }

            @Override // com.apollographql.apollo.interceptor.ApolloInterceptor$ah$a
            public void ah$a() {
                apolloInterceptor$ah$a.ah$a();
            }

            @Override // com.apollographql.apollo.interceptor.ApolloInterceptor$ah$a
            public void ah$a(ApolloInterceptor.FetchSourceType fetchSourceType) {
                apolloInterceptor$ah$a.ah$a(fetchSourceType);
            }
        });
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public void values() {
        this.ah$a = true;
    }
}
