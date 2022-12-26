package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class getMetadataItem implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getMetadataItem ah$a = new getMetadataItem();

    private /* synthetic */ getMetadataItem() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.getDefaultImpl((saveState) obj);
    }
}
