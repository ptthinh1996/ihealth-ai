package com.ihealth.ai.persistence;

import org.hibernate.criterion.Criterion;

import java.util.Collection;

public interface CustomFieldFilter {

	Collection<? extends Criterion> filter(String fieldName, Object value);

}
