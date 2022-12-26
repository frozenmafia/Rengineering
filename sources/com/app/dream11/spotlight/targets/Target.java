package com.app.dream11.spotlight.targets;

import android.graphics.Point;
/* loaded from: classes3.dex */
public interface Target {
    public static final Target NONE = new Target() { // from class: com.app.dream11.spotlight.targets.Target.1
        @Override // com.app.dream11.spotlight.targets.Target
        public Point getPoint() {
            return new Point(1000000, 1000000);
        }
    };

    Point getPoint();
}
