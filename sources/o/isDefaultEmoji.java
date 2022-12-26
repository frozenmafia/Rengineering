package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class isDefaultEmoji implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ isDefaultEmoji ah$a = new isDefaultEmoji();

    private /* synthetic */ isDefaultEmoji() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.HaptikSDK$a((saveState) obj);
    }
}
