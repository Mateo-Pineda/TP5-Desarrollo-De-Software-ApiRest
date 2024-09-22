package com.example.demo3.config;

import com.example.demo3.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity;}
}
