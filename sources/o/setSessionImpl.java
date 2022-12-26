package o;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class setSessionImpl implements onPlay, onSkipToPrevious$ag$a {
    private final onSkipToPrevious<?, Float> HaptikSDK$b;
    private final String ag$a;
    private final boolean ah$a;
    private final ShapeTrimPath.Type ah$b;
    private final onSkipToPrevious<?, Float> toString;
    private final onSkipToPrevious<?, Float> valueOf;
    private final List<onSkipToPrevious$ag$a> values = new ArrayList();

    @Override // o.onPlay
    public void valueOf(List<onPlay> list, List<onPlay> list2) {
    }

    public setSessionImpl(MediaSessionCompat.QueueItem.Api21Impl api21Impl, ShapeTrimPath shapeTrimPath) {
        this.ag$a = shapeTrimPath.valueOf();
        this.ah$a = shapeTrimPath.HaptikSDK$b();
        this.ah$b = shapeTrimPath.invoke();
        onSkipToPrevious<Float, Float> valueOf = shapeTrimPath.values().valueOf();
        this.HaptikSDK$b = valueOf;
        onSkipToPrevious<Float, Float> valueOf2 = shapeTrimPath.ag$a().valueOf();
        this.valueOf = valueOf2;
        onSkipToPrevious<Float, Float> valueOf3 = shapeTrimPath.ah$a().valueOf();
        this.toString = valueOf3;
        api21Impl.values(valueOf);
        api21Impl.values(valueOf2);
        api21Impl.values(valueOf3);
        valueOf.toString(this);
        valueOf2.toString(this);
        valueOf3.toString(this);
    }

    @Override // o.onSkipToPrevious$ag$a
    public void ah$a() {
        for (int i = 0; i < this.values.size(); i++) {
            this.values.get(i).ah$a();
        }
    }

    @Override // o.onPlay
    public String valueOf() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(onSkipToPrevious$ag$a onskiptoprevious_ag_a) {
        this.values.add(onskiptoprevious_ag_a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShapeTrimPath.Type invoke() {
        return this.ah$b;
    }

    public onSkipToPrevious<?, Float> HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public onSkipToPrevious<?, Float> values() {
        return this.valueOf;
    }

    public onSkipToPrevious<?, Float> ag$a() {
        return this.toString;
    }

    public boolean ah$b() {
        return this.ah$a;
    }
}
