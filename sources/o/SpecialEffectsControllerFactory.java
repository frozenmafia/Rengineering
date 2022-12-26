package o;

import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final /* synthetic */ class SpecialEffectsControllerFactory implements applyState$ag$a {
    public static final /* synthetic */ SpecialEffectsControllerFactory valueOf = new SpecialEffectsControllerFactory();

    private /* synthetic */ SpecialEffectsControllerFactory() {
    }

    @Override // o.applyState$ag$a
    public final JSONObject valueOf(SharePhoto sharePhoto) {
        JSONObject ag$a;
        ag$a = mergeWith.ag$a(sharePhoto);
        return ag$a;
    }
}
