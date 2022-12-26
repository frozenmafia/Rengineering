package o;

import android.animation.Animator;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
import com.google.logging.type.LogSeverity;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes3.dex */
public final class KeyEventDispatcher extends q1.toString {
    public final /* synthetic */ q1.c valueOf;
    public final /* synthetic */ TransitionDrawable values;

    /* loaded from: classes3.dex */
    public final class Component {
        public final kotlin.Pair<Float, Float> toString;
        public final kotlin.Pair<Float, Float> values;

        public Component(kotlin.Pair<Float, Float> pair, kotlin.Pair<Float, Float> pair2) {
            runAnimators.ag$a(pair, StringSet.size);
            runAnimators.ag$a(pair2, "position");
            this.toString = pair;
            this.values = pair2;
        }

        public final float ag$a() {
            return this.values.getSecond().floatValue();
        }

        public final float ah$a() {
            return this.toString.getFirst().floatValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Component) {
                Component component = (Component) obj;
                return runAnimators.values(this.toString, component.toString) && runAnimators.values(this.values, component.values);
            }
            return false;
        }

        public int hashCode() {
            return (this.toString.hashCode() * 31) + this.values.hashCode();
        }

        public String toString() {
            return "SafeFrame(size=" + this.toString + ", position=" + this.values + ')';
        }

        public final float valueOf() {
            return this.values.getFirst().floatValue();
        }

        public final float values() {
            return this.toString.getSecond().floatValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyEventDispatcher(TransitionDrawable transitionDrawable, q1.c cVar, q1 q1Var) {
        super(q1Var);
        this.values = transitionDrawable;
        this.valueOf = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageView values;
        this.values.startTransition(LogSeverity.CRITICAL_VALUE);
        values = this.valueOf.values();
        values.setVisibility(0);
    }
}
