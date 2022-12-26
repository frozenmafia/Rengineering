package o;

import com.facebook.react.bridge.Callback;
import com.reactnativecommunity.geolocation.GeolocationModule;
/* loaded from: classes7.dex */
public final /* synthetic */ class hasEmptySchema implements Callback {
    public static final /* synthetic */ hasEmptySchema values = new hasEmptySchema();

    private /* synthetic */ hasEmptySchema() {
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object[] objArr) {
        GeolocationModule.lambda$startObserving$7(objArr);
    }
}
