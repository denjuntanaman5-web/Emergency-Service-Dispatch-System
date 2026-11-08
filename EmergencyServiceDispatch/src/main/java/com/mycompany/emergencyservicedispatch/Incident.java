
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
    
    // Checks if the priority is valid
    private boolean isValidPriority(String priority) {
    if (priority == null) {
        return false;
    }

    return priority.trim().equalsIgnoreCase("Critical")
            || priority.trim().equalsIgnoreCase("High")
            || priority.trim().equalsIgnoreCase("Medium")
            || priority.trim().equalsIgnoreCase("Low");
}

    // Constructor with input validation
    public Incident(String incidentID, String reporterName,
            String contactNumber, String incidentType,
            String location, String description, String priority) {

        if (incidentID == null || incidentID.trim().isEmpty()) {
            throw new IllegalArgumentException("Incident ID cannot be empty.");
        }

        if (reporterName == null ||
        !reporterName.trim().matches("[a-zA-Z ]{2,}")) {
        throw new IllegalArgumentException(
            "Reporter name must contain at least 2 letters.");
        }

        if (contactNumber == null ||
        !contactNumber.matches("09\\d{9}")) {
        throw new IllegalArgumentException(
            "Contact number must start with 09 and contain exactly 11 digits.");
        }

        if (incidentType == null || incidentType.trim().isEmpty()) {
            throw new IllegalArgumentException("Incident type cannot be empty.");
        }

        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty.");
        }

       if (description == null || description.trim().isEmpty()) {
    throw new IllegalArgumentException("Description cannot be empty.");
}

    String[] words = description.trim().split("\\s+");

    if (words.length < 4) {
    throw new IllegalArgumentException(
        "Description must contain at least 4 words.");
    }

    if (!description.matches(".*[a-zA-Z].*")) {
    throw new IllegalArgumentException(
        "Description must contain letters.");
}

       if (!isValidPriority(priority)) {
       throw new IllegalArgumentException(
            "Priority must be Critical, High, Medium, or Low.");
        }

        this.incidentID = incidentID.trim();
        this.reporterName = reporterName.trim();
        this.contactNumber = contactNumber.trim();
        this.incidentType = incidentType.trim();
        this.location = location.trim();
        this.description = description.trim();
        this.priority = priority.trim();
        this.status = "Pending";
    }

    // Getters
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

    // Setters
    public void setPriority(String priority) {
    if (!isValidPriority(priority)) {
        throw new IllegalArgumentException(
                "Invalid priority. Choose Critical, High, Medium, or Low.");
    }

    this.priority = priority.trim();
}

public void setStatus(String status) {
    if (status == null ||
        !(status.trim().equalsIgnoreCase("Pending")
        || status.trim().equalsIgnoreCase("Dispatched"))) {

        throw new IllegalArgumentException(
                "Invalid status. Choose Pending or Dispatched.");
    }

    this.status = status.trim();
}
}
