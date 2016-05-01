package com.fasterxml.jackson.databind.deser;

import java.util.Set;

public class IgnorableBeanProperty {

	private final Set<String> ignoredBeanProperty;
	
	public IgnorableBeanProperty(Set<String> ignoredBeanProperty) {
		this.ignoredBeanProperty = ignoredBeanProperty;
	}
	
	public Set<String> getIgnoredBeanProperty() {
		return this.ignoredBeanProperty;
	}
	
	public boolean isIgnoredBeanPropertyPresent() {
		return this.ignoredBeanProperty.size() > 0;
	}
	
}
