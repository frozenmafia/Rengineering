package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class setUseEmojiAsDefaultStyle implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setUseEmojiAsDefaultStyle valueOf = new setUseEmojiAsDefaultStyle();

    private /* synthetic */ setUseEmojiAsDefaultStyle() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.aj$a((saveState) obj);
    }
}
