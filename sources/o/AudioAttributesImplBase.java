package o;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.giphy.sdk.core.models.enums.RatingType;
import com.giphy.sdk.ui.GPHRequestType;
import com.giphy.sdk.ui.views.GPHVideoControls;
import com.giphy.sdk.ui.views.VideoBufferingIndicator;
/* loaded from: classes7.dex */
public final class AudioAttributesImplBase implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    public final TextView HaptikSDK$b;
    public final TextView HaptikSDK$c;
    private final View HaptikSDK$e;
    public final SimpleDraweeView ag$a;
    public final TextView ah$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$b;
    public final GPHVideoControls getInitSettings;
    public final SurfaceView invoke;
    public final ProgressBar toString;
    public final androidx.constraintlayout.widget.ConstraintLayout valueOf;
    public final VideoBufferingIndicator values;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class Builder {
        public static final /* synthetic */ int[] ag$a;
        public static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[RatingType.values().length];
            ag$a = iArr;
            iArr[RatingType.r.ordinal()] = 1;
            iArr[RatingType.unrated.ordinal()] = 2;
            iArr[RatingType.nsfw.ordinal()] = 3;
            int[] iArr2 = new int[GPHRequestType.values().length];
            ah$a = iArr2;
            iArr2[GPHRequestType.trending.ordinal()] = 1;
            iArr2[GPHRequestType.search.ordinal()] = 2;
            iArr2[GPHRequestType.emoji.ordinal()] = 3;
            iArr2[GPHRequestType.recents.ordinal()] = 4;
            iArr2[GPHRequestType.animate.ordinal()] = 5;
        }
    }

    private AudioAttributesImplBase(View view, VideoBufferingIndicator videoBufferingIndicator, TextView textView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, ProgressBar progressBar, TextView textView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, SurfaceView surfaceView, TextView textView3, androidx.constraintlayout.widget.ConstraintLayout constraintLayout3, GPHVideoControls gPHVideoControls) {
        this.HaptikSDK$e = view;
        this.values = videoBufferingIndicator;
        this.ah$a = textView;
        this.valueOf = constraintLayout;
        this.ag$a = simpleDraweeView;
        this.toString = progressBar;
        this.HaptikSDK$c = textView2;
        this.ah$b = constraintLayout2;
        this.invoke = surfaceView;
        this.HaptikSDK$b = textView3;
        this.HaptikSDK$a = constraintLayout3;
        this.getInitSettings = gPHVideoControls;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.HaptikSDK$e;
    }

    public static AudioAttributesImplBase ah$a(View view) {
        int i = getRawLegacyStreamType$ah$a.bufferingAnimation;
        VideoBufferingIndicator videoBufferingIndicator = (VideoBufferingIndicator) view.findViewById(i);
        if (videoBufferingIndicator != null) {
            i = getRawLegacyStreamType$ah$a.errorMessage;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = getRawLegacyStreamType$ah$a.errorView;
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                if (constraintLayout != null) {
                    i = getRawLegacyStreamType$ah$a.initialImage;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(i);
                    if (simpleDraweeView != null) {
                        i = getRawLegacyStreamType$ah$a.simpleProgressBar;
                        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                        if (progressBar != null) {
                            i = getRawLegacyStreamType$ah$a.subtitles;
                            TextView textView2 = (TextView) view.findViewById(i);
                            if (textView2 != null) {
                                i = getRawLegacyStreamType$ah$a.subtitlesView;
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                                if (constraintLayout2 != null) {
                                    i = getRawLegacyStreamType$ah$a.surfaceView;
                                    SurfaceView surfaceView = (SurfaceView) view.findViewById(i);
                                    if (surfaceView != null) {
                                        i = getRawLegacyStreamType$ah$a.title;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            i = getRawLegacyStreamType$ah$a.titleView;
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                                            if (constraintLayout3 != null) {
                                                i = getRawLegacyStreamType$ah$a.videoControls;
                                                GPHVideoControls gPHVideoControls = (GPHVideoControls) view.findViewById(i);
                                                if (gPHVideoControls != null) {
                                                    return new AudioAttributesImplBase(view, videoBufferingIndicator, textView, constraintLayout, simpleDraweeView, progressBar, textView2, constraintLayout2, surfaceView, textView3, constraintLayout3, gPHVideoControls);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
