package o;

import o.EmojiCompat;
/* loaded from: classes6.dex */
public final /* synthetic */ class setEmojiSpanIndicatorEnabled implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setEmojiSpanIndicatorEnabled values = new setEmojiSpanIndicatorEnabled();

    private /* synthetic */ setEmojiSpanIndicatorEnabled() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.getInitSettings((saveState) obj);
    }
}
