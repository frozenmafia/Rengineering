package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class onInitialized implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ onInitialized ag$a = new onInitialized();

    private /* synthetic */ onInitialized() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.ak$a((saveState) obj);
    }
}
