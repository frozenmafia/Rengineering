package o;

import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptor$ah$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class register implements ActivityResultLauncher {
    private final int ah$a;
    private final List<ApolloInterceptor> toString;

    public register(List<ApolloInterceptor> list) {
        this(list, 0);
    }

    private register(List<ApolloInterceptor> list, int i) {
        if (i > list.size()) {
            throw new IllegalArgumentException();
        }
        this.toString = new ArrayList((Collection) OnBackPressedDispatcherKt.values(list, "interceptors == null"));
        this.ah$a = i;
    }

    @Override // o.ActivityResultLauncher
    public void valueOf(ApolloInterceptor.toString tostring, Executor executor, ApolloInterceptor$ah$a apolloInterceptor$ah$a) {
        if (this.ah$a >= this.toString.size()) {
            throw new IllegalStateException();
        }
        this.toString.get(this.ah$a).ag$a(tostring, new register(this.toString, this.ah$a + 1), executor, apolloInterceptor$ah$a);
    }

    @Override // o.ActivityResultLauncher
    public void ah$a() {
        for (ApolloInterceptor apolloInterceptor : this.toString) {
            apolloInterceptor.values();
        }
    }
}
