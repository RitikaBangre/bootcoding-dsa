public class Drivecar {
    int distance;
    int NumberofMembers;
    int QuantityOfStop;

    public void Drive(){
        distance = 10;
        NumberofMembers = 6;
        QuantityOfStop = 4;
    }

    public void print(){
        System.out.println("Drive car with distance"+distance+ "with" +NumberofMembers+ "Family Members getting" +QuantityOfStop+ "Stops");
    }
}
