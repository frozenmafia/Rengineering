package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import com.giphy.sdk.ui.views.GifView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import o.getRawLegacyStreamType;
/* loaded from: classes7.dex */
public final class AudioAttributesImpl implements androidx.viewbinding.ViewBinding {
    public final View HaptikSDK$b;
    public final ImageButton HaptikSDK$c;
    public final DefaultTimeBar ag$a;
    public final LottieAnimationView ah$a;
    public final ImageButton ah$b;
    private final View invoke;
    public final LottieAnimationView toString;
    public final ImageButton valueOf;
    public final androidx.constraintlayout.widget.ConstraintLayout values;

    private AudioAttributesImpl(View view, ImageButton imageButton, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, DefaultTimeBar defaultTimeBar, LottieAnimationView lottieAnimationView2, View view2, ImageButton imageButton2, ImageButton imageButton3) {
        this.invoke = view;
        this.valueOf = imageButton;
        this.values = constraintLayout;
        this.ah$a = lottieAnimationView;
        this.ag$a = defaultTimeBar;
        this.toString = lottieAnimationView2;
        this.HaptikSDK$b = view2;
        this.HaptikSDK$c = imageButton2;
        this.ah$b = imageButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.invoke;
    }

    /* loaded from: classes7.dex */
    public final class Builder implements androidx.viewbinding.ViewBinding {
        public final GPHVideoPlayerView HaptikSDK$a;
        public final Button HaptikSDK$b;
        public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$c;
        private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$d;
        public final ImageView HaptikSDK$e;
        public final ImageView HaptikWebView;
        public final GifView ag$a;
        public final LinearLayout ah$a;
        public final TextView ah$b;
        public final ImageView invoke;
        public final androidx.constraintlayout.widget.ConstraintLayout toString;
        public final TextView valueOf;
        public final TextView values;

        private Builder(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, GifView gifView, TextView textView, TextView textView2, LinearLayout linearLayout, ImageView imageView, TextView textView3, androidx.constraintlayout.widget.ConstraintLayout constraintLayout3, Button button, GPHVideoPlayerView gPHVideoPlayerView, ImageView imageView2, ImageView imageView3) {
            this.HaptikSDK$d = constraintLayout;
            this.toString = constraintLayout2;
            this.ag$a = gifView;
            this.values = textView;
            this.valueOf = textView2;
            this.ah$a = linearLayout;
            this.invoke = imageView;
            this.ah$b = textView3;
            this.HaptikSDK$c = constraintLayout3;
            this.HaptikSDK$b = button;
            this.HaptikSDK$a = gPHVideoPlayerView;
            this.HaptikWebView = imageView2;
            this.HaptikSDK$e = imageView3;
        }

        @Override // androidx.viewbinding.ViewBinding
        /* renamed from: valueOf */
        public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
            return this.HaptikSDK$d;
        }

        public static Builder values(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            View inflate = layoutInflater.inflate(getRawLegacyStreamType.toString.gph_video_attribution_view, viewGroup, false);
            if (z) {
                viewGroup.addView(inflate);
            }
            return toString(inflate);
        }

        public static Builder toString(View view) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view;
            int i = getRawLegacyStreamType$ah$a.channelAvatar;
            GifView gifView = (GifView) view.findViewById(i);
            if (gifView != null) {
                i = getRawLegacyStreamType$ah$a.channelName;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = getRawLegacyStreamType$ah$a.giphyHandle;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = getRawLegacyStreamType$ah$a.gphAttributionBack;
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                        if (linearLayout != null) {
                            i = getRawLegacyStreamType$ah$a.gphBackArrow;
                            ImageView imageView = (ImageView) view.findViewById(i);
                            if (imageView != null) {
                                i = getRawLegacyStreamType$ah$a.gphBackText;
                                TextView textView3 = (TextView) view.findViewById(i);
                                if (textView3 != null) {
                                    i = getRawLegacyStreamType$ah$a.gphChannelView;
                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                                    if (constraintLayout2 != null) {
                                        i = getRawLegacyStreamType$ah$a.gphSelectGifBtn;
                                        Button button = (Button) view.findViewById(i);
                                        if (button != null) {
                                            i = getRawLegacyStreamType$ah$a.gphVideoPlayerView;
                                            GPHVideoPlayerView gPHVideoPlayerView = (GPHVideoPlayerView) view.findViewById(i);
                                            if (gPHVideoPlayerView != null) {
                                                i = getRawLegacyStreamType$ah$a.topHandle;
                                                ImageView imageView2 = (ImageView) view.findViewById(i);
                                                if (imageView2 != null) {
                                                    i = getRawLegacyStreamType$ah$a.verifiedBadge;
                                                    ImageView imageView3 = (ImageView) view.findViewById(i);
                                                    if (imageView3 != null) {
                                                        return new Builder(constraintLayout, constraintLayout, gifView, textView, textView2, linearLayout, imageView, textView3, constraintLayout2, button, gPHVideoPlayerView, imageView2, imageView3);
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

    public static AudioAttributesImpl ah$a(View view) {
        View findViewById;
        int i = getRawLegacyStreamType$ah$a.captionsButton;
        ImageButton imageButton = (ImageButton) view.findViewById(i);
        if (imageButton != null) {
            i = getRawLegacyStreamType$ah$a.controls;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
            if (constraintLayout != null) {
                i = getRawLegacyStreamType$ah$a.forwardIcon;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(i);
                if (lottieAnimationView != null) {
                    i = getRawLegacyStreamType$ah$a.progressBar;
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view.findViewById(i);
                    if (defaultTimeBar != null) {
                        i = getRawLegacyStreamType$ah$a.rewindIcon;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view.findViewById(i);
                        if (lottieAnimationView2 != null && (findViewById = view.findViewById((i = getRawLegacyStreamType$ah$a.seekOverlay))) != null) {
                            i = getRawLegacyStreamType$ah$a.soundButton;
                            ImageButton imageButton2 = (ImageButton) view.findViewById(i);
                            if (imageButton2 != null) {
                                i = getRawLegacyStreamType$ah$a.soundButtonOff;
                                ImageButton imageButton3 = (ImageButton) view.findViewById(i);
                                if (imageButton3 != null) {
                                    return new AudioAttributesImpl(view, imageButton, constraintLayout, lottieAnimationView, defaultTimeBar, lottieAnimationView2, findViewById, imageButton2, imageButton3);
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
