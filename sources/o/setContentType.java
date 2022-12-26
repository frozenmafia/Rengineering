package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.giphy.sdk.ui.views.GPHMediaView;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import o.getRawLegacyStreamType;
/* loaded from: classes7.dex */
public final class setContentType implements androidx.viewbinding.ViewBinding {
    public final TextView HaptikSDK$a;
    public final LinearLayout HaptikSDK$b;
    public final LinearLayout HaptikSDK$c;
    public final GPHMediaView HaptikSDK$d;
    public final GPHMediaView HaptikSDK$e;
    public final TextView HaptikWebView;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final LinearLayout ah$b;
    private final FrameLayout aj$a;
    public final GPHVideoPlayerView ak;
    public final androidx.constraintlayout.widget.ConstraintLayout getInitSettings;
    public final ImageView getSignupData;
    public final TextView invoke;
    public final LinearLayout toString;
    public final androidx.constraintlayout.widget.ConstraintLayout valueOf;
    public final TextView values;

    private setContentType(FrameLayout frameLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, TextView textView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout3, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, TextView textView3, LinearLayout linearLayout4, TextView textView4, GPHMediaView gPHMediaView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout4, GPHMediaView gPHMediaView2, ImageView imageView, GPHVideoPlayerView gPHVideoPlayerView) {
        this.aj$a = frameLayout;
        this.ag$a = constraintLayout;
        this.values = textView;
        this.ah$a = constraintLayout2;
        this.valueOf = constraintLayout3;
        this.toString = linearLayout;
        this.HaptikSDK$b = linearLayout2;
        this.HaptikSDK$a = textView2;
        this.ah$b = linearLayout3;
        this.invoke = textView3;
        this.HaptikSDK$c = linearLayout4;
        this.HaptikWebView = textView4;
        this.HaptikSDK$e = gPHMediaView;
        this.getInitSettings = constraintLayout4;
        this.HaptikSDK$d = gPHMediaView2;
        this.getSignupData = imageView;
        this.ak = gPHVideoPlayerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public FrameLayout getRoot() {
        return this.aj$a;
    }

    public static setContentType toString(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(getRawLegacyStreamType.toString.gph_media_preview_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return values(inflate);
    }

    public static setContentType values(View view) {
        int i = getRawLegacyStreamType$ah$a.actionsContainer;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
        if (constraintLayout != null) {
            i = getRawLegacyStreamType$ah$a.channelName;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = getRawLegacyStreamType$ah$a.dialog_body;
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                if (constraintLayout2 != null) {
                    i = getRawLegacyStreamType$ah$a.dialog_container;
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                    if (constraintLayout3 != null) {
                        i = getRawLegacyStreamType$ah$a.gphActionMore;
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                        if (linearLayout != null) {
                            i = getRawLegacyStreamType$ah$a.gphActionRemove;
                            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                            if (linearLayout2 != null) {
                                i = getRawLegacyStreamType$ah$a.gphActionRemoveText;
                                TextView textView2 = (TextView) view.findViewById(i);
                                if (textView2 != null) {
                                    i = getRawLegacyStreamType$ah$a.gphActionSelect;
                                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                                    if (linearLayout3 != null) {
                                        i = getRawLegacyStreamType$ah$a.gphActionSelectText;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            i = getRawLegacyStreamType$ah$a.gphActionViewGiphy;
                                            LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i);
                                            if (linearLayout4 != null) {
                                                i = getRawLegacyStreamType$ah$a.gphActionViewGiphyText;
                                                TextView textView4 = (TextView) view.findViewById(i);
                                                if (textView4 != null) {
                                                    i = getRawLegacyStreamType$ah$a.mainGif;
                                                    GPHMediaView gPHMediaView = (GPHMediaView) view.findViewById(i);
                                                    if (gPHMediaView != null) {
                                                        i = getRawLegacyStreamType$ah$a.userAttrContainer;
                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
                                                        if (constraintLayout4 != null) {
                                                            i = getRawLegacyStreamType$ah$a.userChannelGifAvatar;
                                                            GPHMediaView gPHMediaView2 = (GPHMediaView) view.findViewById(i);
                                                            if (gPHMediaView2 != null) {
                                                                i = getRawLegacyStreamType$ah$a.verifiedBadge;
                                                                ImageView imageView = (ImageView) view.findViewById(i);
                                                                if (imageView != null) {
                                                                    i = getRawLegacyStreamType$ah$a.videoPlayerView;
                                                                    GPHVideoPlayerView gPHVideoPlayerView = (GPHVideoPlayerView) view.findViewById(i);
                                                                    if (gPHVideoPlayerView != null) {
                                                                        return new setContentType((FrameLayout) view, constraintLayout, textView, constraintLayout2, constraintLayout3, linearLayout, linearLayout2, textView2, linearLayout3, textView3, linearLayout4, textView4, gPHMediaView, constraintLayout4, gPHMediaView2, imageView, gPHVideoPlayerView);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
