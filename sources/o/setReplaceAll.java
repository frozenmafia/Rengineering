package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class setReplaceAll implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setReplaceAll values = new setReplaceAll();

    private /* synthetic */ setReplaceAll() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.toString((saveState) obj);
    }
}
