import java.util.List;
import java.util.LinkedList;

public class TransportProj {

    public static void main(String[] args){
        TransportationSimulator ts = new TransportationSimulator();

        // call setupVehicleList which returns a pretty set of
        // subclasses with call signs and all that jazz
        // immediately pass the List to our simulator for processing
        ts.runTransportSimulation(setupVehicleList());

        System.out.println("Simulation results: ");
        System.out.println(ts.getSimulationResults());
    }

    /**
     *
     * @return
     */
    public static List<TransportVehicle> setupVehicleList(){
        Bike pedalBike = new Bike();
        pedalBike.setCallSign("Kuwahara Model 3003");

        Schoolbus kidsSchoolbus = new Schoolbus();
        kidsSchoolbus.setCallSign("Ms. Frizzle's Magic School Bus");


        List<TransportVehicle> vList = new LinkedList<>();
        vList.add(pedalBike);
        vList.add(kidsSchoolbus);

        return vList;
    }

    public static double computeTravelTime(TransportVehicle vehicle, double distance){
        return distance/vehicle.getAverageSpeed();
    }
}
