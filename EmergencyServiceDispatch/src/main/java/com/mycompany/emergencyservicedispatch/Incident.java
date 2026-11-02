
package com.mycompany.emergencyservicedispatch;

public class Incident {

    // Encapsulation: private fields
    private String incidentID;
    private String reporterName;
    private String contactNumber;
    private String incidentType;
    private String location;
    private String description;
    private String priority;
    private String status;

    // Constructor
    public Incident(String incidentID, String reporterName,
            String contactNumber, String incidentType,
            String location, String description, String priority) {

        this.incidentID = incidentID;
        this.reporterName = reporterName;
        this.contactNumber = contactNumber;
        this.incidentType = incidentType;
        this.location = location;
        this.description = description;
        this.priority = priority;
        this.status = "Pending";
    }

    // Getters and Setters
    public String getIncidentID() {
        return incidentID;
    }

    public String getReporterName() {
        return reporterName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
