package com.github.mikephil.charting.data;

import com.dreampay.commons.constants.Constants;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import o.onErrorSent;
/* loaded from: classes4.dex */
public abstract class DataSet<T extends Entry> extends onErrorSent<T> {
    protected float ICustomTabsCallback;
    protected float ak$a;
    protected List<T> ak$b;
    protected float extraCallback;
    protected float extraCallbackWithResult;

    /* loaded from: classes4.dex */
    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.ak$b = null;
        this.extraCallback = -3.4028235E38f;
        this.extraCallbackWithResult = Float.MAX_VALUE;
        this.ak$a = -3.4028235E38f;
        this.ICustomTabsCallback = Float.MAX_VALUE;
        this.ak$b = list;
        if (list == null) {
            this.ak$b = new ArrayList();
        }
        getDefaultImpl();
    }

    public void getDefaultImpl() {
        List<T> list = this.ak$b;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.extraCallback = -3.4028235E38f;
        this.extraCallbackWithResult = Float.MAX_VALUE;
        this.ak$a = -3.4028235E38f;
        this.ICustomTabsCallback = Float.MAX_VALUE;
        for (T t : this.ak$b) {
            values((DataSet<T>) t);
        }
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public void toString(float f, float f2) {
        List<T> list = this.ak$b;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.extraCallback = -3.4028235E38f;
        this.extraCallbackWithResult = Float.MAX_VALUE;
        int dataSet = toString(f2, Float.NaN, Rounding.UP);
        for (int dataSet2 = toString(f, Float.NaN, Rounding.DOWN); dataSet2 <= dataSet; dataSet2++) {
            toString((DataSet<T>) this.ak$b.get(dataSet2));
        }
    }

    public void values(T t) {
        if (t == null) {
            return;
        }
        ag$a((DataSet<T>) t);
        toString((DataSet<T>) t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag$a(T t) {
        if (t.HaptikWebView() < this.ICustomTabsCallback) {
            this.ICustomTabsCallback = t.HaptikWebView();
        }
        if (t.HaptikWebView() > this.ak$a) {
            this.ak$a = t.HaptikWebView();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(T t) {
        if (t.ah$b() < this.extraCallbackWithResult) {
            this.extraCallbackWithResult = t.ah$b();
        }
        if (t.ah$b() > this.extraCallback) {
            this.extraCallback = t.ah$b();
        }
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public int setDefaultImpl() {
        return this.ak$b.size();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ICustomTabsService());
        for (int i = 0; i < this.ak$b.size(); i++) {
            stringBuffer.append(this.ak$b.get(i).toString() + Constants.WHITE_SPACE);
        }
        return stringBuffer.toString();
    }

    public String ICustomTabsService() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("DataSet, label: ");
        sb.append(aj$a() == null ? "" : aj$a());
        sb.append(", entries: ");
        sb.append(this.ak$b.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public float ICustomTabsCallback$Stub$Proxy() {
        return this.extraCallbackWithResult;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public float extraCommand() {
        return this.extraCallback;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public float onTransact() {
        return this.ICustomTabsCallback;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public float asInterface() {
        return this.ak$a;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public int valueOf(Entry entry) {
        return this.ak$b.indexOf(entry);
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public T ag$a(float f, float f2, Rounding rounding) {
        int dataSet = toString(f, f2, rounding);
        if (dataSet > -1) {
            return this.ak$b.get(dataSet);
        }
        return null;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public T values(float f, float f2) {
        return ag$a(f, f2, Rounding.CLOSEST);
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public T HaptikSDK$d(int i) {
        return this.ak$b.get(i);
    }

    public int toString(float f, float f2, Rounding rounding) {
        T t;
        List<T> list = this.ak$b;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i = 0;
        int size = this.ak$b.size() - 1;
        while (i < size) {
            int i2 = (i + size) / 2;
            float HaptikWebView = this.ak$b.get(i2).HaptikWebView() - f;
            int i3 = i2 + 1;
            float HaptikWebView2 = this.ak$b.get(i3).HaptikWebView();
            float abs = Math.abs(HaptikWebView);
            float abs2 = Math.abs(HaptikWebView2 - f);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d = HaptikWebView;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i2;
            }
            i = i3;
        }
        if (size != -1) {
            float HaptikWebView3 = this.ak$b.get(size).HaptikWebView();
            if (rounding == Rounding.UP) {
                if (HaptikWebView3 < f && size < this.ak$b.size() - 1) {
                    size++;
                }
            } else if (rounding == Rounding.DOWN && HaptikWebView3 > f && size > 0) {
                size--;
            }
            if (Float.isNaN(f2)) {
                return size;
            }
            while (size > 0 && this.ak$b.get(size - 1).HaptikWebView() == HaptikWebView3) {
                size--;
            }
            float ah$b = this.ak$b.get(size).ah$b();
            int i4 = size;
            loop2: while (true) {
                int i5 = i4;
                do {
                    i5++;
                    if (i5 >= this.ak$b.size()) {
                        break loop2;
                    }
                    t = this.ak$b.get(i5);
                    if (t.HaptikWebView() != HaptikWebView3) {
                        break loop2;
                    }
                } while (Math.abs(t.ah$b() - f2) >= Math.abs(ah$b - f2));
                ah$b = f2;
                i4 = i5;
            }
            return i4;
        }
        return size;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8
    public List<T> values(float f) {
        ArrayList arrayList = new ArrayList();
        int size = this.ak$b.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            T t = this.ak$b.get(i2);
            if (f == t.HaptikWebView()) {
                while (i2 > 0 && this.ak$b.get(i2 - 1).HaptikWebView() == f) {
                    i2--;
                }
                int size2 = this.ak$b.size();
                while (i2 < size2) {
                    T t2 = this.ak$b.get(i2);
                    if (t2.HaptikWebView() != f) {
                        break;
                    }
                    arrayList.add(t2);
                    i2++;
                }
            } else if (f > t.HaptikWebView()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }
}
