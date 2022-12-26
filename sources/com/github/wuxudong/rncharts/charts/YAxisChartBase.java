package com.github.wuxudong.rncharts.charts;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import o.MultiDex;
/* loaded from: classes4.dex */
public abstract class YAxisChartBase<T extends Chart, U extends Entry> extends ChartBaseManager<T, U> {
    @ReactProp(name = "yAxis")
    public abstract void setYAxis(Chart chart, ReadableMap readableMap);

    /* JADX INFO: Access modifiers changed from: protected */
    public void setYAxisConfig(YAxis yAxis, ReadableMap readableMap) {
        if (MultiDex.V4.values(readableMap, ReadableType.Boolean, "inverted")) {
            yAxis.invoke(readableMap.getBoolean("inverted"));
        }
        if (MultiDex.V4.values(readableMap, ReadableType.Number, "spaceTop")) {
            yAxis.getInitSettings((float) readableMap.getDouble("spaceTop"));
        }
        if (MultiDex.V4.values(readableMap, ReadableType.Number, "spaceBottom")) {
            yAxis.invoke((float) readableMap.getDouble("spaceBottom"));
        }
        if (MultiDex.V4.values(readableMap, ReadableType.String, "position")) {
            yAxis.toString(YAxis.YAxisLabelPosition.valueOf(readableMap.getString("position")));
        }
        if (MultiDex.V4.values(readableMap, ReadableType.Map, "zeroLine")) {
            ReadableMap map = readableMap.getMap("zeroLine");
            if (MultiDex.V4.values(map, ReadableType.Boolean, ViewProps.ENABLED)) {
                yAxis.ah$b(map.getBoolean(ViewProps.ENABLED));
            }
            if (MultiDex.V4.values(map, ReadableType.Number, "lineWidth")) {
                yAxis.HaptikSDK$d((float) map.getDouble("lineWidth"));
            }
            if (MultiDex.V4.values(map, ReadableType.Number, "lineColor")) {
                yAxis.HaptikSDK$b(map.getInt("lineColor"));
            }
        }
    }
}
