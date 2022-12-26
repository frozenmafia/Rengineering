package o;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import o.Transformations;
/* loaded from: classes4.dex */
public final class ViewModelProviderKt$ag$a {
    public final boolean HaptikSDK$a;
    public final boolean HaptikSDK$b;
    public final Boolean HaptikSDK$c;
    public final ImaSdkSettings HaptikSDK$d;
    public final boolean HaptikSDK$e;
    public final int HaptikWebView;
    public final Transformations.AnonymousClass2 ag$a;
    public final AdErrorEvent.AdErrorListener ah$a;
    public final VideoAdPlayer.VideoAdPlayerCallback ah$b;
    public final int getInitSettings;
    public final int getSignupData;
    public final Collection<CompanionAdSlot> invoke;
    public final long toString;
    public final List<String> valueOf;
    public final Set<UiElement> values;

    public ViewModelProviderKt$ag$a(long j, int i, int i2, boolean z, boolean z2, int i3, Boolean bool, List<String> list, Set<UiElement> set, Collection<CompanionAdSlot> collection, AdErrorEvent.AdErrorListener adErrorListener, Transformations.AnonymousClass2 anonymousClass2, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings, boolean z3) {
        this.toString = j;
        this.getSignupData = i;
        this.HaptikWebView = i2;
        this.HaptikSDK$b = z;
        this.HaptikSDK$e = z2;
        this.getInitSettings = i3;
        this.HaptikSDK$c = bool;
        this.valueOf = list;
        this.values = set;
        this.invoke = collection;
        this.ah$a = adErrorListener;
        this.ag$a = anonymousClass2;
        this.ah$b = videoAdPlayerCallback;
        this.HaptikSDK$d = imaSdkSettings;
        this.HaptikSDK$a = z3;
    }
}
