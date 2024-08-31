import java.util.Scanner;

public class PeriodicTable {

    static String[] name = {"Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon",
            "Sodium", "Magnesium", "Aluminium", "Silicon", "Phosphorus", "Sulfur", "Chlorine", "Argon",
            "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc",
            "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton",
            "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium",
            "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon",
            "Cesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium",
            "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium",
            "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon",
            "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium",
            "Californium", "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium",
            "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium"};

    static String[] symbol = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne",
            "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar",
            "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
            "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe",
            "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu",
            "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn",
            "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr",
            "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn"};

    static double[] weight = {1.00, 4.00, 6.94, 9.01, 10.81, 12.01, 14.00, 16.00, 20.00, 20.18, 23.00, 24.31, 26.99, 28.08, 30.97, 32.06, 35.45, 39.09, 40.07, 44.95, 47.86, 50.94,
            51.99, 54.93, 55.84, 58.69, 58.93, 63.54, 65.39, 69.7, 72.64, 74.92, 78.96, 79.90, 83.80, 85.46, 87.62, 88.90, 91.22, 92.90, 95.94, 98.00, 101.07,
            102.90, 106.42, 107.86, 112.41, 114.81, 118.71, 121.76, 127.6, 126.90, 131.29, 13.90, 137.32, 138.90, 140.11, 140.90, 144.24, 145.00,
            150.36, 151.96, 157.25, 158.92, 162.50, 164.93, 167.5, 168.93, 173.04, 174.96, 178.49, 180.94, 183.84, 186.20, 190.23, 192.21, 195.07, 196.97,
            200.59, 204.38, 207.20, 208.98, 209.00, 210.00, 222.00, 223.00, 226.00, 227.00, 231.03, 232.03, 237.00, 238.03, 243, 244, 247, 247, 251, 252, 257, 258,
            259, 261, 262, 264, 266, 268, 272, 277, 276, 281, 280, 285};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 999, option;
        do {
            option = getOption(scanner);
            char ch1, ch2;
            switch (option) {
                case 1:
                    i = atomicNumber(scanner);
                    break;
                case 2:
                    i = atomicSymbol(scanner);
                    break;
                case 3:
                    i = atomicName(scanner);
                    break;
                case 4:
                    i = atomicWeight(scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("\nWrong Choice!\nLet's try it again, Shall we?\n");
            }
            if (i == -1) {
                System.out.println("\nOops! No such element present! Make a right choice this time!\n");
            } else if (i == 999) {
                continue;
            } else {
                ch1 = block(i);
                ch2 = property(i);
                show(i, ch1, ch2);
            }
            i = 999;
        } while (option != 5);
    }

    static int getOption(Scanner scanner) {
        System.out.println("\nEnter the corresponding number:\n");
        System.out.println("1. Search by ATOMIC NUMBER");
        System.out.println("2. Search by ATOMIC SYMBOL");
        System.out.println("3. Search by ATOMIC NAME");
        System.out.println("4. Search by ATOMIC WEIGHT");
        System.out.println("5. QUIT");
        System.out.print("Enter Your Choice: ");
        return scanner.nextInt();
    }

    static int atomicNumber(Scanner scanner) {
        System.out.print("Enter the Atomic Number you want to search for: ");
        int n = scanner.nextInt();
        n--;
        if (n >= 0 && n < 112) {
            return n;
        } else {
            return -1;
        }
    }

    static int atomicName(Scanner scanner) {
        System.out.print("Enter the Atomic Name you want to search for: ");
        String x = scanner.next();
        for (int i = 0; i < 112; i++) {
            if (x.equalsIgnoreCase(name[i])) {
                return i;
            }
        }
        return -1;
    }

    static int atomicSymbol(Scanner scanner) {
        System.out.print("Enter the Atomic Symbol you want to search for: ");
        String x = scanner.next();
        for (int i = 0; i < 112; i++) {
            if (x.equalsIgnoreCase(symbol[i])) {
                return i;
            }
        }
        return -1;
    }

    static int atomicWeight(Scanner scanner) {
        System.out.print("Enter the Atomic Weight you want to search for: ");
        double x = scanner.nextDouble();
        for (int i = 0; i < 112; i++) {
            if (weight[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static char block(int i) {
        i++;
        if (i == 2 || i == 10 || i == 18 || i == 36 || i == 54 || i == 86 || i == 118) {
            return 'P';
        } else if (i == 1 || (i >= 3 && i <= 4) || (i >= 11 && i <= 12) || (i >= 19 && i <= 20) || (i >= 37 && i <= 38) || (i >= 55 && i <= 56) || (i >= 87 && i <= 88)) {
            return 'S';
        } else if (i == 21 || i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 28 || i == 29 || i == 30 || i == 39 || i == 40 || i == 41 || i == 42 || i == 43 || i == 44 || i == 45 || i == 46 || i == 47 || i == 48 || i == 72 || i == 73 || i == 74 || i == 75 || i == 76 || i == 77 || i == 78 || i == 79 || i == 80 || i == 89 || i == 104 || i == 105 || i == 106 || i == 107 || i == 108 || i == 109) {
            return 'D';
        } else if (i == 58 || i == 59 || i == 60 || i == 61 || i == 62 || i == 63 || i == 64 || i == 65 || i == 66 || i == 67 || i == 68 || i == 69 || i == 70 || i == 71 || i == 90 || i == 91 || i == 92 || i == 93 || i == 94 || i == 95 || i == 96 || i == 97 || i == 98 || i == 99 || i == 100 || i == 101 || i == 102 || i == 103) {
            return 'F';
        } else {
            return '\0';
        }
    }

    static char property(int i) {
        i++;
        if (i == 1 || i == 2 || i == 7 || i == 8 || i == 9 || i == 10 || i == 15 || i == 16 || i == 17 || i == 18 || i == 34 || i == 35 || i == 36 || i == 53 || i == 54 || i == 86) {
            return 'N';
        } else if (i == 3 || i == 4 || i == 5 || i == 6 || i == 11 || i == 12 || i == 13 || i == 14 || i == 19 || i == 20 || i == 31 || i == 32 || i == 33 || i == 37 || i == 38 || i == 49 || i == 50 || i == 51 || i == 52 || i == 55 || i == 56 || i == 81 || i == 82 || i == 83 || i == 84 || i == 87 || i == 88 || i == 113 || i == 114 || i == 115 || i == 116) {
            return 'M';
        } else if (i == 21 || i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 28 || i == 29 || i == 30 || i == 39 || i == 40 || i == 41 || i == 42 || i == 43 || i == 44 || i == 45 || i == 46 || i == 47 || i == 48 || i == 57 || i == 72 || i == 73 || i == 74 || i == 75 || i == 76 || i == 77 || i == 78 || i == 79 || i == 80 || i == 89 || i == 104 || i == 105 || i == 106 || i == 107 || i == 108 || i == 109) {
            return 'T';
        } else if (i == 58 || i == 59 || i == 60 || i == 61 || i == 62 || i == 63 || i == 64 || i == 65 || i == 66 || i == 67 || i == 68 || i == 69 || i == 70 || i == 71 || i == 90 || i == 91 || i == 92 || i == 93 || i == 94 || i == 95 || i == 96 || i == 97 || i == 98 || i == 99 || i == 100 || i == 101 || i == 102 || i == 103) {
            return 'L';
        } else {
            return '\0';
        }
    }

    static void show(int i, char ch1, char ch2) {
        System.out.println("\nElement Name: " + name[i]);
        System.out.println("Atomic Symbol: " + symbol[i]);
        System.out.println("Atomic Weight: " + weight[i]);
        System.out.println("Block: " + ch1);
        System.out.println("Property: " + ch2);
    }
}
