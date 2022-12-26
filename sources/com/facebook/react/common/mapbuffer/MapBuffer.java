package com.facebook.react.common.mapbuffer;

import o.Transition;
/* loaded from: classes.dex */
public interface MapBuffer extends Iterable<toString>, Transition.ArrayListManager {
    public static final MapBuffer$ah$a valueOf = MapBuffer$ah$a.toString;

    /* loaded from: classes4.dex */
    public enum DataType {
        BOOL,
        INT,
        DOUBLE,
        STRING,
        MAP
    }

    /* loaded from: classes4.dex */
    public interface toString {
        MapBuffer HaptikSDK$b();

        DataType HaptikSDK$c();

        int ag$a();

        double ah$a();

        String ah$b();

        boolean valueOf();

        int values();
    }

    String HaptikSDK$c(int i);

    double ag$a(int i);

    int ag$a();

    boolean ah$a(int i);

    boolean toString(int i);

    int valueOf(int i);

    MapBuffer values(int i);
}
