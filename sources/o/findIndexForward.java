package o;

import o.EmojiProcessor;
/* loaded from: classes4.dex */
public final /* synthetic */ class findIndexForward implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ findIndexForward toString = new findIndexForward();

    private /* synthetic */ findIndexForward() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        SupportSQLiteQuery ah$a;
        ah$a = EmojiProcessor.CodepointIndexFinder.ah$a((Throwable) obj);
        return ah$a;
    }
}
