package com.app.dream11.playerpoints;

import java.io.Serializable;
import java.util.ArrayList;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PreviewPlayersStatsItem implements Serializable {
    private double credits;
    private boolean inDreamTeam;
    private boolean mTabShouldVisible;
    private int playerId;
    private double points;
    private double selectionRate;
    private String src = "";
    private String name = "";
    private ArrayList<PreviewPlayersPointBreakup> mFirstInningPointBreakup = new ArrayList<>();
    private ArrayList<PreviewPlayersPointBreakup> mSecondInningPointBreakup = new ArrayList<>();

    public final int getPlayerId() {
        return this.playerId;
    }

    public final void setPlayerId(int i) {
        this.playerId = i;
    }

    public final String getSrc() {
        return this.src;
    }

    public final void setSrc(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.src = str;
    }

    public final double getCredits() {
        return this.credits;
    }

    public final void setCredits(double d) {
        this.credits = d;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.name = str;
    }

    public final double getPoints() {
        return this.points;
    }

    public final void setPoints(double d) {
        this.points = d;
    }

    public final double getSelectionRate() {
        return this.selectionRate;
    }

    public final void setSelectionRate(double d) {
        this.selectionRate = d;
    }

    public final boolean getInDreamTeam() {
        return this.inDreamTeam;
    }

    public final void setInDreamTeam(boolean z) {
        this.inDreamTeam = z;
    }

    public final ArrayList<PreviewPlayersPointBreakup> getMFirstInningPointBreakup() {
        return this.mFirstInningPointBreakup;
    }

    public final void setMFirstInningPointBreakup(ArrayList<PreviewPlayersPointBreakup> arrayList) {
        runAnimators.ag$a(arrayList, "<set-?>");
        this.mFirstInningPointBreakup = arrayList;
    }

    public final ArrayList<PreviewPlayersPointBreakup> getMSecondInningPointBreakup() {
        return this.mSecondInningPointBreakup;
    }

    public final void setMSecondInningPointBreakup(ArrayList<PreviewPlayersPointBreakup> arrayList) {
        runAnimators.ag$a(arrayList, "<set-?>");
        this.mSecondInningPointBreakup = arrayList;
    }

    public final boolean getMTabShouldVisible() {
        return this.mTabShouldVisible;
    }

    public final void setMTabShouldVisible(boolean z) {
        this.mTabShouldVisible = z;
    }

    /* loaded from: classes3.dex */
    public static final class PreviewPlayersPointBreakup implements Serializable {
        private String score = "";
        private String actual = "";
        private String name = "";

        public final String getScore() {
            return this.score;
        }

        public final void setScore(String str) {
            runAnimators.ag$a(str, "<set-?>");
            this.score = str;
        }

        public final String getActual() {
            return this.actual;
        }

        public final void setActual(String str) {
            runAnimators.ag$a(str, "<set-?>");
            this.actual = str;
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            runAnimators.ag$a(str, "<set-?>");
            this.name = str;
        }
    }
}
