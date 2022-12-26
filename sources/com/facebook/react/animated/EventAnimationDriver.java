package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;
import o.FragmentPagerAdapter;
/* loaded from: classes4.dex */
public class EventAnimationDriver implements RCTEventEmitter {
    private List<String> mEventPath;
    public FragmentPagerAdapter mValueNode;

    public EventAnimationDriver(List<String> list, FragmentPagerAdapter fragmentPagerAdapter) {
        this.mEventPath = list;
        this.mValueNode = fragmentPagerAdapter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        List<String> list;
        ReadableArray array;
        if (writableMap == null) {
            throw new IllegalArgumentException("Native animated events must have event data.");
        }
        ReadableArray readableArray = null;
        for (int i2 = 0; i2 < this.mEventPath.size() - 1; i2++) {
            if (writableMap != null) {
                String str2 = this.mEventPath.get(i2);
                ReadableType type = writableMap.getType(str2);
                if (type == ReadableType.Map) {
                    writableMap = writableMap.getMap(str2);
                    readableArray = null;
                } else if (type != ReadableType.Array) {
                    throw new UnexpectedNativeTypeException("Unexpected type " + type + " for key '" + str2 + "'");
                } else {
                    array = writableMap.getArray(str2);
                    readableArray = array;
                    writableMap = null;
                }
            } else {
                int parseInt = Integer.parseInt(this.mEventPath.get(i2));
                ReadableType type2 = readableArray.getType(parseInt);
                if (type2 == ReadableType.Map) {
                    writableMap = readableArray.getMap(parseInt);
                    readableArray = null;
                } else if (type2 != ReadableType.Array) {
                    throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for index '" + parseInt + "'");
                } else {
                    array = readableArray.getArray(parseInt);
                    readableArray = array;
                    writableMap = null;
                }
            }
        }
        String str3 = this.mEventPath.get(list.size() - 1);
        if (writableMap != null) {
            this.mValueNode.ah$b = writableMap.getDouble(str3);
            return;
        }
        this.mValueNode.ah$b = readableArray.getDouble(Integer.parseInt(str3));
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }
}
