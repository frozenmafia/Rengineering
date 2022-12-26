package o;

import java.io.File;
import java.util.concurrent.Callable;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final /* synthetic */ class getHandlingImpl implements Callable {
    public static final /* synthetic */ getHandlingImpl valueOf = new getHandlingImpl();

    private /* synthetic */ getHandlingImpl() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        File extraCallback;
        extraCallback = DefaultSpecialEffectsController.AnonymousClass8.extraCallback();
        return extraCallback;
    }
}
