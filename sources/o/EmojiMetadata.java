package o;

import o.EmojiCompat;
/* loaded from: classes4.dex */
public final /* synthetic */ class EmojiMetadata implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ EmojiMetadata values = new EmojiMetadata();

    /* loaded from: classes4.dex */
    public final /* synthetic */ class HasGlyph implements FrameworkSQLiteOpenHelperFactory {
        public static final /* synthetic */ HasGlyph toString = new HasGlyph();

        private /* synthetic */ HasGlyph() {
        }

        @Override // o.FrameworkSQLiteOpenHelperFactory
        public final Object apply(Object obj) {
            return EmojiCompat.Config.getSignupData((saveState) obj);
        }
    }

    private /* synthetic */ EmojiMetadata() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return EmojiCompat.Config.HaptikSDK$d((saveState) obj);
    }
}
