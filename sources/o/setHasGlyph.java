package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class setHasGlyph implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setHasGlyph ag$a = new setHasGlyph();

    private /* synthetic */ setHasGlyph() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.HaptikSDK$b((saveState) obj);
    }
}
