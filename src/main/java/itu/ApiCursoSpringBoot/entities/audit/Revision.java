package itu.ApiCursoSpringBoot.entities.audit;

import itu.ApiCursoSpringBoot.config.CustomRevisionListener;
import jakarta.persistence.*;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;

@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
public class Revision implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @RevisionNumber
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
            name = "revision_seq",
            sequenceName = "rbac.seq_revision_id"
    )
    private int id;

    @RevisionTimestamp
    @Column(name = "REVISION_DATE")
    private Long date;
}
