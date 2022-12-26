package com.github.wuxudong.rncharts.markers;

import android.content.Context;
import com.github.mikephil.charting.components.MarkerView;
import o.MediaButtonReceiver;
import o.clearOldDexDir;
/* loaded from: classes7.dex */
public class RNCircleMarkerView extends MarkerView {
    public RNCircleMarkerView(Context context) {
        super(context, clearOldDexDir.values.circle_marker);
    }

    @Override // com.github.mikephil.charting.components.MarkerView
    public MediaButtonReceiver values() {
        return new MediaButtonReceiver(-(getWidth() / 2), (-getHeight()) / 2);
    }
}
