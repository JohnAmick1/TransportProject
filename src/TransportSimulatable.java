import java.util.List;
//method that takes in list of subclasses
    public interface TransportSimulatable {

        public void runTransportSimulation(List<TransportVehicle> vList);

        /**
         * Once a call has been made to runTransportaitonSimulation, the client
         * can call this method and get a String containing some basic info about the
         * most recent simulation, such as Total Passengers from A to B, number
         * injured, and number killed. Also, total passenger hours could be computed as well.
         */
        public String getSimulationResults();
    }

