package o;

import o.EmojiProcessor;
/* loaded from: classes4.dex */
public final /* synthetic */ class findIndexBackward implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ findIndexBackward ag$a = new findIndexBackward();

    private /* synthetic */ findIndexBackward() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        noBackupDirectory codepointIndexFinder;
        codepointIndexFinder = EmojiProcessor.CodepointIndexFinder.toString((saveState) obj);
        return codepointIndexFinder;
    }
}
