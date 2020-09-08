import Buildings.*;
public class Logic{
    public static void main(String[] args) {
        final BuildingList list =
            new BuildingList();

        // Get the list of houses.
        final House[] house =
            list.getHouses();

        // Get the list of offices.
        final Office[] office =
            list.getOffices();

        Neighborhood.print(house, "Houses");
        System.out.println("");
        Neighborhood.print(office, "Offices");

        System.out.println("");
        System.out.println("Total neighborhood area: " +
                     (Neighborhood.calcArea(house) +
                      Neighborhood.calcArea(office)));

    }
}