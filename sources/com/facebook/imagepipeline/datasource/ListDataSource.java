package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.AbstractDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import o.Fragment;
import o.FragmentActivity;
import o.FragmentAnim;
import o.addDisappearingFragmentView;
import o.setRetainInstance;
/* loaded from: classes6.dex */
public class ListDataSource<T> extends AbstractDataSource<List<FragmentActivity.AnonymousClass1<T>>> {
    private final FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>>[] mDataSources;
    private int mFinishedDataSources = 0;

    protected ListDataSource(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>>[] animationOrAnimatorArr) {
        this.mDataSources = animationOrAnimatorArr;
    }

    public static <T> ListDataSource<T> create(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>>... animationOrAnimatorArr) {
        setRetainInstance setretaininstance;
        animationOrAnimatorArr.getClass();
        Fragment.AnonymousClass8.toString(animationOrAnimatorArr.length > 0);
        ListDataSource<T> listDataSource = new ListDataSource<>(animationOrAnimatorArr);
        for (FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator : animationOrAnimatorArr) {
            if (animationOrAnimator != null) {
                InternalDataSubscriber internalDataSubscriber = new InternalDataSubscriber();
                setretaininstance = setRetainInstance.ag$a;
                animationOrAnimator.subscribe(internalDataSubscriber, setretaininstance);
            }
        }
        return listDataSource;
    }

    @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
    public List<FragmentActivity.AnonymousClass1<T>> getResult() {
        synchronized (this) {
            if (hasResult()) {
                ArrayList arrayList = new ArrayList(this.mDataSources.length);
                for (FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator : this.mDataSources) {
                    arrayList.add(animationOrAnimator.getResult());
                }
                return arrayList;
            }
            return null;
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
    public boolean hasResult() {
        boolean z;
        synchronized (this) {
            if (!isClosed()) {
                z = this.mFinishedDataSources == this.mDataSources.length;
            }
        }
        return z;
    }

    @Override // com.facebook.datasource.AbstractDataSource, o.FragmentAnim.AnimationOrAnimator
    public boolean close() {
        if (super.close()) {
            for (FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator : this.mDataSources) {
                animationOrAnimator.close();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceFinished() {
        if (increaseAndCheckIfLast()) {
            setResult(null, true, null);
        }
    }

    private boolean increaseAndCheckIfLast() {
        boolean z;
        synchronized (this) {
            int i = this.mFinishedDataSources + 1;
            this.mFinishedDataSources = i;
            z = i == this.mDataSources.length;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceFailed(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator) {
        Throwable failureCause = animationOrAnimator.getFailureCause();
        if (failureCause == null) {
            failureCause = new Throwable("Unknown failure cause");
        }
        setFailure(failureCause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceCancelled() {
        setFailure(new CancellationException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataSourceProgress() {
        float f = 0.0f;
        for (FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator : this.mDataSources) {
            f += animationOrAnimator.getProgress();
        }
        setProgress(f / this.mDataSources.length);
    }

    /* loaded from: classes6.dex */
    class InternalDataSubscriber implements addDisappearingFragmentView<FragmentActivity.AnonymousClass1<T>> {
        boolean mFinished;

        private InternalDataSubscriber() {
            this.mFinished = false;
        }

        private boolean tryFinish() {
            synchronized (this) {
                if (this.mFinished) {
                    return false;
                }
                this.mFinished = true;
                return true;
            }
        }

        @Override // o.addDisappearingFragmentView
        public void onFailure(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator) {
            ListDataSource.this.onDataSourceFailed(animationOrAnimator);
        }

        @Override // o.addDisappearingFragmentView
        public void onCancellation(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator) {
            ListDataSource.this.onDataSourceCancelled();
        }

        @Override // o.addDisappearingFragmentView
        public void onNewResult(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator) {
            if (animationOrAnimator.isFinished() && tryFinish()) {
                ListDataSource.this.onDataSourceFinished();
            }
        }

        @Override // o.addDisappearingFragmentView
        public void onProgressUpdate(FragmentAnim.AnimationOrAnimator<FragmentActivity.AnonymousClass1<T>> animationOrAnimator) {
            ListDataSource.this.onDataSourceProgress();
        }
    }
}
