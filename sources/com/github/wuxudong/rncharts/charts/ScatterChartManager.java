package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.data.Entry;
import o.MultiDex;
/* loaded from: classes4.dex */
public class ScatterChartManager extends BarLineChartBaseManager<ScatterChart, Entry> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNScatterChart";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ScatterChart createViewInstance(ThemedReactContext themedReactContext) {
        ScatterChart scatterChart = new ScatterChart(themedReactContext);
        scatterChart.setOnChartValueSelectedListener(new MultiDex.V14.JBMR11ElementConstructor(scatterChart));
        scatterChart.setOnChartGestureListener(new MultiDex.V14.JBMR2ElementConstructor(scatterChart));
        return scatterChart;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.wuxudong.rncharts.charts.ChartBaseManager
    public MultiDex.V14 getDataExtract() {
        return new MultiDex.V14.ICSElementConstructor();
    }
}
