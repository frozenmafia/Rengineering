package io.reactivex.internal.operators.flowable;

import o.FrameworkSQLiteOpenHelper;
import o.FrameworkSQLiteStatement;
import o.SlidingPaneLayout;
import o.getReadableSupportDatabase;
import o.getSidecarVersion;
/* loaded from: classes5.dex */
public final class FlowableInternalHelper {
    public static <T, S> FrameworkSQLiteOpenHelper<S, SlidingPaneLayout.SimplePanelSlideListener<T>, S> values(final getReadableSupportDatabase<S, SlidingPaneLayout.SimplePanelSlideListener<T>> getreadablesupportdatabase) {
        return new FrameworkSQLiteOpenHelper<S, SlidingPaneLayout.SimplePanelSlideListener<T>, S>(getreadablesupportdatabase) { // from class: io.reactivex.internal.operators.flowable.FlowableInternalHelper$ag$a
            final getReadableSupportDatabase<S, SlidingPaneLayout.SimplePanelSlideListener<T>> ag$a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ag$a = getreadablesupportdatabase;
            }

            @Override // o.FrameworkSQLiteOpenHelper
            /* renamed from: valueOf */
            public S apply(S s, SlidingPaneLayout.SimplePanelSlideListener<T> simplePanelSlideListener) throws Exception {
                this.ag$a.accept(s, simplePanelSlideListener);
                return s;
            }
        };
    }

    /* loaded from: classes5.dex */
    public enum RequestMax implements FrameworkSQLiteStatement<getSidecarVersion> {
        INSTANCE;

        @Override // o.FrameworkSQLiteStatement
        public void accept(getSidecarVersion getsidecarversion) throws Exception {
            getsidecarversion.request(Long.MAX_VALUE);
        }
    }
}
