package com.apxor.androidsdk.plugins.survey.fragments;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes6.dex */
public abstract class f {
    private final DataSetObservable a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f395b;

    public float a(int i) {
        return 1.0f;
    }

    public abstract int a();

    public int a(Object obj) {
        return -1;
    }

    public abstract Object a(ViewGroup viewGroup, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f395b = dataSetObserver;
        }
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    public void a(View view) {
    }

    @Deprecated
    public void a(View view, int i, Object obj) {
    }

    public void a(ViewGroup viewGroup) {
        a((View) viewGroup);
    }

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public abstract boolean a(View view, Object obj);

    public void b() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f395b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    @Deprecated
    public void b(View view) {
    }

    public void b(ViewGroup viewGroup) {
        b((View) viewGroup);
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        a((View) viewGroup, i, obj);
    }

    public Parcelable c() {
        return null;
    }
}
