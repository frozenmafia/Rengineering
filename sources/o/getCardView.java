package o;

import java.util.HashMap;
import okhttp3.HttpUrl;
/* loaded from: classes3.dex */
public class getCardView {
    public static final HashMap<String, Object> ah$a = new HashMap<String, Object>() { // from class: com.app.dream11.firebase.FirebaseConstants$1
        {
            put("should_redirect_guru_to_fancode", false);
            put("show_team_share_overlay", false);
            put("show_leaderboard_overlay", false);
            put("show_tab_overlay", false);
            put("show_tab_skip_overlay", false);
            put("min_winningbal_req_for_verification", 0L);
            put("prioritize_wallet_payment", false);
            put("should_show_offers", true);
            put("offersInfoMessage", "Each code can be redeemed for Cash Bonus once. Codes can be earned on 3rd Party Apps or through exclusive Promotions");
            put("skip_recharge_screen", false);
            put("show_my_contest_carousel", false);
            put("should_show_feeds", true);
            put("image_cache_version", 1);
            put("should_override_withdraw", false);
            put("add_cash_min_amt", 5L);
            put("show_team_compare", true);
            put("show_upi_intent_flow", false);
            put("is_compression_enabled", true);
            put("is_rn_winners_tab_enabled", false);
            put("compression_quality", 100L);
            put("in_house_analytics_enabled", false);
            put("dfp_enabled", false);
            put("dfp_user_id", 0);
            put("is_download_invoice_enabled", true);
            put("is_fancode_video_deeplink_enable", true);
            put("is_cropping_enable", false);
            put("feed_post_text_character_limit", 280L);
            put("show_user_subscribed_notification", false);
            put("is_sso_enabled", false);
            put("is_group_chat_enabled", true);
            put("show_change_mobile_option", false);
            put("show_change_email_option", false);
            put("is_payment_landing_refactor_screen", false);
            put("auto_rotate_timer", 4L);
            put("min_recharge_amount", "100");
            put("upi_warning_amount", 0);
            put("upi_warning_msg", "Payments less than ₹1 cannot be processed.");
            put("perf_disable", false);
            put("group_user_ban_time_in_seconds", 10L);
            put("user_search_query_start_limit", 3L);
            put("is_group_unread_count_enabled_home", true);
            put("is_group_unread_count_enabled_leaderboard", true);
            put("is_group_unread_count_enabled_contest", true);
            put("should_show_new_score_card", true);
            put("is_lmp_enable", false);
            put("should_show_notification_revamp", true);
            put("image_compression_quality", 100L);
            put("score_card_poll_time", 10L);
            put("phonebook_sync_page_size", 100L);
            put("is_api_response_time_enable", false);
            put("installed_app_dialog_time", 0L);
            put("should_show_ball_by_ball_score", true);
            put("should_show_d11_profile_empty_state", false);
            put("default_tab_selection_index", 0L);
            put("hof_team_preview_enabled", true);
            put("should_show_fantasy_research", false);
            put("show_fc_ipl_merchandise", false);
            put("show_fc_puma_merchandise", false);
            put("fc_ipl_merchandise_url", "https://shop.fancode.com/collections/dream11-originals");
            put("fc_puma_merchandise_url", "https://shop.fancode.com/collections/dream11-x-puma?utm_source=d11&utm_medium=feedbanner&utm_campaign=ipl-week1");
            put("disable_onboarding", false);
            put("should_send_payment_debug_event", false);
            put("is_comment_on_feed_enabled", false);
            put("empty_state_situational_message", "");
            put("dpl_deep_link", "");
            put("enable_comments_hyperlink", false);
            put("api_response_latency_threshold", 0L);
            put("contest_share_max_group_limit", 1L);
            put("should_show_new_fantasy_scorecard", true);
            put("profile_picture_upload", false);
            put("new_label_profile_picture", false);
            put("should_show_new_team_preview", true);
            put("show_hof_on_bottom_bar", true);
            put("should_show_weekly_leaderboard", false);
            put("analytics_events_batching_size", 10L);
            put("analytics_events_batching_duration", 3L);
            put("should_show_absolute_number_constest_stat", false);
            put("should_show_toss_result", true);
            put("should_show_portrait_video", false);
            put("should_show_pip_video", false);
            put("number_of_recent_performances", "4");
            put("should_enable_player_preview", true);
            put("should_show_add_cash_offers", false);
            put("should_show_add_cash_promo", false);
            put("community_guidelines_url", "");
            put("should_show_privacy_settings", false);
            put("leaderboard_filter_enabled", false);
            put("should_fetch_appsflyer_data", true);
            put("should_ask_installed_apps_permission", true);
            put("show_wallet_on_home", true);
            put("add_cash_max_amount", 25000L);
            put("add_contacts_to_groups_max_limit", 100);
            put("payments_Logo_url", "https://d11.s3.amazonaws.com/contain/payment_partner.png");
            put("dreampay_cards_icon_url", "https://d13ir53smqqeyp.cloudfront.net/mobile/apps/site/cards/");
            put("is_hindi_share_enabled", false);
            put("chat_background_image", "");
            put("group_leaderborad_url", "");
            put("show_career_stats_drill_down_screen", false);
            put("group_leaderboard_v2", false);
            put("firstperson_careerstats_enable", false);
            put("show_profile_recent_common_match_component", false);
            put("should_post_frc_error", true);
            put("leaderboard_subscription_jitter", 5L);
            put("max_connect_retries", 5L);
            put("ws_autoclose_start_min", 5L);
            put("ws_autoclose_end_min", 10L);
            put("show_full_scorecard", true);
            put("should_show_commentary_tab", true);
            put("bigger_profile_pic_enabled", true);
            put("should_show_recommended_profile_on_user_search", false);
            put("should_refresh_home", true);
            put("is_rn_manage_payments_enabled", true);
            put("is_first_person_profile_enable", false);
            put("socket_bkgd_timeout", 10L);
            put("get_title_for_lineup_status", "{\"statusTitles\":[{\"X_FACTOR_SUBSTITUTE\":\"X-Factor Substitutes\"}]}");
            put("is_gif_in_groups_enabled", false);
            put("show_tds_winning_breakup", true);
            put("should_show_global_leaderboard", false);
            put("should_show_new_tag_global_leaderboard", false);
            put("should_check_entryfee", false);
            put("enable_new_team_compare", true);
            put("is_bugsnag_enabled", false);
            put("should_show_create_dynamic_option", true);
            put("invite_friends_header_text", "Earn for telling people about us!");
            put("invite_friends_subtitle_text", "Invite your friends and earn when they play!");
            put("invite_message_text", "Think you can beat me? Join me on Dream11 and let's play fantasy sports!  \n1. Download the app using the link below \n2. Register using my invite code <INVITE-CODE>\n3. Use your discount to join contests \nLet the games begin!\n<APP-LINK>");
            put("invite_message_text_hindi", "क्या आप जीतने के लिए तैयार हैं? आप भी Dream11 पर हर दिन जीत सकते हैं. केवल इस लिंक <APP-LINK> पर क्लिक कर ऐप डाउनलोड करें और रजिस्टर करें मेरे Invite Code <INVITE-CODE> के साथ.");
            put("mybalance_invite_earn_text", "Low on cash? Earn for inviting friends!");
            put("invited_friends_text", "When your invited friends play, both of you win!");
            put("should_show_referral_bonus_toast", false);
            put("should_show_refer_new_lbl", false);
            put("side_nav_invite_friends_title", "Invite & Earn");
            put("is_user_properties_gql_enabled", true);
            put("is_fpv_gql_enabled", true);
            put("IS_DM_ENABLE", true);
            put("show_season_long_in_side_nav", false);
            put("should_show_rp_in_more_tabs", false);
            put("is_guest_token_gql_enabled", false);
            put("url_for_rp_in_more_tabs", "https://www.dream11.com/games/responsible-play-policy");
            put("is_gql_profile_lite_enabled", true);
            put("mobile_verify_bottomsheet_contact_link", "https://get.dream11.help/hc/en-us/articles/900005519346-I-m-not-able-to-log-in-using-the-Social-Login-option-What-should-I-do-now");
            put("is_streaks_enabled", true);
            put("is_user_notification_key_gql_enabled", false);
            put("is_profile_v3_gql_enabled", false);
            put("should_display_rematch", false);
            put("is_rn_rematch_enabled", false);
            put("should_display_contest_rematch", false);
            put("enable_responsible_play_banner", false);
            put("use_unread_count_v2", false);
            put("is_awards_enabled", false);
            put("is_awards_enabled_v1", true);
            put("is_new_contest_share_enable", false);
            put("is_rn_notification_center_enabled", false);
            put("should_show_unauthorised_mess", true);
            put("show_manual_upc_flow", false);
            put("save_appsflyer_params", false);
            put("show_change_city_option", false);
            put("show_change_address_option", false);
            put("show_change_zipcode_option", false);
            put("is_rn_add_cash_payments_enabled", false);
            put("is_rn_rewards_enabled", false);
            put("show_rn_team_compare_v1", false);
            put("show_feed_sidenav_new_tag", false);
            put("is_rn_mybalance_enabled", false);
            put("is_rn_team_preview_enabled", false);
            put("rn_my_contacts_enabled_v2", false);
            put("rn_find_people_enabled_v2", false);
            put("is_rn_postrl_playerinfo_enabled", false);
            put("rn_recommended_profile_enabled_v2", false);
            put("rn_follow_friends_enabled_v2", false);
            put("is_rn_sidenav_leaderboard_enabled_v2", false);
            put("is_rn_career_stats_enabled_v2", false);
            put("group_leaderboard_tour_id", -1);
            put("group_leaderboard_banner_image", "");
            put("chat_tab_info_url", "https://www.dream11.com/games/emailer_pages/d11-more-social");
            put("is_rn_verification_flow_enabled", false);
            put("show_haptik_chat_sdk", false);
            put("show_na_player_info", true);
            put("is_rn_create_team_enabled", false);
            put("is_rn_tds_breakup_enabled", false);
            put("is_rn_app_permission_bs_enabled", false);
            put("is_rn_cancelled_contest_enabled", false);
            put("rn_migration_view_all", false);
            put("is_rn_contest_home_enabled", false);
            put("is_rn_quick_check_enabled", false);
            put("is_rn_upc_enabled", false);
            put("rn_migration_fps", false);
            put("rn_migration_private_contest", false);
            put("rn_migration_onboarding_journey", false);
            put("is_rn_match_center_enabled", false);
            put("is_jsi_start_flow_send_event_enabled", false);
            put("is_rn_chat_enabled", false);
            put("is_rn_app_update", false);
            put("is_rn_add_participant_enabled", false);
            put("is_rn_select_team_enabled_v2", false);
            put("is_rn_switch_team_enabled_v2", false);
            put("is_rn_private_contest_share_enabled", false);
            put("help_desk_url", "https://get.dream11.help/hc/en-us?openExternal=true");
            put("request_ticket_history_url", "https://get.dream11.help/hc/en-us/requests?openExternal=true");
            put("contest_invite_rn", false);
            put("is_rn_contest_create_from_social_enabled", false);
            put("rn_migration_contest_section", false);
            put("rn_migration_contest_detail_pre_rl", false);
            put("should_wait_drs_onlogin", false);
            put("rn_migration_my_matches", false);
            put("is_quick_join_enabled", false);
            put("is_automatic_contest_enabled", false);
            put("levels_sunset_url", "https://dream11.com/games/levels-sunset");
            put("is_skill_score_side_nav_enabled", false);
            put("is_private_contest_enabled", false);
            put("show_head_to_head_dm", true);
            put("is_chat_list_h2h_enabled", true);
            put("is_skill_score_enabled", false);
            put("is_dr_contest_home_enabled", false);
            put("is_dr_contest_leadearboard_enabled", false);
            put("is_new_loyalty_program_enabled", false);
            put("multiple_admin_enabled", false);
            put("is_localisation_enabled", false);
            put("network_in_contest_enabled", false);
            put("network_in_match_enabled", false);
            put("network_in_post_rl", false);
            put("team_share_enabled", false);
            put("is_Sum_Duration_Enable", true);
            put("is_ms_fraud_prevention_sdk_enabled", false);
            put("season_long_banner_url", "https://d13ir53smqqeyp.cloudfront.net/contain/site-banners/SideNav_IPL2022Banner.webp");
            put("season_long_title", "TATA IPL Season-long Fantasy");
            put("season_long_redirect_url", "https://fantasy.iplt20.com/season/home?appType=androidfull");
            put("is_state_on_ct_enabled", false);
            put("show_playing_style", false);
            put("is_upi_withdrawal_enabled", false);
            put("promoted_tour_ids_for_home", 2419);
            put("is_clevertap_app_inbox_enabled", false);
            put("promotional_match_card_finals_player_image_base_url", "https://d13ir53smqqeyp.cloudfront.net/d11-static-pages/images/IPL_Final_Player_.webp");
            put("is_tour_statics_enabled", false);
            put("deposit_roundlock_view_visibility_min_millis", 600000);
            put("should_enable_push_leaderboard", true);
            put("is_rn_invite_friend_enabled", false);
            put("rn_rematch_leaderboard_enabled", false);
            put("is_fc_csl_enabled", false);
            put("is_rn_privacy_settings_enabled", false);
            put("is_rn_blocked_users_enabled", false);
            put("should_show_unnnounced_players_bs", false);
            put("is_tier_enabled", false);
            put("show_reactions_in_chat", false);
            put("is_app_inbox_enable", false);
            put("should_prefill_mobile_number", false);
            put("is_stories_enabled", false);
            put("force_app_install_from_web", false);
            put("enable_geo_block_contest_join", true);
            put("enable_geo_block_add_cash", true);
            put("enable_geo_block_via_rn", true);
            put("is_location_permission_on_reward_enabled", false);
            put("disable_kyc_in_qc", false);
            put("is_world_cup_diwali_offer_visible", false);
            put("promotional_campaign_webview_url", "https://www.dream11.com\n");
            put("world_cup_diwali_offer_message", "{\"en-US\": \"Diwali Offer is now live!\", \"hi-IN\": \"ड्रीम दिवाली ऑफर अब लाइव हैं!\"}");
            put("is_quick_join_phase_2_enabled", false);
            put("show_chat_banners", false);
            put("is_bottom_nav_dc_anime_enabled", false);
            put("bottom_nav_dc_anime_count", 0);
            put("should_show_rewards_in_middle", false);
            put("qc_enable_address_document_upload", false);
            put("qc_aadhaar_verification_enabled", false);
            put("qc_aadhaar_verification_polling_interval", 3000);
            put("qc_aadhaar_verification_polling_count", 5);
            put("aadhaar_verification_result_url", "https://capture.kyc.idfy.com/document-fetcher/digilocker/callback/");
            put("aadhaar_verification_polling_interval", 5000);
            put("aadhaar_verification_polling_count", 5);
            put("disabled_languages", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            put("enable_aadhaar_verification", true);
            put("enable_quick_kyc", true);
            put("is_rn_migration_my_teams_post_rl", false);
            put("is_rn_migration_player_stats", false);
            put("is_rn_migration_fantasy_commentary", false);
            put("enable_rn_full_scorecard", false);
            put("is_rn_migration_leaderboard", false);
            put("enable_rn_my_network", false);
            put("is_rn_migration_my_contests", false);
            put("is_rn_migration_winnings_postrl", false);
            put("should_show_fomo_drawer", false);
            put("refresh_token_retry_count", 3);
            put("refresh_token_retry_interval", 700L);
            put("is_dreambox_enabled", false);
            put("should_send_retry_event", true);
            put("is_2_code_flow_enabled", false);
            put("my_matches_page_size", 10);
            put("should_show_grouping_in_create_team", false);
            put("should_skip_player_name_experiment", false);
            put("fc_dai_sdk_type", "NO_SDK");
            put("onboarding_qc_post_ct", false);
            put("is_chat_list_gl_band_enabled", false);
            put("useNativeDriverForTransitions", true);
            put("fc_enable_ssai_contest_free", false);
            put("fc_enable_ssai_contest_paid", false);
            put("fc_enable_ad_ui_contest_free", false);
            put("fc_enable_ad_ui_contest_paid", false);
        }
    };
}
