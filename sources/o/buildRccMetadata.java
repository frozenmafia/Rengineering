package o;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;
import o.MediaSessionCompat;
import o.viewModels;
/* loaded from: classes.dex */
public class buildRccMetadata extends MediaSessionCompat.Callback.MediaSessionCallbackApi21<DocumentData> {
    public buildRccMetadata(List<viewModels.Cdefault<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onSkipToPrevious
    /* renamed from: ah$a */
    public DocumentData valueOf(viewModels.Cdefault<DocumentData> cdefault, float f) {
        if (this.valueOf != null) {
            return (DocumentData) this.valueOf.toString(cdefault.HaptikSDK$c, cdefault.valueOf == null ? Float.MAX_VALUE : cdefault.valueOf.floatValue(), cdefault.HaptikSDK$a, cdefault.values == null ? cdefault.HaptikSDK$a : cdefault.values, f, ah$a(), ah$b());
        } else if (f != 1.0f || cdefault.values == null) {
            return cdefault.HaptikSDK$a;
        } else {
            return cdefault.values;
        }
    }

    public void values(final access$001<String> access_001) {
        final ActivityViewModelLazyKt$viewModels$factoryPromise$1 activityViewModelLazyKt$viewModels$factoryPromise$1 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1();
        final DocumentData documentData = new DocumentData();
        super.toString(new access$001<DocumentData>() { // from class: o.buildRccMetadata.2
            @Override // o.access$001
            /* renamed from: valueOf */
            public DocumentData toString(ActivityViewModelLazyKt$viewModels$factoryPromise$1<DocumentData> activityViewModelLazyKt$viewModels$factoryPromise$12) {
                activityViewModelLazyKt$viewModels$factoryPromise$1.toString(activityViewModelLazyKt$viewModels$factoryPromise$12.HaptikSDK$a(), activityViewModelLazyKt$viewModels$factoryPromise$12.values(), activityViewModelLazyKt$viewModels$factoryPromise$12.HaptikSDK$c().HaptikSDK$c, activityViewModelLazyKt$viewModels$factoryPromise$12.valueOf().HaptikSDK$c, activityViewModelLazyKt$viewModels$factoryPromise$12.ah$a(), activityViewModelLazyKt$viewModels$factoryPromise$12.ag$a(), activityViewModelLazyKt$viewModels$factoryPromise$12.HaptikSDK$b());
                String str = (String) access_001.toString(activityViewModelLazyKt$viewModels$factoryPromise$1);
                DocumentData valueOf = activityViewModelLazyKt$viewModels$factoryPromise$12.ag$a() == 1.0f ? activityViewModelLazyKt$viewModels$factoryPromise$12.valueOf() : activityViewModelLazyKt$viewModels$factoryPromise$12.HaptikSDK$c();
                documentData.values(str, valueOf.ag$a, valueOf.HaptikSDK$a, valueOf.valueOf, valueOf.getSignupData, valueOf.toString, valueOf.values, valueOf.ah$a, valueOf.ah$b, valueOf.HaptikSDK$b, valueOf.invoke);
                return documentData;
            }
        });
    }
}
