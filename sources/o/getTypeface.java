package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class getTypeface implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getTypeface values = new getTypeface();

    private /* synthetic */ getTypeface() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.HaptikSDK$c((saveState) obj);
    }
}
