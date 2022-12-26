package o;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import o.SpecialEffectsController;
/* loaded from: classes.dex */
public class setNameOverridesReordered extends ClickableSpan implements FragmentViewLifecycleOwner {
    private final int ag$a;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNameOverridesReordered(int i) {
        this.ag$a = i;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, this.ag$a);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new SpecialEffectsController.FragmentStateManagerOperation(UIManagerHelper.getSurfaceId(reactContext), this.ag$a));
        }
    }
}
