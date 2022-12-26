package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class getHasGlyph implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getHasGlyph values = new getHasGlyph();

    private /* synthetic */ getHasGlyph() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.ah$a((saveState) obj);
    }
}
