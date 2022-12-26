package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import o.MultiDex;
/* loaded from: classes4.dex */
public class HorizontalBarChartManager extends BarChartManager {
    @Override // com.github.wuxudong.rncharts.charts.BarChartManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNHorizontalBarChart";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.wuxudong.rncharts.charts.BarChartManager, com.facebook.react.uimanager.ViewManager
    public BarChart createViewInstance(ThemedReactContext themedReactContext) {
        HorizontalBarChart horizontalBarChart = new HorizontalBarChart(themedReactContext);
        horizontalBarChart.setOnChartValueSelectedListener(new MultiDex.V14.JBMR11ElementConstructor(horizontalBarChart));
        horizontalBarChart.setOnChartGestureListener(new MultiDex.V14.JBMR2ElementConstructor(horizontalBarChart));
        return horizontalBarChart;
    }
}
