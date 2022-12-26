package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class addEmoji implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ addEmoji valueOf = new addEmoji();

    private /* synthetic */ addEmoji() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.onXdkEvent((saveState) obj);
    }
}
