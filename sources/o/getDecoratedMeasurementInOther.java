package o;

import o.getScrapOrHiddenOrCachedHolderForPosition;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getDecoratedMeasurementInOther<T> implements quickRecycleScrapView<T>, getScrapOrHiddenOrCachedHolderForPosition<T> {
    private static final getScrapOrHiddenOrCachedHolderForPosition.toString<Object> ag$a = createVerticalHelper.ah$a;
    private static final quickRecycleScrapView<Object> valueOf = getEndAfterPadding.valueOf;
    private getScrapOrHiddenOrCachedHolderForPosition.toString<T> ah$a;
    private volatile quickRecycleScrapView<T> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object ah$a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void values(quickRecycleScrapView quickrecyclescrapview) {
    }

    private getDecoratedMeasurementInOther(getScrapOrHiddenOrCachedHolderForPosition.toString<T> tostring, quickRecycleScrapView<T> quickrecyclescrapview) {
        this.ah$a = tostring;
        this.toString = quickrecyclescrapview;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> getDecoratedMeasurementInOther<T> valueOf() {
        return new getDecoratedMeasurementInOther<>(ag$a, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> getDecoratedMeasurementInOther<T> toString(quickRecycleScrapView<T> quickrecyclescrapview) {
        return new getDecoratedMeasurementInOther<>(null, quickrecyclescrapview);
    }

    @Override // o.quickRecycleScrapView
    public T ag$a() {
        return this.toString.ag$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(quickRecycleScrapView<T> quickrecyclescrapview) {
        getScrapOrHiddenOrCachedHolderForPosition.toString<T> tostring;
        if (this.toString != valueOf) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            tostring = this.ah$a;
            this.ah$a = null;
            this.toString = quickrecyclescrapview;
        }
        tostring.ag$a(quickrecyclescrapview);
    }

    @Override // o.getScrapOrHiddenOrCachedHolderForPosition
    public void ag$a(final getScrapOrHiddenOrCachedHolderForPosition.toString<T> tostring) {
        quickRecycleScrapView<T> quickrecyclescrapview;
        quickRecycleScrapView<T> quickrecyclescrapview2 = this.toString;
        quickRecycleScrapView<Object> quickrecyclescrapview3 = valueOf;
        if (quickrecyclescrapview2 != quickrecyclescrapview3) {
            tostring.ag$a(quickrecyclescrapview2);
            return;
        }
        quickRecycleScrapView<T> quickrecyclescrapview4 = null;
        synchronized (this) {
            quickrecyclescrapview = this.toString;
            if (quickrecyclescrapview != quickrecyclescrapview3) {
                quickrecyclescrapview4 = quickrecyclescrapview;
            } else {
                final getScrapOrHiddenOrCachedHolderForPosition.toString<T> tostring2 = this.ah$a;
                this.ah$a = new getScrapOrHiddenOrCachedHolderForPosition.toString() { // from class: o.createOrientationHelper
                    @Override // o.getScrapOrHiddenOrCachedHolderForPosition.toString
                    public final void ag$a(quickRecycleScrapView quickrecyclescrapview5) {
                        getDecoratedMeasurementInOther.values(getScrapOrHiddenOrCachedHolderForPosition.toString.this, tostring, quickrecyclescrapview5);
                    }
                };
            }
        }
        if (quickrecyclescrapview4 != null) {
            tostring.ag$a(quickrecyclescrapview);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void values(getScrapOrHiddenOrCachedHolderForPosition.toString tostring, getScrapOrHiddenOrCachedHolderForPosition.toString tostring2, quickRecycleScrapView quickrecyclescrapview) {
        tostring.ag$a(quickrecyclescrapview);
        tostring2.ag$a(quickrecyclescrapview);
    }
}
