package o;

import com.facebook.datasource.AbstractDataSource;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o.FragmentAnim;
/* loaded from: classes4.dex */
public class endViewTransition<T> implements onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> {
    private final Set<valueOf> values = Collections.newSetFromMap(new WeakHashMap());
    private onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> valueOf = null;

    @Override // o.onStartEnterTransition
    /* renamed from: valueOf */
    public FragmentAnim.AnimationOrAnimator<T> get() {
        valueOf valueof = new valueOf();
        valueof.toString(this.valueOf);
        this.values.add(valueof);
        return valueof;
    }

    public void ah$a(onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> onstartentertransition) {
        this.valueOf = onstartentertransition;
        for (valueOf valueof : this.values) {
            if (!valueof.isClosed()) {
                valueof.toString(onstartentertransition);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class valueOf<T> extends AbstractDataSource<T> {
        private FragmentAnim.AnimationOrAnimator<T> ag$a;

        /* JADX INFO: Access modifiers changed from: private */
        public void valueOf() {
        }

        @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
        public boolean hasMultipleResults() {
            return true;
        }

        private valueOf() {
            this.ag$a = null;
        }

        public void toString(onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> onstartentertransition) {
            setRetainInstance setretaininstance;
            if (isClosed()) {
                return;
            }
            FragmentAnim.AnimationOrAnimator<T> animationOrAnimator = onstartentertransition != null ? onstartentertransition.get() : null;
            synchronized (this) {
                if (isClosed()) {
                    valueOf(animationOrAnimator);
                    return;
                }
                FragmentAnim.AnimationOrAnimator<T> animationOrAnimator2 = this.ag$a;
                this.ag$a = animationOrAnimator;
                if (animationOrAnimator != null) {
                    C0343valueOf c0343valueOf = new C0343valueOf();
                    setretaininstance = setRetainInstance.ag$a;
                    animationOrAnimator.subscribe(c0343valueOf, setretaininstance);
                }
                valueOf(animationOrAnimator2);
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
        public T getResult() {
            T result;
            synchronized (this) {
                FragmentAnim.AnimationOrAnimator<T> animationOrAnimator = this.ag$a;
                result = animationOrAnimator != null ? animationOrAnimator.getResult() : null;
            }
            return result;
        }

        @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
        public boolean hasResult() {
            boolean z;
            synchronized (this) {
                FragmentAnim.AnimationOrAnimator<T> animationOrAnimator = this.ag$a;
                if (animationOrAnimator != null) {
                    z = animationOrAnimator.hasResult();
                }
            }
            return z;
        }

        @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
        public boolean close() {
            synchronized (this) {
                if (super.close()) {
                    FragmentAnim.AnimationOrAnimator<T> animationOrAnimator = this.ag$a;
                    this.ag$a = null;
                    valueOf(animationOrAnimator);
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ag$a(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            if (animationOrAnimator == this.ag$a) {
                setResult(null, false, animationOrAnimator.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void values(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            if (animationOrAnimator == this.ag$a) {
                setProgress(animationOrAnimator.getProgress());
            }
        }

        private static <T> void valueOf(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            if (animationOrAnimator != null) {
                animationOrAnimator.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.endViewTransition$valueOf$valueOf  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0343valueOf implements addDisappearingFragmentView<T> {
            @Override // o.addDisappearingFragmentView
            public void onCancellation(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            }

            private C0343valueOf() {
            }

            @Override // o.addDisappearingFragmentView
            public void onNewResult(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                if (animationOrAnimator.hasResult()) {
                    valueOf.this.ag$a(animationOrAnimator);
                } else if (animationOrAnimator.isFinished()) {
                    valueOf.this.valueOf();
                }
            }

            @Override // o.addDisappearingFragmentView
            public void onFailure(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                valueOf.this.valueOf();
            }

            @Override // o.addDisappearingFragmentView
            public void onProgressUpdate(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                valueOf.this.values(animationOrAnimator);
            }
        }
    }
}
