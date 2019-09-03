package com.lix.transit.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class _Edge {
    public String relation;
    public String from;
    public String to;
    public String equityPercent;
    public String name;

    @JsonCreator
    public _Edge(@JsonProperty("relation") String label,
                 @JsonProperty("from") String from,
                 @JsonProperty("to") String to) {
        this.relation = label;
        this.from = from;
        this.to = to;
        this.name = from + "-" + to;
    }

    public _Edge(@JsonProperty("relation") String label,
                 @JsonProperty("from") String from,
                 @JsonProperty("to") String to,
                 @JsonProperty("equityPercent") String equityPercent) {
        this.relation = label;
        this.from = from;
        this.to = to;
        this.equityPercent = equityPercent;
        this.name = from + "-" + to;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s", from, relation, to);
    }
}
