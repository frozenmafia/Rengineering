package o;

import com.app.dream11.core.service.graphql.api.Social.NetworkInMatchQuery;
import java.util.ArrayList;
import o.AnimatedStateListDrawableCompat;
/* loaded from: classes2.dex */
public final /* synthetic */ class generateTransitionKey implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ generateTransitionKey valueOf = new generateTransitionKey();

    private /* synthetic */ generateTransitionKey() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        ArrayList animatedStateListState;
        animatedStateListState = AnimatedStateListDrawableCompat.AnimatedStateListState.toString((NetworkInMatchQuery.NetworkInMatch) obj);
        return animatedStateListState;
    }
}
