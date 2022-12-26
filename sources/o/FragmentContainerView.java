package o;

import com.facebook.datasource.AbstractDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.Fragment;
import o.FragmentAnim;
/* loaded from: classes4.dex */
public class FragmentContainerView<T> implements onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>> {
    private final List<onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>>> ag$a;
    private final boolean toString;

    private FragmentContainerView(List<onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>>> list, boolean z) {
        Fragment.AnonymousClass8.valueOf(!list.isEmpty(), "List of suppliers is empty!");
        this.ag$a = list;
        this.toString = z;
    }

    public static <T> FragmentContainerView<T> values(List<onStartEnterTransition<FragmentAnim.AnimationOrAnimator<T>>> list, boolean z) {
        return new FragmentContainerView<>(list, z);
    }

    @Override // o.onStartEnterTransition
    /* renamed from: values */
    public FragmentAnim.AnimationOrAnimator<T> get() {
        return new AbstractDataSource<T>() { // from class: o.FragmentContainerView$ag$a
            private int HaptikSDK$b;
            private Map<String, Object> ag$a;
            private Throwable ah$a;
            private int ah$b;
            private ArrayList<FragmentAnim.AnimationOrAnimator<T>> toString;
            private AtomicInteger valueOf;

            {
                boolean z;
                z = FragmentContainerView.this.toString;
                if (z) {
                    return;
                }
                valueOf();
            }

            private void valueOf() {
                List list;
                List list2;
                setRetainInstance setretaininstance;
                if (this.valueOf != null) {
                    return;
                }
                synchronized (this) {
                    if (this.valueOf == null) {
                        this.valueOf = new AtomicInteger(0);
                        list = FragmentContainerView.this.ag$a;
                        int size = list.size();
                        this.ah$b = size;
                        this.HaptikSDK$b = size;
                        this.toString = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            list2 = FragmentContainerView.this.ag$a;
                            FragmentAnim.AnimationOrAnimator animationOrAnimator = (FragmentAnim.AnimationOrAnimator) ((onStartEnterTransition) list2.get(i)).get();
                            this.toString.add(animationOrAnimator);
                            values valuesVar = new values(i);
                            setretaininstance = setRetainInstance.ag$a;
                            animationOrAnimator.subscribe(valuesVar, setretaininstance);
                            if (animationOrAnimator.hasResult()) {
                                break;
                            }
                        }
                    }
                }
            }

            private FragmentAnim.AnimationOrAnimator<T> toString(int i) {
                FragmentAnim.AnimationOrAnimator animationOrAnimator;
                synchronized (this) {
                    ArrayList<FragmentAnim.AnimationOrAnimator<T>> arrayList = this.toString;
                    animationOrAnimator = (arrayList == 0 || i >= arrayList.size()) ? null : (FragmentAnim.AnimationOrAnimator) this.toString.get(i);
                }
                return animationOrAnimator;
            }

            private FragmentAnim.AnimationOrAnimator<T> valueOf(int i) {
                FragmentAnim.AnimationOrAnimator animationOrAnimator;
                synchronized (this) {
                    ArrayList<FragmentAnim.AnimationOrAnimator<T>> arrayList = this.toString;
                    animationOrAnimator = null;
                    animationOrAnimator = null;
                    if (arrayList != 0 && i < arrayList.size()) {
                        animationOrAnimator = (FragmentAnim.AnimationOrAnimator) this.toString.set(i, null);
                    }
                }
                return animationOrAnimator;
            }

            private FragmentAnim.AnimationOrAnimator<T> ah$a() {
                FragmentAnim.AnimationOrAnimator<T> fragmentContainerView$ag$a;
                synchronized (this) {
                    fragmentContainerView$ag$a = toString(this.HaptikSDK$b);
                }
                return fragmentContainerView$ag$a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
            public T getResult() {
                boolean z;
                T result;
                synchronized (this) {
                    z = FragmentContainerView.this.toString;
                    if (z) {
                        valueOf();
                    }
                    FragmentAnim.AnimationOrAnimator ah$a = ah$a();
                    result = ah$a != null ? ah$a.getResult() : 0;
                }
                return result;
            }

            @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
            public boolean hasResult() {
                boolean z;
                boolean z2;
                synchronized (this) {
                    z = FragmentContainerView.this.toString;
                    if (z) {
                        valueOf();
                    }
                    FragmentAnim.AnimationOrAnimator ah$a = ah$a();
                    if (ah$a != null) {
                        z2 = ah$a.hasResult();
                    }
                }
                return z2;
            }

            @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
            public boolean close() {
                boolean z;
                z = FragmentContainerView.this.toString;
                if (z) {
                    valueOf();
                }
                synchronized (this) {
                    if (super.close()) {
                        ArrayList<FragmentAnim.AnimationOrAnimator<T>> arrayList = this.toString;
                        this.toString = null;
                        if (arrayList != 0) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                ag$a((FragmentAnim.AnimationOrAnimator) arrayList.get(i));
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ag$a(int i, FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                valueOf(i, animationOrAnimator, animationOrAnimator.isFinished());
                if (animationOrAnimator == ah$a()) {
                    setResult(null, i == 0 && animationOrAnimator.isFinished(), animationOrAnimator.getExtras());
                }
                values();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void valueOf(int i, FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                ag$a(toString(i, animationOrAnimator));
                if (i == 0) {
                    this.ah$a = animationOrAnimator.getFailureCause();
                    this.ag$a = animationOrAnimator.getExtras();
                }
                values();
            }

            private void values() {
                Throwable th;
                if (this.valueOf.incrementAndGet() != this.ah$b || (th = this.ah$a) == null) {
                    return;
                }
                setFailure(th, this.ag$a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[LOOP:0: B:17:0x0020->B:18:0x0022, LOOP_END] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void valueOf(int r3, o.FragmentAnim.AnimationOrAnimator<T> r4, boolean r5) {
                /*
                    r2 = this;
                    monitor-enter(r2)
                    int r0 = r2.HaptikSDK$b     // Catch: java.lang.Throwable -> L2f
                    o.FragmentAnim$AnimationOrAnimator r1 = r2.toString(r3)     // Catch: java.lang.Throwable -> L2f
                    if (r4 != r1) goto L2d
                    int r4 = r2.HaptikSDK$b     // Catch: java.lang.Throwable -> L2f
                    if (r3 != r4) goto Le
                    goto L2d
                Le:
                    o.FragmentAnim$AnimationOrAnimator r4 = r2.ah$a()     // Catch: java.lang.Throwable -> L2f
                    if (r4 == 0) goto L1d
                    if (r5 == 0) goto L1b
                    int r4 = r2.HaptikSDK$b     // Catch: java.lang.Throwable -> L2f
                    if (r3 >= r4) goto L1b
                    goto L1d
                L1b:
                    r3 = r0
                    goto L1f
                L1d:
                    r2.HaptikSDK$b = r3     // Catch: java.lang.Throwable -> L2f
                L1f:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                L20:
                    if (r0 <= r3) goto L2c
                    o.FragmentAnim$AnimationOrAnimator r4 = r2.valueOf(r0)
                    r2.ag$a(r4)
                    int r0 = r0 + (-1)
                    goto L20
                L2c:
                    return
                L2d:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                    return
                L2f:
                    r3 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.FragmentContainerView$ag$a.valueOf(int, o.FragmentAnim$AnimationOrAnimator, boolean):void");
            }

            private FragmentAnim.AnimationOrAnimator<T> toString(int i, FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                synchronized (this) {
                    if (animationOrAnimator == ah$a()) {
                        return null;
                    }
                    if (animationOrAnimator == toString(i)) {
                        return valueOf(i);
                    }
                    return animationOrAnimator;
                }
            }

            private void ag$a(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                if (animationOrAnimator != 0) {
                    animationOrAnimator.close();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public class values implements addDisappearingFragmentView<T> {
                private int valueOf;

                @Override // o.addDisappearingFragmentView
                public void onCancellation(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                }

                public values(int i) {
                    this.valueOf = i;
                }

                @Override // o.addDisappearingFragmentView
                public void onNewResult(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                    if (animationOrAnimator.hasResult()) {
                        ag$a(this.valueOf, animationOrAnimator);
                    } else if (animationOrAnimator.isFinished()) {
                        valueOf(this.valueOf, animationOrAnimator);
                    }
                }

                @Override // o.addDisappearingFragmentView
                public void onFailure(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                    valueOf(this.valueOf, animationOrAnimator);
                }

                @Override // o.addDisappearingFragmentView
                public void onProgressUpdate(FragmentAnim.AnimationOrAnimator<T> animationOrAnimator) {
                    if (this.valueOf == 0) {
                        setProgress(animationOrAnimator.getProgress());
                    }
                }
            }
        };
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FragmentContainerView) {
            return Fragment.AnonymousClass7.toString(this.ag$a, ((FragmentContainerView) obj).ag$a);
        }
        return false;
    }

    public String toString() {
        return Fragment.AnonymousClass7.valueOf(this).ah$a("list", this.ag$a).toString();
    }
}
