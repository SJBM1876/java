class FootballClub {
    String name;
    String location;
    int founded;

    // Override the toString method to provide meaningful output
    @Override
    public String toString() {
        return "FootballClub{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", founded=" + founded +
                '}';
    }

}


public class App {
    public static void main(String[] args) {
        FootballClub footballClub1 = new FootballClub();
        footballClub1.name = "Port Vale";
        footballClub1.location = "Burslem, UK";
        footballClub1.founded = 1876;

        FootballClub footballClub2 = new FootballClub();
        footballClub2.name = "Sandhausen";
        footballClub2.location = "Frankfurt, Germany";
        footballClub2.founded = 1916;

        System.out.println(footballClub1.name);
        System.out.println(footballClub2);
    }
}
