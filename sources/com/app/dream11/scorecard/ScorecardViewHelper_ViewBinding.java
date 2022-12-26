package com.app.dream11.scorecard;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import com.fancode.video.FCVideoPlayer;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public final class ScorecardViewHelper_ViewBinding implements Unbinder {
    private ScorecardViewHelper toString;

    public ScorecardViewHelper_ViewBinding(ScorecardViewHelper scorecardViewHelper, View view) {
        this.toString = scorecardViewHelper;
        scorecardViewHelper.scorecardLayout = MediaControllerCompat.Callback.valueOf(view, R.id.scoreContainer, "field 'scorecardLayout'");
        scorecardViewHelper.scoreLt = MediaControllerCompat.Callback.valueOf(view, R.id.score_lt, "field 'scoreLt'");
        scorecardViewHelper.rlTitle = MediaControllerCompat.Callback.valueOf(view, R.id.rl_title, "field 'rlTitle'");
        scorecardViewHelper.score = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.score, "field 'score'", TextView.class);
        scorecardViewHelper.scorecardMsg = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.scorecard_msg, "field 'scorecardMsg'", TextView.class);
        scorecardViewHelper.scoreStatus = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.score_status, "field 'scoreStatus'", TextView.class);
        scorecardViewHelper.fancodeVideoView = (FCVideoPlayer) MediaControllerCompat.Callback.ag$a(view, R.id.fancode_video_view, "field 'fancodeVideoView'", FCVideoPlayer.class);
        scorecardViewHelper.videoControls = MediaControllerCompat.Callback.valueOf(view, R.id.res_0x7f0a1005, "field 'videoControls'");
        scorecardViewHelper.progressBar = (ProgressBar) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0a29, "field 'progressBar'", ProgressBar.class);
        scorecardViewHelper.videoContainer = MediaControllerCompat.Callback.valueOf(view, R.id.brightcove_video_container, "field 'videoContainer'");
        scorecardViewHelper.scoreContainer = MediaControllerCompat.Callback.valueOf(view, R.id.live_score_container, "field 'scoreContainer'");
        scorecardViewHelper.fancodeWatchLiveVideoButton = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.fc_watch_live, "field 'fancodeWatchLiveVideoButton'", CustomTextView.class);
        scorecardViewHelper.matchStatusDot = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.matchStatusDot, "field 'matchStatusDot'", TextView.class);
        scorecardViewHelper.tvMatchStatus = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.tvMatchStatus, "field 'tvMatchStatus'", TextView.class);
        scorecardViewHelper.watchLiveErrorView = MediaControllerCompat.Callback.valueOf(view, R.id.watchLiveErrorView, "field 'watchLiveErrorView'");
        scorecardViewHelper.rewindButton = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.backwardRewindCustomBtn, "field 'rewindButton'", Button.class);
        scorecardViewHelper.forwardButton = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.forwardRewindCustomBtn, "field 'forwardButton'", Button.class);
        scorecardViewHelper.playPauseButton = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.customPlayBtn, "field 'playPauseButton'", Button.class);
        scorecardViewHelper.currentTimeTv = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.tv_current_time, "field 'currentTimeTv'", TextView.class);
        scorecardViewHelper.playerSeekBar = (DefaultTimeBar) MediaControllerCompat.Callback.ag$a(view, R.id.player_seek_bar, "field 'playerSeekBar'", DefaultTimeBar.class);
        scorecardViewHelper.goLiveButton = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.goLiveButton, "field 'goLiveButton'", Button.class);
        scorecardViewHelper.liveVideoIv = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.liveVideoTv, "field 'liveVideoIv'", ImageView.class);
        scorecardViewHelper.imgAdvertisementIcon = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.imgAdvertisementIcon, "field 'imgAdvertisementIcon'", ImageView.class);
        scorecardViewHelper.imgQualityControlsIcon = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.imgQualityControlsIcon, "field 'imgQualityControlsIcon'", Button.class);
        scorecardViewHelper.closeButton = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.closeBtn, "field 'closeButton'", Button.class);
        scorecardViewHelper.muteUnMuteButton = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.muteUnMuteBtn, "field 'muteUnMuteButton'", Button.class);
        scorecardViewHelper.fullScreenButton = (Button) MediaControllerCompat.Callback.ag$a(view, R.id.fullScreenCustomBtn, "field 'fullScreenButton'", Button.class);
        scorecardViewHelper.noDvrViews = MediaControllerCompat.Callback.valueOf(view, R.id.noDvrViews, "field 'noDvrViews'");
    }
}
