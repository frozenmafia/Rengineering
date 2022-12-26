package o;

import o.ICustomTabsCallback;
import o.MediaBrowserCompat;
import o.Styleable;
/* loaded from: classes6.dex */
public final class getBitmap {
    private static final MediaBrowserCompat.CallbackHandler ag$a = new MediaBrowserCompat.CallbackHandler() { // from class: o.getBitmap$ag$a
        @Override // o.RatingCompat.Api19Impl
        /* renamed from: ag$a */
        public <A, B> asBinder<B> ah$a(ICustomTabsCallback.Default<Object, ? extends A> r2, ICustomTabsCallback.Default<Object, ? extends Styleable.ChangeBounds<? super A, ? extends B>> r3) {
            runAnimators.valueOf(r2, "$this$ap");
            runAnimators.valueOf(r3, "ff");
            return MediaBrowserCompat$CallbackHandler$ag$a.valueOf((MediaBrowserCompat.CallbackHandler) this, (ICustomTabsCallback.Default) r2, (ICustomTabsCallback.Default) r3);
        }

        @Override // o.RatingCompat.Api19Impl
        public <A, B> asBinder<ICustomTabsCallback.Default<Object, B>> ag$a(ICustomTabsCallback.Default<Object, ? extends A> r2, asBinder<? extends ICustomTabsCallback.Default<Object, ? extends Styleable.ChangeBounds<? super A, ? extends B>>> asbinder) {
            runAnimators.valueOf(r2, "$this$apEval");
            runAnimators.valueOf(asbinder, "ff");
            return MediaBrowserCompat$CallbackHandler$ag$a.valueOf((MediaBrowserCompat.CallbackHandler) this, (ICustomTabsCallback.Default) r2, (asBinder) asbinder);
        }

        @Override // o.onSessionReady
        public <A, B> ICustomTabsCallback.Default<Object, cancel<A, B>> fproduct(ICustomTabsCallback.Default<Object, ? extends A> r2, Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
            runAnimators.valueOf(r2, "$this$fproduct");
            runAnimators.valueOf(changeBounds, "f");
            return MediaBrowserCompat$CallbackHandler$ag$a.toString(this, r2, changeBounds);
        }

        @Override // o.onSessionReady
        public <A, B> ICustomTabsCallback.Default<Object, B> imap(ICustomTabsCallback.Default<Object, ? extends A> r2, Styleable.ChangeBounds<? super A, ? extends B> changeBounds, Styleable.ChangeBounds<? super B, ? extends A> changeBounds2) {
            runAnimators.valueOf(r2, "$this$imap");
            runAnimators.valueOf(changeBounds, "f");
            runAnimators.valueOf(changeBounds2, "g");
            return MediaBrowserCompat$CallbackHandler$ag$a.values(this, r2, changeBounds, changeBounds2);
        }

        @Override // o.onSessionReady
        public <A, B> Styleable.ChangeBounds<ICustomTabsCallback.Default<Object, ? extends A>, ICustomTabsCallback.Default<Object, B>> lift(Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
            runAnimators.valueOf(changeBounds, "f");
            return MediaBrowserCompat$CallbackHandler$ag$a.valueOf(this, changeBounds);
        }

        @Override // o.onSessionReady
        public <A, B> ICustomTabsCallback.Default<Object, A> mapConst(A a, ICustomTabsCallback.Default<Object, ? extends B> r3) {
            runAnimators.valueOf(r3, "fb");
            return MediaBrowserCompat$CallbackHandler$ag$a.ag$a(this, a, r3);
        }

        @Override // o.onSessionReady
        public <A, B> ICustomTabsCallback.Default<Object, B> mapConst(ICustomTabsCallback.Default<Object, ? extends A> r2, B b2) {
            runAnimators.valueOf(r2, "$this$mapConst");
            return MediaBrowserCompat$CallbackHandler$ag$a.valueOf(this, r2, b2);
        }

        @Override // o.onSessionReady
        public <A, B> ICustomTabsCallback.Default<Object, cancel<B, A>> tupleLeft(ICustomTabsCallback.Default<Object, ? extends A> r2, B b2) {
            runAnimators.valueOf(r2, "$this$tupleLeft");
            return MediaBrowserCompat$CallbackHandler$ag$a.ah$a(this, r2, b2);
        }

        @Override // o.onSessionReady
        public <A, B> ICustomTabsCallback.Default<Object, cancel<A, B>> tupleRight(ICustomTabsCallback.Default<Object, ? extends A> r2, B b2) {
            runAnimators.valueOf(r2, "$this$tupleRight");
            return MediaBrowserCompat$CallbackHandler$ag$a.values(this, r2, b2);
        }

        @Override // o.onSessionReady
        public <A> ICustomTabsCallback.Default<Object, setAnimationMatrix> unit(ICustomTabsCallback.Default<Object, ? extends A> r2) {
            runAnimators.valueOf(r2, "$this$unit");
            return MediaBrowserCompat$CallbackHandler$ag$a.valueOf(this, r2);
        }

        @Override // o.getRatingStyle
        /* renamed from: valueOf */
        public <A> asBinder<A> values(A a) {
            return MediaBrowserCompat$CallbackHandler$ag$a.toString(this, a);
        }

        @Override // o.getRatingStyle, o.onSessionReady
        /* renamed from: values */
        public <A, B> asBinder<B> map(ICustomTabsCallback.Default<Object, ? extends A> r2, Styleable.ChangeBounds<? super A, ? extends B> changeBounds) {
            runAnimators.valueOf(r2, "$this$map");
            runAnimators.valueOf(changeBounds, "f");
            return MediaBrowserCompat$CallbackHandler$ag$a.ah$a((MediaBrowserCompat.CallbackHandler) this, (ICustomTabsCallback.Default) r2, (Styleable.ChangeBounds) changeBounds);
        }

        @Override // o.onSessionReady
        /* renamed from: void */
        public <A> ICustomTabsCallback.Default<Object, setAnimationMatrix> mo67void(ICustomTabsCallback.Default<Object, ? extends A> r2) {
            runAnimators.valueOf(r2, "$this$void");
            return MediaBrowserCompat$CallbackHandler$ag$a.ag$a(this, r2);
        }

        @Override // o.onSessionReady
        public <B, A extends B> ICustomTabsCallback.Default<Object, B> widen(ICustomTabsCallback.Default<Object, ? extends A> r2) {
            runAnimators.valueOf(r2, "$this$widen");
            return MediaBrowserCompat$CallbackHandler$ag$a.ah$a(this, r2);
        }
    };
}
