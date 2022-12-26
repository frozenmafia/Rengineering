package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.TouchEventType;
import java.util.HashMap;
import java.util.Map;
import o.destroyItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class UIManagerModuleConstants {
    public static final String ACTION_DISMISSED = "dismissed";
    public static final String ACTION_ITEM_SELECTED = "itemSelected";

    UIManagerModuleConstants() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map getBubblingEventTypeConstants() {
        return destroyItem.ah$a().toString("topChange", destroyItem.values("phasedRegistrationNames", destroyItem.ah$a("bubbled", "onChange", "captured", "onChangeCapture"))).toString("topSelect", destroyItem.values("phasedRegistrationNames", destroyItem.ah$a("bubbled", "onSelect", "captured", "onSelectCapture"))).toString(TouchEventType.getJSEventName(TouchEventType.START), destroyItem.values("phasedRegistrationNames", destroyItem.ah$a("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).toString(TouchEventType.getJSEventName(TouchEventType.MOVE), destroyItem.values("phasedRegistrationNames", destroyItem.ah$a("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).toString(TouchEventType.getJSEventName(TouchEventType.END), destroyItem.values("phasedRegistrationNames", destroyItem.ah$a("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).toString(TouchEventType.getJSEventName(TouchEventType.CANCEL), destroyItem.values("phasedRegistrationNames", destroyItem.ah$a("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map getDirectEventTypeConstants() {
        return destroyItem.ah$a().toString(ContentSizeChangeEvent.EVENT_NAME, destroyItem.values("registrationName", "onContentSizeChange")).toString("topLayout", destroyItem.values("registrationName", ViewProps.ON_LAYOUT)).toString("topPointerEnter", destroyItem.values("registrationName", "onPointerEnter")).toString("topPointerLeave", destroyItem.values("registrationName", "onPointerLeave")).toString("topPointerMove", destroyItem.values("registrationName", "onPointerMove")).toString("topLoadingError", destroyItem.values("registrationName", "onLoadingError")).toString("topLoadingFinish", destroyItem.values("registrationName", "onLoadingFinish")).toString("topLoadingStart", destroyItem.values("registrationName", "onLoadingStart")).toString("topSelectionChange", destroyItem.values("registrationName", "onSelectionChange")).toString("topMessage", destroyItem.values("registrationName", "onMessage")).toString("topClick", destroyItem.values("registrationName", "onClick")).toString("topScrollBeginDrag", destroyItem.values("registrationName", "onScrollBeginDrag")).toString("topScrollEndDrag", destroyItem.values("registrationName", "onScrollEndDrag")).toString("topScroll", destroyItem.values("registrationName", "onScroll")).toString("topMomentumScrollBegin", destroyItem.values("registrationName", "onMomentumScrollBegin")).toString("topMomentumScrollEnd", destroyItem.values("registrationName", "onMomentumScrollEnd")).valueOf();
    }

    public static Map<String, Object> getConstants() {
        HashMap values = destroyItem.values();
        values.put("UIView", destroyItem.values("ContentMode", destroyItem.ah$a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        values.put("StyleConstants", destroyItem.values("PointerEventsValues", destroyItem.toString("none", Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        values.put("PopupMenu", destroyItem.ah$a(ACTION_DISMISSED, ACTION_DISMISSED, ACTION_ITEM_SELECTED, ACTION_ITEM_SELECTED));
        values.put("AccessibilityEventTypes", destroyItem.ah$a("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return values;
    }
}
