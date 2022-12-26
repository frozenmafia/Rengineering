package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class getCodepointAt implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getCodepointAt toString = new getCodepointAt();

    private /* synthetic */ getCodepointAt() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.valueOf((saveState) obj);
    }
}
