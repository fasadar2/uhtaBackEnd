package com.example.uhta.entity.processDoc;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "TemplateConnections")
public class TemplateConnection {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ConnectionID", nullable = false)
    private AnalysisElementConnection connectionID;

    @Column(name = "ColumnName", nullable = false, length = 100)
    private String columnName;

    @Column(name = "UpstreamColumnName", nullable = false, length = 100)
    private String upstreamColumnName;

    @Column(name = "InSet", nullable = false)
    private Boolean inSet = false;

    public AnalysisElementConnection getConnectionID() {
        return connectionID;
    }

    public void setConnectionID(AnalysisElementConnection connectionID) {
        this.connectionID = connectionID;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getUpstreamColumnName() {
        return upstreamColumnName;
    }

    public void setUpstreamColumnName(String upstreamColumnName) {
        this.upstreamColumnName = upstreamColumnName;
    }

    public Boolean getInSet() {
        return inSet;
    }

    public void setInSet(Boolean inSet) {
        this.inSet = inSet;
    }

}