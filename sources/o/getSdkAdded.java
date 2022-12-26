package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class getSdkAdded implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getSdkAdded values = new getSdkAdded();

    private /* synthetic */ getSdkAdded() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.ah$b((saveState) obj);
    }
}
