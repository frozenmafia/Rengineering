package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class getCodepointsLength implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getCodepointsLength values = new getCodepointsLength();

    private /* synthetic */ getCodepointsLength() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.onMessageChannelReady((saveState) obj);
    }
}
