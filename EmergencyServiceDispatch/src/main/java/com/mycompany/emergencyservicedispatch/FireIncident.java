 package com.mycompany.emergencyservicedispatch;

public class FireIncident extends Incident {

    public FireIncident(String incidentID, String reporterName,
            String contactNumber, String location,
            String description, String priority) {
        
        super(incidentID, reporterName, contactNumber,
                "Fire", location, description, priority);
    }
}

