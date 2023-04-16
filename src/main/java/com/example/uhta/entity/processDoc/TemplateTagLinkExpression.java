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
@Table(name = "TemplateTagLinkExpressions")
public class TemplateTagLinkExpression {
    @Id
    @Column(name = "TemplateTagID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "TemplateTagID", nullable = false)
    private TemplateTag templateTags;

    @Lob
    @Column(name = "LinkExpression")
    private String linkExpression;



}