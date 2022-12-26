package o;

import kotlin.TypeCastException;
import o.MediaBrowserCompat;
/* loaded from: classes6.dex */
public final class getRating {
    private static final MediaBrowserCompat.MediaBrowserImplApi26<Object> valueOf = new MediaBrowserCompat.MediaBrowserImplApi26<Object>() { // from class: o.getRating$ag$a
        @Override // o.isCaptioningEnabled
        /* renamed from: ag$a */
        public newSession<Object> toString(newSession<? extends Object> newsession, newSession<? extends Object> newsession2) {
            runAnimators.valueOf(newsession, "$this$plus");
            runAnimators.valueOf(newsession2, "b");
            return MediaBrowserCompat.MediaBrowserImplApi26.toString.valueOf(this, newsession, newsession2);
        }

        @Override // o.isCaptioningEnabled
        /* renamed from: ah$a */
        public newSession<Object> values(newSession<? extends Object> newsession, newSession<? extends Object> newsession2) {
            runAnimators.valueOf(newsession, "$this$maybeCombine");
            return MediaBrowserCompat.MediaBrowserImplApi26.toString.values(this, newsession, newsession2);
        }

        @Override // o.isCaptioningEnabled
        /* renamed from: toString */
        public newSession<Object> ah$a(newSession<? extends Object> newsession, newSession<? extends Object> newsession2) {
            runAnimators.valueOf(newsession, "$this$combine");
            runAnimators.valueOf(newsession2, "b");
            return MediaBrowserCompat.MediaBrowserImplApi26.toString.ah$a(this, newsession, newsession2);
        }
    };

    public static final MediaBrowserCompat.MediaBrowserImplApi26<Object> valueOf() {
        return valueOf;
    }

    public static final <A> newSession<A> ah$a(newSession<? extends A> newsession, newSession<? extends A> newsession2) {
        runAnimators.valueOf(newsession, "$this$plus");
        runAnimators.valueOf(newsession2, "arg1");
        newSession$ah$a newsession_ah_a = newSession.values;
        MediaBrowserCompat.MediaBrowserImplApi26<Object> valueOf2 = valueOf();
        if (valueOf2 != null) {
            Object mediaBrowserImplApi26 = valueOf2.toString(newsession, newsession2);
            if (mediaBrowserImplApi26 != null) {
                return (newSession) mediaBrowserImplApi26;
            }
            throw new TypeCastException("null cannot be cast to non-null type arrow.core.ListK<A>");
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.extensions.ListKSemigroup<A>");
    }
}
