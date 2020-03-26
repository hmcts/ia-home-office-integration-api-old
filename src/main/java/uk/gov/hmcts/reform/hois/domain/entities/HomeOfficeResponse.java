package uk.gov.hmcts.reform.hois.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class HomeOfficeAppealData {
   /* @JsonProperty("ho_reference")
    private transient String hoReference;
    @JsonProperty("appeal_decision_sent_date")
    private transient String appealDecisionSentDate;

    *//**
     * Create a stub for now. Return a static response
     *//*
    public HomeOfficeAppealData() {
        this.hoReference = "1234-5678-6789-7890";
        this.appealDecisionSentDate = "20-02-2020";
    }

    public String getAppealDecisionSentDate() {
        return appealDecisionSentDate;
    }

    public String getHoReference() {
        return hoReference;
    }*/

    @JsonProperty('messageHeader')
    private MessageHeader messageHeader;

    private String messageType;

    @JsonProperty('status')
    private Status[] statuses;
}

class Status {
    private DecisionStatus decisionStatus;
    private Person person;
}

class DecisionStatus {
    private boolean appealable;

    @JsonProperty('applicationType')
    private FieldType applicationType;

    @JsonProperty('claimReasonType')
    private FieldType claimReasonType;

    @JsonProperty('decisionCommunication')
    private DecisionCommunication decisionCommunication;

    private String decisionDate;

    @JsonProperty('decisionType')
    private FieldType decisionType;
}

class FieldType {
    private String code;
    private String description;
}

class DecisionCommunication {
    private String description;
    private String sentDate;
    private String type;
}

class Person {
    private int dayOfBirth;
    private String familyName;
    private String fullName;

    @JsonProperty('gender')
    private FieldType gender;

    private String givenName;
    private int monthOfBirth;

    @JsonProperty('nationality')
    private FieldType nationality;

    private int yearOfBirth;
}
