package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import defpackage.aj;
import o.MediaControllerCompat;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ak {

    /* loaded from: classes.dex */
    public class a extends extraCallback<aj> {
        private static final String ah$a = "ap";
        private static a toString;
        private static final String[] valueOf = aj.values;

        public a(SQLiteDatabase sQLiteDatabase) {
            super(sQLiteDatabase);
        }

        public static a values(Context context) {
            a aVar;
            synchronized (a.class) {
                if (toString == null) {
                    toString = new a(MediaControllerCompat.Callback.StubCompat.values(context));
                }
                aVar = toString;
            }
            return aVar;
        }

        @Override // o.extraCallback
        public String HaptikSDK$b() {
            return "Profile";
        }

        public aj ag$a(String str) {
            return ag$a("AppId", str);
        }

        @Override // o.extraCallback
        public String[] ah$a() {
            return valueOf;
        }

        @Override // o.extraCallback
        /* renamed from: toString */
        public aj ah$a(Cursor cursor) {
            if (cursor == null || cursor.getCount() == 0) {
                return null;
            }
            try {
                aj ajVar = new aj();
                ajVar.toString(cursor.getLong(values(cursor, aj.a.ID.f7a)));
                ajVar.toString(cursor.getString(values(cursor, aj.a.APP_ID.f7a)));
                ajVar.valueOf(extraCallbackWithResult.valueOf(cursor.getString(values(cursor, aj.a.EXPIRATION_TIME.f7a))));
                ajVar.ah$a(cursor.getString(values(cursor, aj.a.DATA.f7a)));
                return ajVar;
            } catch (Exception e) {
                String str = ah$a;
                putEncryptedObject.values(str, "" + e.getMessage(), e);
                return null;
            }
        }

        @Override // o.extraCallback
        public String values() {
            return ah$a;
        }
    }

    /* loaded from: classes.dex */
    public final class b {
        private final JSONObject ah$a = new JSONObject();
        private String toString = "";
        private String valueOf = "";
        private String HaptikSDK$c = "third_party";
        private String HaptikSDK$b = "";
        private String invoke = "";
        private String values = "";
        private JSONObject ag$a = new JSONObject();

        public final JSONObject ag$a() {
            return this.ah$a;
        }

        public final void ag$a(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a.put(SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE, str);
            this.valueOf = str;
        }

        public final String ah$a() {
            return this.valueOf;
        }

        public final void ah$a(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a.put(androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, str);
        }

        public final void toString(JSONObject jSONObject) {
            runAnimators.ag$a(jSONObject, "value");
            this.ah$a.put("custom_data", jSONObject);
        }

        public final String valueOf() {
            return this.toString;
        }

        public final void valueOf(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a.put("signup-type", str);
            this.HaptikSDK$c = str;
        }

        public final String values() {
            return this.HaptikSDK$c;
        }

        public final void values(String str) {
            runAnimators.ag$a(str, "value");
            this.ah$a.put("auth_id", str);
            this.toString = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class valueOf {
        public static final int accessibility_action_clickable_span = 2131361835;
        public static final int accessibility_custom_action_0 = 2131361837;
        public static final int accessibility_custom_action_1 = 2131361838;
        public static final int accessibility_custom_action_10 = 2131361839;
        public static final int accessibility_custom_action_11 = 2131361840;
        public static final int accessibility_custom_action_12 = 2131361841;
        public static final int accessibility_custom_action_13 = 2131361842;
        public static final int accessibility_custom_action_14 = 2131361843;
        public static final int accessibility_custom_action_15 = 2131361844;
        public static final int accessibility_custom_action_16 = 2131361845;
        public static final int accessibility_custom_action_17 = 2131361846;
        public static final int accessibility_custom_action_18 = 2131361847;
        public static final int accessibility_custom_action_19 = 2131361848;
        public static final int accessibility_custom_action_2 = 2131361849;
        public static final int accessibility_custom_action_20 = 2131361850;
        public static final int accessibility_custom_action_21 = 2131361851;
        public static final int accessibility_custom_action_22 = 2131361852;
        public static final int accessibility_custom_action_23 = 2131361853;
        public static final int accessibility_custom_action_24 = 2131361854;
        public static final int accessibility_custom_action_25 = 2131361855;
        public static final int accessibility_custom_action_26 = 2131361856;
        public static final int accessibility_custom_action_27 = 2131361857;
        public static final int accessibility_custom_action_28 = 2131361858;
        public static final int accessibility_custom_action_29 = 2131361859;
        public static final int accessibility_custom_action_3 = 2131361860;
        public static final int accessibility_custom_action_30 = 2131361861;
        public static final int accessibility_custom_action_31 = 2131361862;
        public static final int accessibility_custom_action_4 = 2131361863;
        public static final int accessibility_custom_action_5 = 2131361864;
        public static final int accessibility_custom_action_6 = 2131361865;
        public static final int accessibility_custom_action_7 = 2131361866;
        public static final int accessibility_custom_action_8 = 2131361867;
        public static final int accessibility_custom_action_9 = 2131361868;
        public static final int action_bar = 2131361882;
        public static final int action_bar_activity_content = 2131361883;
        public static final int action_bar_container = 2131361884;
        public static final int action_bar_root = 2131361885;
        public static final int action_bar_spinner = 2131361886;
        public static final int action_bar_subtitle = 2131361887;
        public static final int action_bar_title = 2131361888;
        public static final int action_container = 2131361893;
        public static final int action_context_bar = 2131361894;
        public static final int action_divider = 2131361896;
        public static final int action_image = 2131361901;
        public static final int action_menu_divider = 2131361909;
        public static final int action_menu_presenter = 2131361911;
        public static final int action_mode_bar = 2131361912;
        public static final int action_mode_bar_stub = 2131361913;
        public static final int action_mode_close_button = 2131361914;
        public static final int action_text = 2131361925;
        public static final int actions = 2131361930;
        public static final int activity_chooser_view_content = 2131361934;
        public static final int add = 2131361939;
        public static final int alertTitle = 2131361951;
        public static final int async = 2131362115;
        public static final int blocking = 2131362193;
        public static final int buttonPanel = 2131362314;
        public static final int checkbox = 2131362403;
        public static final int checked = 2131362404;
        public static final int chronometer = 2131362413;
        public static final int content = 2131362508;
        public static final int contentPanel = 2131362510;
        public static final int custom = 2131362622;
        public static final int customPanel = 2131362623;
        public static final int decor_content_parent = 2131362657;
        public static final int default_activity_button = 2131362660;
        public static final int dialog_button = 2131362679;
        public static final int edit_query = 2131362778;
        public static final int expand_activities_button = 2131362928;
        public static final int expanded_menu = 2131362929;
        public static final int forever = 2131363098;
        public static final int fragment_container_view_tag = 2131363111;
        public static final int group_divider = 2131363201;
        public static final int home = 2131363285;
        public static final int icon = 2131363310;
        public static final int icon_group = 2131363315;
        public static final int image = 2131363329;
        public static final int info = 2131363455;
        public static final int italic = 2131363513;
        public static final int line1 = 2131363798;
        public static final int line3 = 2131363799;
        public static final int listMode = 2131363814;
        public static final int list_item = 2131363816;
        public static final int loader = 2131363896;
        public static final int message = 2131363998;
        public static final int multiply = 2131364054;
        public static final int none = 2131364123;
        public static final int normal = 2131364124;
        public static final int notification_background = 2131364134;
        public static final int notification_main_column = 2131364138;
        public static final int notification_main_column_container = 2131364139;
        public static final int off = 2131364149;
        public static final int on = 2131364171;
        public static final int parentPanel = 2131364237;
        public static final int progress_circular = 2131364396;
        public static final int progress_horizontal = 2131364397;
        public static final int radio = 2131364429;
        public static final int right_icon = 2131364526;
        public static final int right_side = 2131364527;
        public static final int screen = 2131364678;
        public static final int scrollIndicatorDown = 2131364680;
        public static final int scrollIndicatorUp = 2131364681;
        public static final int scrollView = 2131364683;
        public static final int search_badge = 2131364690;
        public static final int search_bar = 2131364691;
        public static final int search_button = 2131364692;
        public static final int search_close_btn = 2131364693;
        public static final int search_edit_frame = 2131364694;
        public static final int search_go_btn = 2131364695;
        public static final int search_mag_icon = 2131364696;
        public static final int search_plate = 2131364697;
        public static final int search_src_text = 2131364699;
        public static final int search_voice_btn = 2131364701;
        public static final int select_dialog_listview = 2131364737;
        public static final int shortcut = 2131364784;
        public static final int spacer = 2131364849;
        public static final int special_effects_controller_view_tag = 2131364854;
        public static final int split_action_bar = 2131364860;
        public static final int src_atop = 2131364872;
        public static final int src_in = 2131364873;
        public static final int src_over = 2131364874;
        public static final int submenuarrow = 2131364934;
        public static final int submit_area = 2131364935;
        public static final int tabMode = 2131364973;
        public static final int tag_accessibility_actions = 2131364979;
        public static final int tag_accessibility_clickable_spans = 2131364980;
        public static final int tag_accessibility_heading = 2131364981;
        public static final int tag_accessibility_pane_title = 2131364982;
        public static final int tag_on_apply_window_listener = 2131364983;
        public static final int tag_on_receive_content_listener = 2131364984;
        public static final int tag_on_receive_content_mime_types = 2131364985;
        public static final int tag_screen_reader_focusable = 2131364986;
        public static final int tag_state_description = 2131364987;
        public static final int tag_transition_group = 2131364988;
        public static final int tag_unhandled_key_event_manager = 2131364989;
        public static final int tag_unhandled_key_listeners = 2131364990;
        public static final int tag_window_insets_animation_callback = 2131364991;
        public static final int text = 2131365035;
        public static final int text2 = 2131365036;
        public static final int textSpacerNoButtons = 2131365041;
        public static final int textSpacerNoTitle = 2131365042;
        public static final int time = 2131365102;
        public static final int title = 2131365111;
        public static final int titleDividerNoCustom = 2131365113;
        public static final int title_template = 2131365123;
        public static final int topPanel = 2131365151;
        public static final int unchecked = 2131365824;
        public static final int uniform = 2131365825;
        public static final int up = 2131365829;
        public static final int view_tree_lifecycle_owner = 2131365999;
        public static final int view_tree_saved_state_registry_owner = 2131366000;
        public static final int view_tree_view_model_store_owner = 2131366001;
        public static final int visible_removing_fragment_view_tag = 2131366005;
        public static final int webView = 2131366020;
        public static final int wrap_content = 2131366051;
    }

    /* loaded from: classes.dex */
    public static final class values {
        public static final int abc_action_bar_home_description = 2131886161;
        public static final int abc_action_bar_up_description = 2131886162;
        public static final int abc_action_menu_overflow_description = 2131886163;
        public static final int abc_action_mode_done = 2131886164;
        public static final int abc_activity_chooser_view_see_all = 2131886165;
        public static final int abc_activitychooserview_choose_application = 2131886166;
        public static final int abc_capital_off = 2131886167;
        public static final int abc_capital_on = 2131886168;
        public static final int abc_menu_alt_shortcut_label = 2131886169;
        public static final int abc_menu_ctrl_shortcut_label = 2131886170;
        public static final int abc_menu_delete_shortcut_label = 2131886171;
        public static final int abc_menu_enter_shortcut_label = 2131886172;
        public static final int abc_menu_function_shortcut_label = 2131886173;
        public static final int abc_menu_meta_shortcut_label = 2131886174;
        public static final int abc_menu_shift_shortcut_label = 2131886175;
        public static final int abc_menu_space_shortcut_label = 2131886176;
        public static final int abc_menu_sym_shortcut_label = 2131886177;
        public static final int abc_prepend_shortcut_label = 2131886178;
        public static final int abc_search_hint = 2131886179;
        public static final int abc_searchview_description_clear = 2131886180;
        public static final int abc_searchview_description_query = 2131886181;
        public static final int abc_searchview_description_search = 2131886182;
        public static final int abc_searchview_description_submit = 2131886183;
        public static final int abc_searchview_description_voice = 2131886184;
        public static final int abc_shareactionprovider_share_with = 2131886185;
        public static final int abc_shareactionprovider_share_with_application = 2131886186;
        public static final int abc_toolbar_collapse_description = 2131886187;
        public static final int haptik_base_url = 2131887534;
        public static final int haptik_business_id = 2131887535;
        public static final int haptik_client_id = 2131887536;
        public static final int haptik_default_notification_text = 2131887537;
        public static final int haptik_notification_title = 2131887538;
        public static final int search_menu_title = 2131888960;
        public static final int status_bar_notification_info_overflow = 2131889205;
    }
}
