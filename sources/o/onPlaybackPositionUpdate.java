package o;

import java.util.Collections;
import o.viewModels;
/* loaded from: classes.dex */
public class onPlaybackPositionUpdate<K, A> extends onSkipToPrevious<K, A> {
    private final A values;

    @Override // o.onSkipToPrevious
    float valueOf() {
        return 1.0f;
    }

    public onPlaybackPositionUpdate(access$001<A> access_001) {
        this(access_001, null);
    }

    public onPlaybackPositionUpdate(access$001<A> access_001, A a) {
        super(Collections.emptyList());
        toString(access_001);
        this.values = a;
    }

    @Override // o.onSkipToPrevious
    public void valueOf(float f) {
        this.ah$a = f;
    }

    @Override // o.onSkipToPrevious
    public void HaptikSDK$c() {
        if (this.valueOf != null) {
            super.HaptikSDK$c();
        }
    }

    @Override // o.onSkipToPrevious
    public A HaptikSDK$a() {
        access$001<A> access_001 = this.valueOf;
        A a = this.values;
        return access_001.toString(0.0f, 0.0f, a, a, ah$b(), ah$b(), ah$b());
    }

    @Override // o.onSkipToPrevious
    A valueOf(viewModels.Cdefault<K> cdefault, float f) {
        return HaptikSDK$a();
    }
}
