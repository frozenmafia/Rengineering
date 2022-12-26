package o;

import o.FragmentAnim;
/* loaded from: classes4.dex */
public class FragmentContainer {
    public static <T> FragmentAnim.AnimationOrAnimator<T> ag$a(Throwable th) {
        removeAllViewsInLayout ag$a = removeAllViewsInLayout.ag$a();
        ag$a.setFailure(th);
        return ag$a;
    }

    public static <T> onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> values(final Throwable th) {
        return new onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>>() { // from class: o.FragmentContainer.1
            @Override // o.onStartEnterTransition
            /* renamed from: valueOf */
            public FragmentAnim.AnimationOrAnimator<T> get() {
                return FragmentContainer.ag$a(th);
            }
        };
    }
}
