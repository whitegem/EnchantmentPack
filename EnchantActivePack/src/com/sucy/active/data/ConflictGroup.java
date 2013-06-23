package com.sucy.active.data;

public enum ConflictGroup {

    DEFAULT ("默认"),
    FORCE ("强制"),
    ;

    private final String group;

    private ConflictGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}
