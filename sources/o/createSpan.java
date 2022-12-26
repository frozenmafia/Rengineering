package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class createSpan implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createSpan values = new createSpan();

    private /* synthetic */ createSpan() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.ag$a((saveState) obj);
    }
}
