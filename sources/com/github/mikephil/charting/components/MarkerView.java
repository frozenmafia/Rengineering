package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
import o.onResultSent;
/* loaded from: classes7.dex */
public class MarkerView extends RelativeLayout implements onResultSent {
    private WeakReference<Chart> ag$a;
    private MediaButtonReceiver ah$a;
    private MediaButtonReceiver valueOf;

    public MarkerView(Context context, int i) {
        super(context);
        this.valueOf = new MediaButtonReceiver();
        this.ah$a = new MediaButtonReceiver();
        ag$a(i);
    }

    private void ag$a(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    public void setOffset(MediaButtonReceiver mediaButtonReceiver) {
        this.valueOf = mediaButtonReceiver;
        if (mediaButtonReceiver == null) {
            this.valueOf = new MediaButtonReceiver();
        }
    }

    public void setOffset(float f, float f2) {
        this.valueOf.values = f;
        this.valueOf.toString = f2;
    }

    public MediaButtonReceiver values() {
        return this.valueOf;
    }

    public void setChartView(Chart chart) {
        this.ag$a = new WeakReference<>(chart);
    }

    public Chart ah$a() {
        WeakReference<Chart> weakReference = this.ag$a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public MediaButtonReceiver values(float f, float f2) {
        MediaButtonReceiver values = values();
        this.ah$a.values = values.values;
        this.ah$a.toString = values.toString;
        Chart ah$a = ah$a();
        float width = getWidth();
        float height = getHeight();
        if (this.ah$a.values + f < 0.0f) {
            this.ah$a.values = -f;
        } else if (ah$a != null && f + width + this.ah$a.values > ah$a.getWidth()) {
            this.ah$a.values = (ah$a.getWidth() - f) - width;
        }
        if (this.ah$a.toString + f2 < 0.0f) {
            this.ah$a.toString = -f2;
        } else if (ah$a != null && f2 + height + this.ah$a.toString > ah$a.getHeight()) {
            this.ah$a.toString = (ah$a.getHeight() - f2) - height;
        }
        return this.ah$a;
    }

    @Override // o.onResultSent
    public void toString(Entry entry, MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 anonymousClass2) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // o.onResultSent
    public void ag$a(Canvas canvas, float f, float f2) {
        MediaButtonReceiver values = values(f, f2);
        int save = canvas.save();
        canvas.translate(f + values.values, f2 + values.toString);
        draw(canvas);
        canvas.restoreToCount(save);
    }
}
