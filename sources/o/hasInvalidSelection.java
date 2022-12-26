package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class hasInvalidSelection implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ hasInvalidSelection valueOf = new hasInvalidSelection();

    private /* synthetic */ hasInvalidSelection() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.invoke((saveState) obj);
    }
}
