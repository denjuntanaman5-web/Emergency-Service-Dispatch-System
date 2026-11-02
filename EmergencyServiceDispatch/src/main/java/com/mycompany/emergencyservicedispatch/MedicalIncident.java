
    package com.mycompany.emergencyservicedispatch;

public class MedicalIncident extends Incident {

    public MedicalIncident(String incidentID, String reporterName,
            String contactNumber, String location,
            String description, String priority) {

        super(incidentID, reporterName, contactNumber,
                "Medical", location, description, priority);
    }
}

