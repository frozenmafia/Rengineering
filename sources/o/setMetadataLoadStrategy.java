package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class setMetadataLoadStrategy implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setMetadataLoadStrategy ah$a = new setMetadataLoadStrategy();

    private /* synthetic */ setMetadataLoadStrategy() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.ak((saveState) obj);
    }
}
