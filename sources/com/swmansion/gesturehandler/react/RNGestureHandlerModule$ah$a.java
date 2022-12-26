package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.gesturehandler.GestureHandler;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class RNGestureHandlerModule$ah$a {
    public /* synthetic */ RNGestureHandlerModule$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private RNGestureHandlerModule$ah$a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf(GestureHandler<?> gestureHandler, ReadableMap readableMap) {
        float f;
        float f2;
        float f3;
        float f4;
        if (readableMap.getType("hitSlop") == ReadableType.Number) {
            float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("hitSlop"));
            gestureHandler.values(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap("hitSlop");
        runAnimators.toString(map);
        runAnimators.ah$a(map, "config.getMap(KEY_HIT_SLOP)!!");
        if (map.hasKey("horizontal")) {
            f = PixelUtil.toPixelFromDIP(map.getDouble("horizontal"));
            f2 = f;
        } else {
            f = Float.NaN;
            f2 = Float.NaN;
        }
        if (map.hasKey("vertical")) {
            f3 = PixelUtil.toPixelFromDIP(map.getDouble("vertical"));
            f4 = f3;
        } else {
            f3 = Float.NaN;
            f4 = Float.NaN;
        }
        if (map.hasKey("left")) {
            f = PixelUtil.toPixelFromDIP(map.getDouble("left"));
        }
        float f5 = f;
        if (map.hasKey(ViewProps.TOP)) {
            f3 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.TOP));
        }
        float f6 = f3;
        if (map.hasKey("right")) {
            f2 = PixelUtil.toPixelFromDIP(map.getDouble("right"));
        }
        float f7 = f2;
        if (map.hasKey(ViewProps.BOTTOM)) {
            f4 = PixelUtil.toPixelFromDIP(map.getDouble(ViewProps.BOTTOM));
        }
        gestureHandler.values(f5, f6, f7, f4, map.hasKey("width") ? PixelUtil.toPixelFromDIP(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? PixelUtil.toPixelFromDIP(map.getDouble("height")) : Float.NaN);
    }
}
