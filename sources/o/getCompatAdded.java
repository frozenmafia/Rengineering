package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class getCompatAdded implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getCompatAdded ag$a = new getCompatAdded();

    private /* synthetic */ getCompatAdded() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.ICustomTabsCallback$Default((saveState) obj);
    }
}
