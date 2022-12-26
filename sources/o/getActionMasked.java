package o;

import android.animation.Animator;
import kotlin.random.Random;
/* loaded from: classes3.dex */
public final class getActionMasked implements Animator.AnimatorListener {
    public final /* synthetic */ androidx.emoji.widget.EmojiTextView ah$a;

    public getActionMasked(androidx.emoji.widget.EmojiTextView emojiTextView) {
        this.ah$a = emojiTextView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        float nextDouble = (float) Random.Default.nextDouble(1.0d, 3.0d);
        this.ah$a.setScaleX(nextDouble);
        this.ah$a.setScaleY(nextDouble);
        this.ah$a.setVisibility(0);
    }
}
