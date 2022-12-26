package o;

import o.FragmentAnim;
/* loaded from: classes4.dex */
public interface addDisappearingFragmentView<T> {
    void onCancellation(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator);

    void onFailure(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator);

    void onNewResult(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator);

    void onProgressUpdate(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator);
}
