package o;

import android.net.Uri;
import android.os.Bundle;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final class cancelExitAnimation$ah$a {
    public /* synthetic */ cancelExitAnimation$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private cancelExitAnimation$ah$a() {
    }

    public Uri toString(String str, Bundle bundle) {
        runAnimators.ag$a(str, "action");
        addRetainedFragment addretainedfragment = addRetainedFragment.valueOf;
        addFragmentOnAttachListener addfragmentonattachlistener = addFragmentOnAttachListener.values;
        String ah$a = addFragmentOnAttachListener.ah$a();
        StringBuilder sb = new StringBuilder();
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        sb.append(DefaultSpecialEffectsController.AnonymousClass8.ak());
        sb.append("/dialog/");
        sb.append(str);
        return addRetainedFragment.valueOf(ah$a, sb.toString(), bundle);
    }
}
