package o;

import o.Styleable;
/* loaded from: classes5.dex */
final class completeScroll extends dispatchOnPageSelected {
    public static final completeScroll valueOf = new completeScroll();
    private static final valueOf ag$a = new valueOf();

    /* loaded from: classes5.dex */
    public static final class valueOf extends ClassValue<Styleable.ChangeBounds<? super Throwable, ? extends Throwable>> {
        valueOf() {
        }
    }

    private completeScroll() {
    }

    @Override // o.dispatchOnPageSelected
    public Styleable.ChangeBounds<Throwable, Throwable> ah$a(Class<? extends Throwable> cls) {
        return (Styleable.ChangeBounds) ag$a.get(cls);
    }
}
