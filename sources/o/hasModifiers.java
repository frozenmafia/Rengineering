package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class hasModifiers implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ hasModifiers toString = new hasModifiers();

    private /* synthetic */ hasModifiers() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.a((saveState) obj);
    }
}
