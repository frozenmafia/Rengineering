package o;

import com.amazon.identity.auth.device.api.authorization.Region;
/* loaded from: classes.dex */
public final class registerCallbackListener {
    public static final getViewModelStore[] ag$a;
    public static final Region ah$a = Region.EU;
    public static final getViewModelStore[] valueOf;

    static {
        getViewModelStore[] getviewmodelstoreArr = {getLifecycle.ah$a("payments::conduct_silentpay"), getLifecycle.ah$a("profile:user_id")};
        valueOf = getviewmodelstoreArr;
        ag$a = new getViewModelStore[]{getviewmodelstoreArr[0], getviewmodelstoreArr[1], getLifecycle.ah$a("prime:benefit_status")};
    }
}
