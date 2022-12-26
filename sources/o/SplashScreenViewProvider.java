package o;

import com.appsamurai.storyly.exoplayer2.decoder.DecoderException;
/* loaded from: classes3.dex */
public final /* synthetic */ class SplashScreenViewProvider implements findViewHolder {
    public static final /* synthetic */ SplashScreenViewProvider ah$a = new SplashScreenViewProvider();

    /* loaded from: classes3.dex */
    public interface ViewImpl<I, O, E extends DecoderException> {
        void HaptikSDK$b();

        void ah$b();

        O valueOf() throws DecoderException;

        I values() throws DecoderException;

        void values(I i) throws DecoderException;
    }

    /* loaded from: classes3.dex */
    public abstract class ViewImpl31 extends get_splashScreenView {
        public int ah$a;
        public long valueOf;

        /* loaded from: classes3.dex */
        public interface toString<S extends ViewImpl31> {
            void toString(S s);
        }

        public abstract void valueOf();
    }

    private /* synthetic */ SplashScreenViewProvider() {
    }

    @Override // o.findViewHolder
    public final boolean apply(Object obj) {
        return getIconAnimationStartMillis.ag$a((String) obj);
    }
}
