package com.mycompany.emergencyservicedispatch;

public class AccidentIncident extends Incident {

    public AccidentIncident(String incidentID, String reporterName,
            String contactNumber, String location,
            String description, String priority) {

        super(incidentID, reporterName, contactNumber,
                "Accident", location, description, priority);
    }
}