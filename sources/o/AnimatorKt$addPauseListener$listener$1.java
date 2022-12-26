package o;

import com.app.dream11.core.service.graphql.api.SaveQuickCheckV2Mutation;
/* loaded from: classes6.dex */
public final /* synthetic */ class AnimatorKt$addPauseListener$listener$1 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ AnimatorKt$addPauseListener$listener$1 values = new AnimatorKt$addPauseListener$listener$1();

    private /* synthetic */ AnimatorKt$addPauseListener$listener$1() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean valueOf;
        valueOf = Boolean.valueOf(((SaveQuickCheckV2Mutation.Data) obj).getSaveQuickCheckV2().getSuccess());
        return valueOf;
    }
}
