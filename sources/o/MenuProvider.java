package o;

import android.animation.Animator;
/* loaded from: classes3.dex */
public final class MenuProvider implements Animator.AnimatorListener {
    public final /* synthetic */ float ag$a;
    public final /* synthetic */ androidx.emoji.widget.EmojiTextView valueOf;

    public MenuProvider(androidx.emoji.widget.EmojiTextView emojiTextView, float f) {
        this.valueOf = emojiTextView;
        this.ag$a = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.valueOf.setScaleX(1.0f);
        this.valueOf.setScaleY(1.0f);
        this.valueOf.setY(this.ag$a);
        this.valueOf.setAlpha(1.0f);
        this.valueOf.setVisibility(4);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
