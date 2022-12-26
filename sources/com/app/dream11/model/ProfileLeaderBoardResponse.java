package com.app.dream11.model;

import com.app.dream11.model.viewmodel.LeaderBoardViewItem;
import java.util.List;
/* loaded from: classes3.dex */
public class ProfileLeaderBoardResponse {
    List<Leaderboard> leaderboard;
    List<LeaderTours> tours;
    List<LeaderBoardViewItem> viewItems;

    public List<LeaderTours> getTours() {
        return this.tours;
    }

    public List<Leaderboard> getLeaderboard() {
        return this.leaderboard;
    }

    public void setTours(List<LeaderTours> list) {
        this.tours = list;
    }

    public void setLeaderboard(List<Leaderboard> list) {
        this.leaderboard = list;
    }

    public List<LeaderBoardViewItem> getViewItems() {
        return this.viewItems;
    }

    public void setViewItems(List<LeaderBoardViewItem> list) {
        this.viewItems = list;
    }
}
