package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class setEmojiSpanIndicatorColor implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setEmojiSpanIndicatorColor ag$a = new setEmojiSpanIndicatorColor();

    private /* synthetic */ setEmojiSpanIndicatorColor() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.values((saveState) obj);
    }
}
