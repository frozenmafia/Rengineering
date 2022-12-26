package androidx.lifecycle;

import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class LiveDataKt {
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner lifecycleOwner, final Styleable.ChangeBounds<? super T, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(liveData, "$this$observe");
        runAnimators.ag$a(lifecycleOwner, "owner");
        runAnimators.ag$a(changeBounds, "onChanged");
        Observer<T> observer = new Observer<T>() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                Styleable.ChangeBounds.this.invoke(t);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return observer;
    }
}
