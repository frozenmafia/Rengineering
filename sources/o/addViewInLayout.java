package o;

import com.facebook.datasource.AbstractDataSource;
import java.util.List;
import o.Fragment;
import o.FragmentAnim;
/* loaded from: classes4.dex */
public class addViewInLayout<T> implements onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> {
    private final List<onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>>> valueOf;

    private addViewInLayout(List<onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>>> list) {
        Fragment.AnonymousClass8.valueOf(!list.isEmpty(), "List of suppliers is empty!");
        this.valueOf = list;
    }

    public static <T> addViewInLayout<T> ag$a(List<onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>>> list) {
        return new addViewInLayout<>(list);
    }

    @Override // o.onStartEnterTransition
    /* renamed from: ah$a */
    public FragmentAnim.AnimationOrAnimator<T> get() {
        return new valueOf();
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof addViewInLayout) {
            return Fragment.AnonymousClass7.toString(this.valueOf, ((addViewInLayout) obj).valueOf);
        }
        return false;
    }

    public String toString() {
        return Fragment.AnonymousClass7.valueOf(this).ah$a("list", this.valueOf).toString();
    }

    /* loaded from: classes4.dex */
    public class valueOf extends AbstractDataSource<T> {
        private int values = 0;
        private FragmentAnim.AnimationOrAnimator<T> ag$a = null;
        private FragmentAnim.AnimationOrAnimator<T> valueOf = null;

        public valueOf() {
            addViewInLayout.this = r2;
            if (ah$a()) {
                return;
            }
            setFailure(new RuntimeException("No data source supplier or supplier returned null."));
        }

        @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
        public T getResult() {
            T result;
            synchronized (this) {
                FragmentAnim.AnimationOrAnimator<T> values = values();
                result = values != null ? values.getResult() : null;
            }
            return result;
        }

        @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
        public boolean hasResult() {
            boolean z;
            synchronized (this) {
                FragmentAnim.AnimationOrAnimator<T> values = values();
                if (values != null) {
                    z = values.hasResult();
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
                    FragmentAnim.AnimationOrAnimator<T> animationOrAnimator2 = this.valueOf;
                    this.valueOf = null;
                    valueOf(animationOrAnimator2);
                    valueOf(animationOrAnimator);
                    return true;
                }
                return false;
            }
        }

        private boolean ah$a() {
            setRetainInstance setretaininstance;
            onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> ag$a = ag$a();
            FragmentAnim.AnimationOrAnimator<T> animationOrAnimator = ag$a != null ? ag$a.get() : null;
            if (values(animationOrAnimator) && animationOrAnimator != null) {
                C0339valueOf c0339valueOf = new C0339valueOf();
                setretaininstance = setRetainInstance.ag$a;
                animationOrAnimator.subscribe(c0339valueOf, setretaininstance);
                return true;
            }
            valueOf(animationOrAnimator);
            return false;
        }

        private onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> ag$a() {
            synchronized (this) {
                if (isClosed() || this.values >= addViewInLayout.this.valueOf.size()) {
                    return null;
                }
                List list = addViewInLayout.this.valueOf;
                int i = this.values;
                this.values = i + 1;
                return (onStartEnterTransition) list.get(i);
            }
        }

        private boolean values(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            synchronized (this) {
                if (isClosed()) {
                    return false;
                }
                this.ag$a = animationOrAnimator;
                return true;
            }
        }

        private boolean toString(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            synchronized (this) {
                if (!isClosed() && animationOrAnimator == this.ag$a) {
                    this.ag$a = null;
                    return true;
                }
                return false;
            }
        }

        private FragmentAnim.AnimationOrAnimator<T> values() {
            FragmentAnim.AnimationOrAnimator<T> animationOrAnimator;
            synchronized (this) {
                animationOrAnimator = this.valueOf;
            }
            return animationOrAnimator;
        }

        private void values(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator, boolean z) {
            FragmentAnim.AnimationOrAnimator<T> animationOrAnimator2;
            synchronized (this) {
                if (animationOrAnimator == this.ag$a && animationOrAnimator != (animationOrAnimator2 = this.valueOf)) {
                    if (animationOrAnimator2 != null && !z) {
                        animationOrAnimator2 = null;
                        valueOf(animationOrAnimator2);
                    }
                    this.valueOf = animationOrAnimator;
                    valueOf(animationOrAnimator2);
                }
            }
        }

        public void ah$a(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            if (toString(animationOrAnimator)) {
                if (animationOrAnimator != values()) {
                    valueOf(animationOrAnimator);
                }
                if (ah$a()) {
                    return;
                }
                setFailure(animationOrAnimator.getFailureCause(), animationOrAnimator.getExtras());
            }
        }

        public void ag$a(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            values(animationOrAnimator, animationOrAnimator.isFinished());
            if (animationOrAnimator == values()) {
                setResult(null, animationOrAnimator.isFinished(), animationOrAnimator.getExtras());
            }
        }

        private void valueOf(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            if (animationOrAnimator != null) {
                animationOrAnimator.close();
            }
        }

        /* renamed from: o.addViewInLayout$valueOf$valueOf */
        /* loaded from: classes4.dex */
        public class C0339valueOf implements addDisappearingFragmentView<T> {
            @Override // o.addDisappearingFragmentView
            public void onCancellation(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
            }

            private C0339valueOf() {
                valueOf.this = r1;
            }

            @Override // o.addDisappearingFragmentView
            public void onFailure(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                valueOf.this.ah$a(animationOrAnimator);
            }

            @Override // o.addDisappearingFragmentView
            public void onNewResult(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                if (animationOrAnimator.hasResult()) {
                    valueOf.this.ag$a(animationOrAnimator);
                } else if (animationOrAnimator.isFinished()) {
                    valueOf.this.ah$a(animationOrAnimator);
                }
            }

            @Override // o.addDisappearingFragmentView
            public void onProgressUpdate(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                valueOf.this.setProgress(Math.max(valueOf.this.getProgress(), animationOrAnimator.getProgress()));
            }
        }
    }
}
