package o;

import android.content.Context;
import o.AudioFocusRequestCompat;
import o.getRawLegacyStreamType;
/* loaded from: classes4.dex */
public final class getFocusGain extends AudioFocusRequestCompat.Api26Impl {
    private static int HaptikSDK$c;
    private static int invoke;
    private static int values;
    public static final getFocusGain toString = new getFocusGain();
    private static int ah$b = (int) 4283321934L;
    private static int valueOf = (int) 4294046193L;
    private static int getInitSettings = (int) 4289111718L;
    private static int ag$a = (int) 4278190080L;
    private static int HaptikSDK$b = (int) 3233462970L;
    private static int ah$a = (int) 4279374354L;
    private static int HaptikWebView = -1;
    private static int HaptikSDK$d = -12303292;
    private static int getSignupData = 15856113;
    private static int HaptikSDK$e = 15856113;
    private static int HaptikSDK$a = (int) 2852126720L;

    static {
        int i = (int) 4287137928L;
        HaptikSDK$c = i;
        invoke = i;
    }

    private getFocusGain() {
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int HaptikSDK$a() {
        return ah$b;
    }

    public void HaptikSDK$b(int i) {
        ah$b = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int HaptikSDK$b() {
        return HaptikSDK$c;
    }

    public void invoke(int i) {
        HaptikSDK$c = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int ag$a() {
        return valueOf;
    }

    public void valueOf(int i) {
        valueOf = i;
    }

    public void HaptikSDK$c(int i) {
        invoke = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int ah$b() {
        return invoke;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int HaptikWebView() {
        return getInitSettings;
    }

    public void getInitSettings(int i) {
        getInitSettings = i;
    }

    public void ag$a(int i) {
        ag$a = i;
    }

    public void HaptikSDK$a(int i) {
        HaptikSDK$b = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int HaptikSDK$c() {
        return HaptikSDK$b;
    }

    public void ah$a(int i) {
        ah$a = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int values() {
        return ah$a;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int HaptikSDK$e() {
        return HaptikWebView;
    }

    public void HaptikSDK$e(int i) {
        HaptikWebView = i;
    }

    public void HaptikSDK$d(int i) {
        HaptikSDK$d = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int getInitSettings() {
        return HaptikSDK$d;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int HaptikSDK$d() {
        return getSignupData;
    }

    public void HaptikWebView(int i) {
        getSignupData = i;
    }

    public void ah$b(int i) {
        HaptikSDK$e = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int invoke() {
        return HaptikSDK$e;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int ah$a() {
        return values;
    }

    public void values(int i) {
        values = i;
    }

    public void toString(int i) {
        HaptikSDK$a = i;
    }

    @Override // o.AudioFocusRequestCompat.Api26Impl
    public int valueOf() {
        return HaptikSDK$a;
    }

    public final void valueOf(Context context) {
        runAnimators.ag$a(context, "context");
        HaptikSDK$b(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_channel_color_light));
        invoke(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_handle_bar_light));
        valueOf(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_background_light));
        getInitSettings(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_text_color_light));
        ag$a(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_active_text_color_light));
        HaptikSDK$a(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_image_color_light));
        ah$a(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_active_image_color_light));
        HaptikSDK$e(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_search_bar_background_light));
        HaptikSDK$d(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_search_query_light));
        HaptikWebView(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_suggestion_back_light));
        ah$b(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_more_by_you_back_light));
        values(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_back_button_light));
        HaptikSDK$c(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_dialog_overlay_light));
        toString(androidx.core.content.ContextCompat.getColor(context, getRawLegacyStreamType.values.gph_captions_background_color_light));
    }
}
