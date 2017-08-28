package com.ocadotechnology.newrelic.api.internal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ocadotechnology.newrelic.api.model.conditions.external.AlertsExternalServiceCondition;
import lombok.Value;

@Value
public class AlertsExternalServiceConditionWrapper {
    @JsonProperty("external_service_condition")
    AlertsExternalServiceCondition externalServiceCondition;
}
