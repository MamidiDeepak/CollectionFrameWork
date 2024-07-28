package ex_28072024;

public class BuildingBP_Lab155 {
        public static void main(String[] args) {

            BuildingBP dlf = new BuildingBP();
            dlf.name = "DLF Pvt Builder";
            dlf.noOfRooms = 100;
            dlf.color = "red";

            dlf.useLift();
            System.out.println(dlf.color);
            dlf.activities();


            BuildingBP prestige = new BuildingBP();
            prestige.name = "Prestige Pvt Builder";
            prestige.noOfRooms = 100;
            prestige.color = "blue";

            System.out.println();
            prestige.useLift();
            System.out.println(prestige.color);
            prestige.activities();

        }
    }
