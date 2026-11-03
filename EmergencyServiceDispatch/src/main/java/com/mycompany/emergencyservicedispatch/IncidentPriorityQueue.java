
package com.mycompany.emergencyservicedispatch;

public class IncidentPriorityQueue {

    private Incident[] queue;
    private int size;

    public IncidentPriorityQueue() {
        queue = new Incident[100];
        size = 0;
    }

    // Add incident to the priority queue
public boolean addIncident(Incident incident) {

    if (size >= queue.length || incident == null) {
        return false;
    }

    // Check if the incident ID already exists
    for (int i = 0; i < size; i++) {
        if (queue[i].getIncidentID().equalsIgnoreCase(
                incident.getIncidentID())) {
            return false;
        }
    }

    queue[size] = incident;
    size++;

    return true;
}

    // Get priority rank
    private int getPriorityRank(String priority) {

        if (priority.equalsIgnoreCase("Critical")) {
            return 1;
        } else if (priority.equalsIgnoreCase("High")) {
            return 2;
        } else if (priority.equalsIgnoreCase("Medium")) {
            return 3;
        } else if (priority.equalsIgnoreCase("Low")) {
            return 4;
        }

        return 5;
    }

    // Find the highest-priority pending incident
    public Incident getHighestPriorityPending() {

        int highestIndex = -1;
        int highestRank = 5;

        for (int i = 0; i < size; i++) {

            if (queue[i].getStatus().equalsIgnoreCase("Pending")) {

                int currentRank =
                        getPriorityRank(queue[i].getPriority());

                if (currentRank < highestRank) {
                    highestRank = currentRank;
                    highestIndex = i;
                }
            }
        }

        if (highestIndex == -1) {
            return null;
        }

        return queue[highestIndex];
    }

    // Dispatch the highest-priority pending incident
    public Incident dispatchHighestPriority() {

        Incident incident = getHighestPriorityPending();

        if (incident != null) {
            incident.setStatus("Dispatched");
        }

        return incident;
    }

    // Get current number of incidents
    public int getSize() {
        return size;
    }
}
