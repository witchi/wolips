package org.objectstyle.wolips.eomodeler.core.model;

public class EntityNameCapitalizationFailure extends EOModelVerificationFailure {
	public EntityNameCapitalizationFailure(EOModel model, EOEntity failedObject, String message, boolean warning) {
		super(model, failedObject, message, warning);
	}
}
