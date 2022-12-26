package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class LevelInfo implements Serializable {
    private static final long serialVersionUID = 2347228171363417958L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "level")
    private Integer level;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "levelcond")
    private String levelcond;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "levelname")
    private String levelname;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "operator")
    private String operator;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "rules")
    private List<Rule> rules = new ArrayList();

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public String getLevelname() {
        return this.levelname;
    }

    public void setLevelname(String str) {
        this.levelname = str;
    }

    public String getLevelcond() {
        return this.levelcond;
    }

    public void setLevelcond(String str) {
        this.levelcond = str;
    }

    public List<Rule> getRules() {
        return this.rules;
    }

    public void setRules(List<Rule> list) {
        this.rules = list;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String str) {
        this.operator = str;
    }
}
