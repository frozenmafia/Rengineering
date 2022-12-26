package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.AbstractDataSource;
import o.FragmentActivity;
/* loaded from: classes6.dex */
public final class SettableDataSource<T> extends AbstractDataSource<FragmentActivity.AnonymousClass1<T>> {
    @Override // com.facebook.datasource.AbstractDataSource
    public /* bridge */ /* synthetic */ void closeResult(Object obj) {
        closeResult((FragmentActivity.AnonymousClass1) ((FragmentActivity.AnonymousClass1) obj));
    }

    public static <V> SettableDataSource<V> create() {
        return new SettableDataSource<>();
    }

    private SettableDataSource() {
    }

    public boolean set(FragmentActivity.AnonymousClass1<T> anonymousClass1) {
        return super.setResult(FragmentActivity.AnonymousClass1.toString(anonymousClass1), true, null);
    }

    public boolean setException(Throwable th) {
        return super.setFailure(th);
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setProgress(float f) {
        return super.setProgress(f);
    }

    @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
    public FragmentActivity.AnonymousClass1<T> getResult() {
        return FragmentActivity.AnonymousClass1.toString((FragmentActivity.AnonymousClass1) super.getResult());
    }

    protected void closeResult(FragmentActivity.AnonymousClass1<T> anonymousClass1) {
        FragmentActivity.AnonymousClass1.valueOf((FragmentActivity.AnonymousClass1<?>) anonymousClass1);
    }
}
