package o;

import com.appsamurai.storyly.exoplayer2.core.ExoPlaybackException;
import java.io.IOException;
import o.DocumentsContractCompat;
import o.LocationManagerCompat;
/* loaded from: classes3.dex */
public interface startTimeout extends LocationManagerCompat$GnssLazyLoader$ag$a {
    int HaptikSDK$a();

    DocumentsContractCompat.DocumentsContractApi24Impl HaptikSDK$d();

    int HaptikWebView();

    void ICustomTabsCallback() throws ExoPlaybackException;

    boolean ICustomTabsCallback$Default();

    void ag$a(long j) throws ExoPlaybackException;

    void ah$a(float f, float f2) throws ExoPlaybackException;

    void ah$a(int i, sendUrgentData sendurgentdata);

    void ah$a(long j, long j2) throws ExoPlaybackException;

    void ah$a(createFromIcon[] createfromiconArr, DocumentsContractCompat.DocumentsContractApi24Impl documentsContractApi24Impl, long j, long j2) throws ExoPlaybackException;

    install ah$b();

    void ak() throws IOException;

    void ak$b();

    LocationManagerCompat.GpsStatusTransport b_();

    void extraCallback();

    void extraCallbackWithResult();

    boolean getInitSettings();

    boolean getSignupData();

    long invoke();

    String onNavigationEvent();

    boolean onPostMessage();

    void toString(lambda$onGpsStatusChanged$2$androidxcorelocationLocationManagerCompat$GpsStatusTransport lambda_ongpsstatuschanged_2_androidxcorelocationlocationmanagercompat_gpsstatustransport, createFromIcon[] createfromiconArr, DocumentsContractCompat.DocumentsContractApi24Impl documentsContractApi24Impl, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    void values();
}
